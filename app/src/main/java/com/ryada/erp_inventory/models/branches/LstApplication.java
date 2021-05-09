
package com.ryada.erp_inventory.models.branches;

import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class LstApplication {

    @Expose
    private Object appname;
    @Expose
    private Long branchId;
    @Expose
    private Long companyId;
    @Expose
    private Long countOfDaysToExpire;
    @Expose
    private String description;
    @Expose
    private String expireDate;
    @Expose
    private Long id;
    @Expose
    private String imagePath;
    @Expose
    private Boolean isActive;
    @Expose
    private Boolean isExpired;
    @Expose
    private Boolean isSelected;
    @Expose
    private Boolean isTrial;
    @Expose
    private Object licenseKey;
    @Expose
    private String name;
    @Expose
    private Plan plan;
    @Expose
    private Long planId;
    @Expose
    private String registrationDate;
    @Expose
    private String url;

    public Object getAppname() {
        return appname;
    }

    public void setAppname(Object appname) {
        this.appname = appname;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCountOfDaysToExpire() {
        return countOfDaysToExpire;
    }

    public void setCountOfDaysToExpire(Long countOfDaysToExpire) {
        this.countOfDaysToExpire = countOfDaysToExpire;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getIsTrial() {
        return isTrial;
    }

    public void setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
    }

    public Object getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(Object licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
