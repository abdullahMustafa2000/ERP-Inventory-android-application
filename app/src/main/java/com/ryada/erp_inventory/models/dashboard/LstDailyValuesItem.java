package com.ryada.erp_inventory.models.dashboard;

public class LstDailyValuesItem{
	private int value;
	private String key;

	public int getValue(){
		return value;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"LstDailyValuesItem{" + 
			"value = '" + value + '\'' + 
			",key = '" + key + '\'' + 
			"}";
		}
}
