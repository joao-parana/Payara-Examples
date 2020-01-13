package br.cepel.soma.httpauthenticationmechanism;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import javax.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import javax.security.enterprise.authentication.mechanism.http.RememberMe;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStoreHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;
import java.util.TreeSet;

@RememberMe(
        cookieMaxAgeSeconds = 3600
)
@ApplicationScoped
public class CustomAuthenticationMechanism implements HttpAuthenticationMechanism {

    @Inject
    private IdentityStoreHandler idStoreHandler;

    @Override
    public AuthenticationStatus validateRequest(HttpServletRequest req, HttpServletResponse res, HttpMessageContext msg) {

        String username = ""; // ...get username from HttpRequest...
        String password = ""; //...get password from HttpRequest...

        // CredentialValidationResult result = idStoreHandler.validate(
        //      new UsernamePasswordCredential(username, password));
        Set<String> groups = new TreeSet<String>();
        groups.add("admin");
        groups.add("editor");
        groups.add("reader");
        groups.add("guest");
        CredentialValidationResult result = new CredentialValidationResult("pedro", groups);

        return msg.notifyContainerAboutLogin(result);
        // return msg.doNothing();
    }

}
