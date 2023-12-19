package com.ameda.kevin.rolebasedauthenticationauthorization.config;

public enum UserPermission {
    PROJECT_READ("project:read"),
    PROJECT_WRITE("project:write"),
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
