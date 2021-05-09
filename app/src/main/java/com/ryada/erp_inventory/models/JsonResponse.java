package com.ryada.erp_inventory.models;

public class JsonResponse {

    private String token;
    private String[] userRoles;
    private String expiration;
    private int[] userBranches;
    private int foundationId;
    private int companyId;

    public JsonResponse() {
    }

    public String getToken() {
        return "Bearer " +token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String[] getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String[] userRoles) {
        this.userRoles = userRoles;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int[] getUserBranches() {
        return userBranches;
    }

    public void setUserBranches(int[] userBranches) {
        this.userBranches = userBranches;
    }

    public int getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(int foundationId) {
        this.foundationId = foundationId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
