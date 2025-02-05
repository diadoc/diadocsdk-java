package Diadoc.Api.auth;

import Diadoc.Api.auth.oidc.DiadocOidcCredentials;
import Diadoc.Api.auth.oidc.OidcAuthScheme;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.Credentials;

import java.util.Map;
import java.util.function.Supplier;

public class CredentialsSchemeFactory {

    private static final Map<Class<? extends Credentials>, Supplier<AuthScheme>> SCHEME_SUPPLIERS = Map.of(
            DiadocOidcCredentials.class, OidcAuthScheme::new,
            DiadocCredentials.class, DiadocAuthScheme::new
    );

    public AuthScheme createScheme(Credentials credentials) {
        Supplier<AuthScheme> schemeSupplier = SCHEME_SUPPLIERS.get(credentials.getClass());
        if (schemeSupplier == null) {
            throw new IllegalArgumentException("Unsupported credentials type: " + credentials.getClass().getName());
        }
        return schemeSupplier.get();
    }
}
