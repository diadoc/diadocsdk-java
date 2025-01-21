package Diadoc.Api;

import Diadoc.Api.crypt.exceptions.CertificateNotFoundException;
import Diadoc.Api.sign.GOSTSignInfoProvider;
import com.objsys.asn1j.runtime.*;
import org.apache.commons.codec.binary.Hex;
import ru.CryptoPro.JCP.ASN.CryptographicMessageSyntax.*;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.params.OID;

import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class CertificateHelper {

    private static final String STR_CMS_OID_DATA = "1.2.840.113549.1.7.1";
    private static final String STR_CMS_OID_SIGNED = "1.2.840.113549.1.7.2";

    public static byte[] createCMS(
            byte[] buffer,
            byte[] sign,
            Certificate cert,
            boolean detached,
            GOSTSignInfoProvider gostSignInfoProvider) throws Exception {
        final ContentInfo all = new ContentInfo();
        all.contentType = new Asn1ObjectIdentifier(new OID(STR_CMS_OID_SIGNED).value);
        final SignedData cms = new SignedData();
        all.content = cms;
        cms.version = new CMSVersion(1);
        // digest
        cms.digestAlgorithms = new DigestAlgorithmIdentifiers(1);
        final DigestAlgorithmIdentifier a = new DigestAlgorithmIdentifier(
                new OID(gostSignInfoProvider.getDigestOID()).value);
        a.parameters = new Asn1Null();
        cms.digestAlgorithms.elements[0] = a;
        if (detached) {
            cms.encapContentInfo = new EncapsulatedContentInfo(
                    new Asn1ObjectIdentifier(
                            new OID(STR_CMS_OID_DATA).value), null);
        } else {
            cms.encapContentInfo = new EncapsulatedContentInfo(
                    new Asn1ObjectIdentifier(
                            new OID(STR_CMS_OID_DATA).value),
                    new Asn1OctetString(buffer));
        }
        // certificate
        cms.certificates = new CertificateSet(1);
        final ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate certificate = new ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate();
        final Asn1BerDecodeBuffer decodeBuffer = new Asn1BerDecodeBuffer(
                cert.getEncoded());
        certificate.decode(decodeBuffer);
        cms.certificates.elements = new CertificateChoices[1];
        cms.certificates.elements[0] = new CertificateChoices();
        cms.certificates.elements[0].set_certificate(certificate);

        // signer info
        cms.signerInfos = new SignerInfos(1);
        cms.signerInfos.elements[0] = new SignerInfo();
        cms.signerInfos.elements[0].version = new CMSVersion(1);
        cms.signerInfos.elements[0].sid = new SignerIdentifier();

        final byte[] encodedName = ((X509Certificate) cert)
                .getIssuerX500Principal().getEncoded();
        final Asn1BerDecodeBuffer nameBuf = new Asn1BerDecodeBuffer(encodedName);
        final Name name = new Name();
        name.decode(nameBuf);

        final CertificateSerialNumber num = new CertificateSerialNumber(
                ((X509Certificate) cert).getSerialNumber());
        cms.signerInfos.elements[0].sid
                .set_issuerAndSerialNumber(new IssuerAndSerialNumber(name, num));
        cms.signerInfos.elements[0].digestAlgorithm = new DigestAlgorithmIdentifier(
                new OID(gostSignInfoProvider.getDigestOID()).value);
        cms.signerInfos.elements[0].digestAlgorithm.parameters = new Asn1Null();
        cms.signerInfos.elements[0].signatureAlgorithm = new SignatureAlgorithmIdentifier(
                new OID(gostSignInfoProvider.getSignOID()).value);
        cms.signerInfos.elements[0].signatureAlgorithm.parameters = new Asn1Null();
        cms.signerInfos.elements[0].signature = new SignatureValue(sign);
        // encode
        final Asn1BerEncodeBuffer asnBuf = new Asn1BerEncodeBuffer();
        all.encode(asnBuf, true);
        return asnBuf.getMsgCopy();
    }

    public static byte[] CMSSign(byte[] data, PrivateKey key, Certificate cert,
                                 boolean detached) throws Exception {
        // sign

        var signatureInfoProvider = new GOSTSignInfoProvider((X509Certificate) cert);
        final Signature signature = signatureInfoProvider.getSignatureInstance();

        signature.initSign(key);
        signature.update(data);
        final byte[] sign = signature.sign();
        // create cms format
        return createCMS(data, sign, cert, detached, signatureInfoProvider);
    }

    public static byte[] sign(X509Certificate cert, byte[] data) throws Exception {
        var privateKey = getPrivateKey(cert, null);
        return CMSSign(data, privateKey, cert, true);
    }

    public static PrivateKey getPrivateKey(X509Certificate cert, char[] password) {
        try {
            KeyStore keystore = KeyStore.getInstance("HDImageStore");
            keystore.load(null, null);
            for (Enumeration<String> en = keystore.aliases(); en.hasMoreElements(); ) {
                String s = en.nextElement();
                X509Certificate certificate = getCertificateByAlias(keystore, s);
                if (certificate != null && getThumbPrint(certificate).startsWith(getThumbPrint(cert)))
                    return (PrivateKey) keystore.getKey(s, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String CertificateToString(X509Certificate certificate) {
        String subject = certificate.getSubjectDN().getName();
        int cnStartIndex = subject.indexOf("CN=");
        if (cnStartIndex == -1) return subject;
        String commonName = subject.substring(cnStartIndex + 3);
        int commaIndex = commonName.indexOf(',');
        if (commaIndex == -1)
            commaIndex = commonName.indexOf(';');
        if (commaIndex == -1) return commonName;
        return commonName.substring(0, commaIndex);
    }

    public static String getThumbPrint(X509Certificate cert)
            throws NoSuchAlgorithmException, CertificateEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] der = cert.getEncoded();
        md.update(der);
        byte[] digest = md.digest();
        return new String(Hex.encodeHex(digest));
    }

    public static X509Certificate getCertificateByThumbprint(String thumbprint) throws CertificateNotFoundException {
        try {
            KeyStore keystore = KeyStore.getInstance("HDImageStore");
            keystore.load(null, null);
            for (Enumeration<String> en = keystore.aliases(); en.hasMoreElements(); ) {
                String alias = en.nextElement();
                X509Certificate cert = getCertificateByAlias(keystore, alias);
                if (cert != null && getThumbPrint(cert).startsWith(thumbprint)) {
                    return cert;
                }
            }
        } catch (Exception e) {
            throw new CertificateNotFoundException(
                    String.format("Error accessing keystore for thumbprint '%s'.", thumbprint), e
            );
        }
        throw new CertificateNotFoundException(
                String.format("Certificate with thumbprint '%s' not found.", thumbprint)
        );

    }

    public static List<X509Certificate> getCertificatesFromPersonalStore() {
        List<X509Certificate> certs = new ArrayList<X509Certificate>();
        try {
            KeyStore keystore = KeyStore.getInstance("HDImageStore");
            keystore.load(null, null);
            for (Enumeration<String> en = keystore.aliases(); en.hasMoreElements(); ) {
                String s = en.nextElement();
                X509Certificate certificate = getCertificateByAlias(keystore, s);
                if (certificate != null) {
                    certs.add(certificate);
                }
            }
            return certs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static X509Certificate getCertificateByAlias(KeyStore keystore, String alias) throws KeyStoreException {
        if (keystore.isKeyEntry(alias)) {
            Certificate kcerts[] = keystore.getCertificateChain(alias);
            if (kcerts.length > 0 && kcerts[0] instanceof X509Certificate) {
                return (X509Certificate) kcerts[0];

            }
        }
        if (keystore.isCertificateEntry(alias)) {
            Certificate c = keystore.getCertificate(alias);
            if (c instanceof X509Certificate) {
                return (X509Certificate) c;
            }
        }
        return null;
    }

    public static X509Certificate getCertificateFromBytes(byte[] bytes) throws CertificateException {
        CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
        return (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(bytes));
    }
}
