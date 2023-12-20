package com.ameda.kevin.rolebasedauthenticationauthorization.config;
import com.google.common.collect.Sets;
import java.util.Set;

public enum UserRole {
    CONTRACTOR(Sets.newHashSet(
            UserPermission.CONTRACT_READ
    )),
    ADMIN(Sets.newHashSet(
            UserPermission.CONTRACT_READ,
            UserPermission.CONTRACT_WRITE)),
    ADMIN_TRAINEE(Sets.newHashSet(UserPermission.CONTRACT_READ));

    private final Set<UserPermission> permissions;
    UserRole(Set<UserPermission> permissions) {
        this.permissions=permissions;
    }
    public Set<UserPermission> getPermissions(){
        return permissions;
    }
}
