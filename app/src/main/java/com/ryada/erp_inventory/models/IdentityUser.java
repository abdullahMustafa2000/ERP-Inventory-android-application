package com.ryada.erp_inventory.models;

public class IdentityUser {

    String Password;
    String UserName;

    public IdentityUser( String userName, String password ) {
        Password = password;
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
