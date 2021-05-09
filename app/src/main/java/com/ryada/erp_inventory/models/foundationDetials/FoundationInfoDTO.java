package com.ryada.erp_inventory.models.foundationDetials;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class FoundationInfoDTO implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	@SerializedName("address")
	private String address;

	@SerializedName("prefixName")
	private String prefixName;

	@SerializedName("phone")
	private String phone;

	@SerializedName("ownerName")
	private String ownerName;

	@SerializedName("ownerPhone")
	private String ownerPhone;

	@SerializedName("emailAddress")
	private String emailAddress;

	@SerializedName("website")
	private String website;

	@SerializedName("countOfCompanies")
	private int countOfCompanies;

	@SerializedName("registrationDate")
	private String registrationDate;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("deleteDate")
	private Object deleteDate;

	@SerializedName("deletedUserId")
	private Object deletedUserId;

	@SerializedName("companies")
	private List<CompaniesDTO> companies;

	@SerializedName("identityId")
	private Object identityId;

	@SerializedName("userName")
	private Object userName;

	@SerializedName("email")
	private Object email;

	@SerializedName("password")
	private Object password;

	@SerializedName("confirmPassword")
	private Object confirmPassword;

	@SerializedName("isSignedIn")
	private boolean isSignedIn;

	@SerializedName("lstFoundationAdmins")
	private List<LstFoundationAdminsDTO> lstFoundationAdmins;

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

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPrefixName(String prefixName){
		this.prefixName = prefixName;
	}

	public String getPrefixName(){
		return prefixName;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public void setOwnerPhone(String ownerPhone){
		this.ownerPhone = ownerPhone;
	}

	public String getOwnerPhone(){
		return ownerPhone;
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

	public void setCountOfCompanies(int countOfCompanies){
		this.countOfCompanies = countOfCompanies;
	}

	public int getCountOfCompanies(){
		return countOfCompanies;
	}

	public void setRegistrationDate(String registrationDate){
		this.registrationDate = registrationDate;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public void setDeleteDate(Object deleteDate){
		this.deleteDate = deleteDate;
	}

	public Object getDeleteDate(){
		return deleteDate;
	}

	public void setDeletedUserId(Object deletedUserId){
		this.deletedUserId = deletedUserId;
	}

	public Object getDeletedUserId(){
		return deletedUserId;
	}

	public void setCompanies(List<CompaniesDTO> companies){
		this.companies = companies;
	}

	public List<CompaniesDTO> getCompanies(){
		return companies;
	}

	public void setIdentityId(Object identityId){
		this.identityId = identityId;
	}

	public Object getIdentityId(){
		return identityId;
	}

	public void setUserName(Object userName){
		this.userName = userName;
	}

	public Object getUserName(){
		return userName;
	}

	public void setEmail(Object email){
		this.email = email;
	}

	public Object getEmail(){
		return email;
	}

	public void setPassword(Object password){
		this.password = password;
	}

	public Object getPassword(){
		return password;
	}

	public void setConfirmPassword(Object confirmPassword){
		this.confirmPassword = confirmPassword;
	}

	public Object getConfirmPassword(){
		return confirmPassword;
	}

	public void setIsSignedIn(boolean isSignedIn){
		this.isSignedIn = isSignedIn;
	}

	public boolean isIsSignedIn(){
		return isSignedIn;
	}

	public void setLstFoundationAdmins(List<LstFoundationAdminsDTO> lstFoundationAdmins){
		this.lstFoundationAdmins = lstFoundationAdmins;
	}

	public List<LstFoundationAdminsDTO> getLstFoundationAdmins(){
		return lstFoundationAdmins;
	}

	@Override
 	public String toString(){
		return 
			"FoundationInfoDTO{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",address = '" + address + '\'' + 
			",prefixName = '" + prefixName + '\'' + 
			",phone = '" + phone + '\'' + 
			",ownerName = '" + ownerName + '\'' + 
			",ownerPhone = '" + ownerPhone + '\'' + 
			",emailAddress = '" + emailAddress + '\'' + 
			",website = '" + website + '\'' + 
			",countOfCompanies = '" + countOfCompanies + '\'' + 
			",registrationDate = '" + registrationDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",deleteDate = '" + deleteDate + '\'' + 
			",deletedUserId = '" + deletedUserId + '\'' + 
			",companies = '" + companies + '\'' + 
			",identityId = '" + identityId + '\'' + 
			",userName = '" + userName + '\'' + 
			",email = '" + email + '\'' + 
			",password = '" + password + '\'' + 
			",confirmPassword = '" + confirmPassword + '\'' + 
			",isSignedIn = '" + isSignedIn + '\'' + 
			",lstFoundationAdmins = '" + lstFoundationAdmins + '\'' + 
			"}";
		}
}