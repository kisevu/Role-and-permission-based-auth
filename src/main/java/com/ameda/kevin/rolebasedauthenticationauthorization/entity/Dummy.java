package com.ameda.kevin.rolebasedauthenticationauthorization.entity;
public class Dummy {
    private final String name;
    private final String message;

    public Dummy(String name, String message){
        this.name=name;
        this.message=message;
    }
    public String  getName(){
        return name;
    }
    public String getMessage(){
        return message;
    }
}
