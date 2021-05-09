
package com.ryada.erp_inventory.models.branches;

import java.util.List;
import com.google.gson.annotations.Expose;

@SuppressWarnings("unused")
public class BranchModel {

    @Expose
    private String address;
    @Expose
    private Object company;
    @Expose
    private Long companyId;
    @Expose
    private String createdDate;
    @Expose
    private String createdUserId;
    @Expose
    private String deleteDate;
    @Expose
    private Object deletedUserId;
    @Expose
    private String emailAddress;
    @Expose
    private int id;
    @Expose
    private Boolean isActive;
    @Expose
    private Boolean isDeleted;
    @Expose
    private Boolean isSelected;
    @Expose
    private List<LstApplication> lstApplications;
    @Expose
    private String name;
    @Expose
    private String phone;
    @Expose
    private Object prefix;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Object getDeletedUserId() {
        return deletedUserId;
    }

    public void setDeletedUserId(Object deletedUserId) {
        this.deletedUserId = deletedUserId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public List<LstApplication> getLstApplications() {
        return lstApplications;
    }

    public void setLstApplications(List<LstApplication> lstApplications) {
        this.lstApplications = lstApplications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getPrefix() {
        return prefix;
    }

    public void setPrefix(Object prefix) {
        this.prefix = prefix;
    }

}
