package Diadoc.Api.crypt;

import Diadoc.Api.CertificateHelper;
import Diadoc.Api.crypt.exceptions.TokenDecryptException;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.Crypto.CryptoProvider;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.ContentInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.EnvelopedData;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.KeyTransRecipientInfo;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.RecipientInfo;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Parameters;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_KeyTransport;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.spec.GostCipherSpec;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import java.security.*;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class TokenDecryptManager {
    public static byte[] decryptToken(byte[] encryptedToken, X509Certificate currentCert) throws TokenDecryptException {
        try {
            ContentInfo contentInfo = new ContentInfo();
            decodeAsn1Bytes(contentInfo, encryptedToken);
            EnvelopedData cms = (EnvelopedData) contentInfo.content;
            KeyTransRecipientInfo recipientInfo = getKeyTransRecipientInfo(cms);
            GostR3410_KeyTransport encrKey = new GostR3410_KeyTransport();
            decodeAsn1Bytes(encrKey, recipientInfo.encryptedKey.value);
            byte[] encodedPub = encodeAsn1(encrKey.transportParameters.ephemeralPublicKey);
            X509EncodedKeySpec pspec = new X509EncodedKeySpec(encodedPub);
            KeyFactory kf = KeyFactory.getInstance(JCP.GOST_DH_2012_256_NAME);
            PublicKey senderPublic = kf.generatePublic(pspec);
            KeyAgreement responderKeyAgree = KeyAgreement.getInstance(JCP.GOST_DH_2012_256_NAME);
            byte[] sv = encrKey.transportParameters.ukm.value;
            PrivateKey privateKey = CertificateHelper.getPrivateKey(currentCert, null);
            responderKeyAgree.init(privateKey, new IvParameterSpec(sv));
            responderKeyAgree.doPhase(senderPublic, true);
            Key responderSecret = responderKeyAgree.generateSecret(CryptoProvider.GOST_CIPHER_NAME);
            byte[] wrappedSimmKey = encodeAsn1(encrKey.sessionEncryptedKey);
            Key simmKey = gostUnwrapKey(wrappedSimmKey, responderSecret);
            Gost28147_89_Parameters params = (Gost28147_89_Parameters) cms.encryptedContentInfo.contentEncryptionAlgorithm.parameters;
            byte[] iv = params.iv.value;
            AlgorithmParameterSpec spec = new GostCipherSpec(iv, CryptParamsSpec.getInstance());
            byte[] encryptedContent = cms.encryptedContentInfo.encryptedContent.value;
            return gostDecrypt(encryptedContent, simmKey, spec);
        } catch (InvalidKeySpecException
                | NoSuchAlgorithmException
                | Asn1Exception
                | InvalidKeyException
                | InvalidAlgorithmParameterException
                | NoSuchPaddingException
                | IOException
                | IllegalBlockSizeException
                | BadPaddingException e) {
            e.printStackTrace();
            throw new TokenDecryptException(e);
        }
    }

    private static Key gostUnwrapKey(byte[] wrappedKey, Key secretKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(CryptoProvider.GOST_CIPHER_NAME);
        cipher.init(Cipher.UNWRAP_MODE, secretKey);
        return cipher.unwrap(wrappedKey, null, Cipher.SECRET_KEY);
    }

    private static byte[] gostDecrypt(byte[] encryptedContent, Key simmKey, AlgorithmParameterSpec algorithmParameterSpec) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(CryptoProvider.GOST_CIPHER_NAME);
        cipher.init(Cipher.DECRYPT_MODE, simmKey, algorithmParameterSpec);
        return cipher.doFinal(encryptedContent, 0, encryptedContent.length);
    }

    private static byte[] encodeAsn1(Asn1Type obj) throws Asn1Exception {
        Asn1BerEncodeBuffer ebuf = new Asn1BerEncodeBuffer();
        obj.encode(ebuf);
        return ebuf.getMsgCopy();
    }

    private static void decodeAsn1Bytes(Asn1Type obj, byte[] bytes) throws IOException, Asn1Exception {
        Asn1BerDecodeBuffer dbuf = new Asn1BerDecodeBuffer(bytes);
        obj.decode(dbuf);
    }

    private static KeyTransRecipientInfo getKeyTransRecipientInfo(EnvelopedData cms) {
        for (RecipientInfo recipientInfo : cms.recipientInfos.elements) {
            if (recipientInfo.getChoiceID() == RecipientInfo._KTRI)
                return (KeyTransRecipientInfo) recipientInfo.getElement();
        }
        throw new RuntimeException("KeyTransRecipientInfo not found");
    }

}
