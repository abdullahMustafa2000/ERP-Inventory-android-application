package com.ryada.erp_inventory.models.LatestSalesModel;

import java.util.List;

public class MeasurementUnits{
	private String symbol;
	private int basicMeasurementUnitId;
	private int companyId;
	private Object customized;
	private List<Object> companyMeasurementUnits;
	private boolean isCustomized;
	private String name;
	private boolean isSelected;
	private int id;
	private String signMath;
	private double countOfBasicUnits;

	public String getSymbol(){
		return symbol;
	}

	public int getBasicMeasurementUnitId(){
		return basicMeasurementUnitId;
	}

	public int getCompanyId(){
		return companyId;
	}

	public Object getCustomized(){
		return customized;
	}

	public List<Object> getCompanyMeasurementUnits(){
		return companyMeasurementUnits;
	}

	public boolean isIsCustomized(){
		return isCustomized;
	}

	public String getName(){
		return name;
	}

	public boolean isIsSelected(){
		return isSelected;
	}

	public int getId(){
		return id;
	}

	public String getSignMath(){
		return signMath;
	}

	public double getCountOfBasicUnits(){
		return countOfBasicUnits;
	}

	@Override
 	public String toString(){
		return 
			"MeasurementUnits{" + 
			"symbol = '" + symbol + '\'' + 
			",basicMeasurementUnitId = '" + basicMeasurementUnitId + '\'' + 
			",companyId = '" + companyId + '\'' + 
			",customized = '" + customized + '\'' + 
			",companyMeasurementUnits = '" + companyMeasurementUnits + '\'' + 
			",isCustomized = '" + isCustomized + '\'' + 
			",name = '" + name + '\'' + 
			",isSelected = '" + isSelected + '\'' + 
			",id = '" + id + '\'' + 
			",signMath = '" + signMath + '\'' + 
			",countOfBasicUnits = '" + countOfBasicUnits + '\'' + 
			"}";
		}
}