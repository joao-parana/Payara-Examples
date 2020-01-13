package br.cepel.soma.httpauthenticationmechanism;

import javax.annotation.security.DeclareRoles;
import javax.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@BasicAuthenticationMechanismDefinition(realmName = "user-realm")
@WebServlet("/user")
@DeclareRoles({"admin", "user", "demo"})
@ServletSecurity(@HttpConstraint(rolesAllowed = "user"))
public class UserServlet extends HttpServlet {

    // Servlet Code

}
