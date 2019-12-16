package Diadoc.Api.sign;

import ru.CryptoPro.JCP.JCP;

import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.cert.X509Certificate;

public class GOSTSignInfoProvider {
    private GOSTSignType gostSignType;

    public GOSTSignInfoProvider(X509Certificate certificate) {
        gostSignType = getGOSTType(certificate);
    }

    public Signature getSignatureInstance() {
        try {
            if (gostSignType == GOSTSignType.GOST2001) {
                return Signature.getInstance(JCP.GOST_EL_SIGN_NAME);
            }
            if (gostSignType == GOSTSignType.GOST2012) {
                return Signature.getInstance(JCP.GOST_SIGN_2012_256_NAME);
            }
        } catch (NoSuchAlgorithmException ignored) {
        }
        throw new IllegalStateException("Invalid gostSignType");
    }

    public String getDigestOID() {
        if (gostSignType == GOSTSignType.GOST2001) {
            return JCP.GOST_DIGEST_OID;
        }
        if (gostSignType == GOSTSignType.GOST2012) {
            return JCP.GOST_DIGEST_2012_256_OID;
        }

        throw new IllegalStateException("Invalid gostSignType");
    }

    public String getSignOID() {
        if (gostSignType == GOSTSignType.GOST2001) {
            return JCP.GOST_EL_KEY_OID;
        }
        if (gostSignType == GOSTSignType.GOST2012) {
            return JCP.GOST_PARAMS_SIG_2012_256_KEY_OID;
        }

        throw new IllegalStateException("Invalid gostSignType");
    }

    private GOSTSignType getGOSTType(X509Certificate cert) {
        if (cert.getSigAlgOID().equals("1.2.643.2.2.3")) {
            return GOSTSignType.GOST2001;
        }
        if (cert.getSigAlgOID().equals("1.2.643.7.1.1.3.2")) {
            return GOSTSignType.GOST2012;
        }

        throw new IllegalArgumentException(String.format("OID %s not supported", cert.getSigAlgOID()));
    }
}

