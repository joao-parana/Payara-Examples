package br.cepel.soma.identitystore;

import javax.annotation.security.DeclareRoles;
import javax.security.enterprise.identitystore.LdapIdentityStoreDefinition;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@LdapIdentityStoreDefinition(
        url = "ldap://localhost:33389/",
        callerBaseDn = "ou=caller,dc=jsr375,dc=net",
        groupSearchBase = "ou=group,dc=jsr375,dc=net"
)
@DeclareRoles({"admin", "user", "demo"})
@WebServlet("/admin-other")
public class AdminServlet extends HttpServlet {

    // Servlet Code

}
