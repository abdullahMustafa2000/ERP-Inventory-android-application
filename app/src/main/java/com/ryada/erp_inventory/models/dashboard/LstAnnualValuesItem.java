package com.ryada.erp_inventory.models.dashboard;

public class LstAnnualValuesItem{
	private double value;
	private String key;

	public double getValue(){
		return value;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"LstAnnualValuesItem{" + 
			"value = '" + value + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}
