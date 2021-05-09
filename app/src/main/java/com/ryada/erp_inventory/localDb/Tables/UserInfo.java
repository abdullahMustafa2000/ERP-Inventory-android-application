package com.ryada.erp_inventory.localDb.Tables;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_info")
public class UserInfo {

    @PrimaryKey(autoGenerate = true)
    public int key;

    private String userName;
    private String password;
    private String token;
    private String roles;
    private String expiration;

    public UserInfo() {
    }

    @Ignore
    public UserInfo(String userName, String password, String token, String roles, String expiration) {
        this.userName = userName;
        this.password = password;
        this.token = token;
        this.roles = roles;
        this.expiration = expiration;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
