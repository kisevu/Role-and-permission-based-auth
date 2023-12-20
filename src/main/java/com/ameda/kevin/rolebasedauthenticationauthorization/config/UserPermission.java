package com.ameda.kevin.rolebasedauthenticationauthorization.config;

public enum UserPermission {
    CONTRACT_READ("contract:read"),
    CONTRACT_WRITE("contract:write");
    private final String permission;
    UserPermission(String permission) {
        this.permission = permission;
    }
    public String getPermission(){
        return permission;
    }

}
