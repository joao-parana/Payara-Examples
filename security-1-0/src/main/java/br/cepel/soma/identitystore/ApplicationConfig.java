package br.cepel.soma.identitystore;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.security.enterprise.identitystore.DatabaseIdentityStoreDefinition;
import javax.security.enterprise.identitystore.PasswordHash;

@DatabaseIdentityStoreDefinition(
        dataSourceLookup = "${'java:global/permissions_db'}",
        callerQuery = "#{'select password from caller where name = ?'}",
        groupsQuery = "select group_name from caller_groups where caller_name = ?",
        hashAlgorithm = PasswordHash.class,
        priority = 10
)
@ApplicationScoped
@Named
public class ApplicationConfig {

    // Config code

}
