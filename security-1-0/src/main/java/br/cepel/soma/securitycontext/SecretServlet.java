package br.cepel.soma.securitycontext;

import javax.annotation.security.DeclareRoles;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/secretServlet")
@DeclareRoles({"admin", "user", "demo"})
@ServletSecurity(@HttpConstraint(rolesAllowed = "admin"))
public class SecretServlet extends HttpServlet { }
