package com.ryada.erp_inventory.models.foundationDetials;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class LstFoundationAdminsDTO implements Serializable {

	@SerializedName("identityId")
	private String identityId;

	@SerializedName("userName")
	private String userName;

	@SerializedName("email")
	private String email;

	@SerializedName("password")
	private Object password;

	@SerializedName("confirmPassword")
	private Object confirmPassword;

	@SerializedName("foundationId")
	private int foundationId;

	@SerializedName("companyId")
	private int companyId;

	public void setIdentityId(String identityId){
		this.identityId = identityId;
	}

	public String getIdentityId(){
		return identityId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
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

	public void setFoundationId(int foundationId){
		this.foundationId = foundationId;
	}

	public int getFoundationId(){
		return foundationId;
	}

	public void setCompanyId(int companyId){
		this.companyId = companyId;
	}

	public int getCompanyId(){
		return companyId;
	}

	@Override
 	public String toString(){
		return 
			"LstFoundationAdminsDTO{" + 
			"identityId = '" + identityId + '\'' + 
			",userName = '" + userName + '\'' + 
			",email = '" + email + '\'' + 
			",password = '" + password + '\'' + 
			",confirmPassword = '" + confirmPassword + '\'' + 
			",foundationId = '" + foundationId + '\'' + 
			",companyId = '" + companyId + '\'' + 
			"}";
		}
}