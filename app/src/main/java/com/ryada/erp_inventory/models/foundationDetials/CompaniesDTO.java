package com.ryada.erp_inventory.models.foundationDetials;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.ryada.erp_inventory.models.branches.BranchModel;

import java.io.Serializable;


public class CompaniesDTO implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	@SerializedName("prefixName")
	private String prefixName;

	@SerializedName("naturalOfWork")
	private String naturalOfWork;

	@SerializedName("address")
	private String address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("countOfEmployees")
	private String countOfEmployees;

	@SerializedName("countOfBranches")
	private int countOfBranches;

	@SerializedName("ceoName")
	private String ceoName;

	@SerializedName("ceoPhone")
	private String ceoPhone;

	@SerializedName("emailAddress")
	private String emailAddress;

	@SerializedName("website")
	private String website;

	@SerializedName("registrationDate")
	private String registrationDate;

	@SerializedName("registrationUserId")
	private String registrationUserId;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("isDeleted")
	private boolean isDeleted;

	@SerializedName("deletedUserId")
	private Object deletedUserId;

	@SerializedName("deleteDate")
	private String deleteDate;

	@SerializedName("foundationId")
	private int foundationId;

	@SerializedName("foundation")
	private Object foundation;

	@SerializedName("branches")
	private List<BranchModel> branches;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPrefixName(String prefixName){
		this.prefixName = prefixName;
	}

	public String getPrefixName(){
		return prefixName;
	}

	public void setNaturalOfWork(String naturalOfWork){
		this.naturalOfWork = naturalOfWork;
	}

	public String getNaturalOfWork(){
		return naturalOfWork;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setCountOfEmployees(String countOfEmployees){
		this.countOfEmployees = countOfEmployees;
	}

	public String getCountOfEmployees(){
		return countOfEmployees;
	}

	public void setCountOfBranches(int countOfBranches){
		this.countOfBranches = countOfBranches;
	}

	public int getCountOfBranches(){
		return countOfBranches;
	}

	public void setCeoName(String ceoName){
		this.ceoName = ceoName;
	}

	public String getCeoName(){
		return ceoName;
	}

	public void setCeoPhone(String ceoPhone){
		this.ceoPhone = ceoPhone;
	}

	public String getCeoPhone(){
		return ceoPhone;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public void setRegistrationUserId(String registrationUserId){
		this.registrationUserId = registrationUserId;
	}

	public String getRegistrationUserId(){
		return registrationUserId;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setIsDeleted(boolean isDeleted){
		this.isDeleted = isDeleted;
	}

	public boolean isIsDeleted(){
		return isDeleted;
	}

	public void setDeletedUserId(Object deletedUserId){
		this.deletedUserId = deletedUserId;
	}

	public Object getDeletedUserId(){
		return deletedUserId;
	}

	public void setDeleteDate(String deleteDate){
		this.deleteDate = deleteDate;
	}

	public String getDeleteDate(){
		return deleteDate;
	}

	public void setFoundationId(int foundationId){
		this.foundationId = foundationId;
	}

	public int getFoundationId(){
		return foundationId;
	}

	public void setFoundation(Object foundation){
		this.foundation = foundation;
	}

	public Object getFoundation(){
		return foundation;
	}

	public void setBranches(List<BranchModel> branches){
		this.branches = branches;
	}

	public List<BranchModel> getBranches(){
		return branches;
	}

	@Override
 	public String toString(){
		return 
			"CompaniesDTO{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",prefixName = '" + prefixName + '\'' + 
			",naturalOfWork = '" + naturalOfWork + '\'' + 
			",address = '" + address + '\'' + 
			",phone = '" + phone + '\'' + 
			",countOfEmployees = '" + countOfEmployees + '\'' + 
			",countOfBranches = '" + countOfBranches + '\'' + 
			",ceoName = '" + ceoName + '\'' + 
			",ceoPhone = '" + ceoPhone + '\'' + 
			",emailAddress = '" + emailAddress + '\'' + 
			",website = '" + website + '\'' + 
			",registrationDate = '" + registrationDate + '\'' + 
			",registrationUserId = '" + registrationUserId + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",deletedUserId = '" + deletedUserId + '\'' + 
			",deleteDate = '" + deleteDate + '\'' + 
			",foundationId = '" + foundationId + '\'' + 
			",foundation = '" + foundation + '\'' + 
			",branches = '" + branches + '\'' + 
			"}";
		}
}