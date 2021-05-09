package com.ryada.erp_inventory.models.dashboard;

import java.util.List;

public class DashboardModel{
	private List<LstDailyValuesItem> lstDailyValues;
	private List<LstAnnualValuesItem> lstAnnualValues;
	private List<LstMonthlyValuesItem> lstMonthlyValues;

	public List<LstDailyValuesItem> getLstDailyValues(){
		return lstDailyValues;
	}

	public List<LstAnnualValuesItem> getLstAnnualValues(){
		return lstAnnualValues;
	}

	public List<LstMonthlyValuesItem> getLstMonthlyValues(){
		return lstMonthlyValues;
	}

	@Override
 	public String toString(){
		return 
			"DashboardModel{" + 
			"lstDailyValues = '" + lstDailyValues + '\'' + 
			",lstAnnualValues = '" + lstAnnualValues + '\'' + 
			",lstMonthlyValues = '" + lstMonthlyValues + '\'' + 
			"}";
		}
}