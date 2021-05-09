package com.ryada.erp_inventory.models.LatestSalesModel;

import java.util.List;

public class LatestSalesModel{
	private String delveringUserId;
	private String createUserId;
	private String orderNumber;
	private String outputDate;
	private Object packingUserId;
	private int orderTypeId;
	private String orderCategoryName;
	private String warehouseName;
	private String orderStatusName;
	private String goodsStagingName;
	private Object packingDate;
	private Object destPackingWarehouseId;
	private int orderStatusEnum;
	private int customerId;
	private int goodsStagingId;
	private Object deleteUserId;
	private int id;
	private List<LstSalesOrderItemsItem> lstSalesOrderItems;
	private String createDate;
	private String deleteDate;
	private int branchId;
	private int destOutputWarehouseId;
	private boolean isDelete;
	private String branchName;
	private String destOutputWarehouseName;
	private String orderTypeName;
	private int orderTypeEnum;
	private String destPackingWarehouseName;
	private int orderStatusId;
	private int totalOrderAmount;
	private int warehouseId;
	private String outputUserId;
	private String delveringDate;
	private int goodsStagingEnum;
	private int orderCategoryId;
	private String orderDate;
	private int orderCategory;

	public String getDelveringUserId(){
		return delveringUserId;
	}

	public String getCreateUserId(){
		return createUserId;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public String getOutputDate(){
		return outputDate;
	}

	public Object getPackingUserId(){
		return packingUserId;
	}

	public int getOrderTypeId(){
		return orderTypeId;
	}

	public String getOrderCategoryName(){
		return orderCategoryName;
	}

	public String getWarehouseName(){
		return warehouseName;
	}

	public String getOrderStatusName(){
		return orderStatusName;
	}

	public String getGoodsStagingName(){
		return goodsStagingName;
	}

	public Object getPackingDate(){
		return packingDate;
	}

	public Object getDestPackingWarehouseId(){
		return destPackingWarehouseId;
	}

	public int getOrderStatusEnum(){
		return orderStatusEnum;
	}

	public int getCustomerId(){
		return customerId;
	}

	public int getGoodsStagingId(){
		return goodsStagingId;
	}

	public Object getDeleteUserId(){
		return deleteUserId;
	}

	public int getId(){
		return id;
	}

	public List<LstSalesOrderItemsItem> getLstSalesOrderItems(){
		return lstSalesOrderItems;
	}

	public String getCreateDate(){
		return createDate;
	}

	public String getDeleteDate(){
		return deleteDate;
	}

	public int getBranchId(){
		return branchId;
	}

	public int getDestOutputWarehouseId(){
		return destOutputWarehouseId;
	}

	public boolean isIsDelete(){
		return isDelete;
	}

	public String getBranchName(){
		return branchName;
	}

	public String getDestOutputWarehouseName(){
		return destOutputWarehouseName;
	}

	public String getOrderTypeName(){
		return orderTypeName;
	}

	public int getOrderTypeEnum(){
		return orderTypeEnum;
	}

	public String getDestPackingWarehouseName(){
		return destPackingWarehouseName;
	}

	public int getOrderStatusId(){
		return orderStatusId;
	}

	public int getTotalOrderAmount(){
		return totalOrderAmount;
	}

	public int getWarehouseId(){
		return warehouseId;
	}

	public String getOutputUserId(){
		return outputUserId;
	}

	public String getDelveringDate(){
		return delveringDate;
	}

	public int getGoodsStagingEnum(){
		return goodsStagingEnum;
	}

	public int getOrderCategoryId(){
		return orderCategoryId;
	}

	public String getOrderDate(){
		return orderDate;
	}

	public int getOrderCategory(){
		return orderCategory;
	}

	@Override
 	public String toString(){
		return 
			"LatestSalesModel{" + 
			"delveringUserId = '" + delveringUserId + '\'' + 
			",createUserId = '" + createUserId + '\'' + 
			",orderNumber = '" + orderNumber + '\'' + 
			",outputDate = '" + outputDate + '\'' + 
			",packingUserId = '" + packingUserId + '\'' + 
			",orderTypeId = '" + orderTypeId + '\'' + 
			",orderCategoryName = '" + orderCategoryName + '\'' + 
			",warehouseName = '" + warehouseName + '\'' + 
			",orderStatusName = '" + orderStatusName + '\'' + 
			",goodsStagingName = '" + goodsStagingName + '\'' + 
			",packingDate = '" + packingDate + '\'' + 
			",destPackingWarehouseId = '" + destPackingWarehouseId + '\'' + 
			",orderStatusEnum = '" + orderStatusEnum + '\'' + 
			",customerId = '" + customerId + '\'' + 
			",goodsStagingId = '" + goodsStagingId + '\'' + 
			",deleteUserId = '" + deleteUserId + '\'' + 
			",id = '" + id + '\'' + 
			",lstSalesOrderItems = '" + lstSalesOrderItems + '\'' + 
			",createDate = '" + createDate + '\'' + 
			",deleteDate = '" + deleteDate + '\'' + 
			",branchId = '" + branchId + '\'' + 
			",destOutputWarehouseId = '" + destOutputWarehouseId + '\'' + 
			",isDelete = '" + isDelete + '\'' + 
			",branchName = '" + branchName + '\'' + 
			",destOutputWarehouseName = '" + destOutputWarehouseName + '\'' + 
			",orderTypeName = '" + orderTypeName + '\'' + 
			",orderTypeEnum = '" + orderTypeEnum + '\'' + 
			",destPackingWarehouseName = '" + destPackingWarehouseName + '\'' + 
			",orderStatusId = '" + orderStatusId + '\'' + 
			",totalOrderAmount = '" + totalOrderAmount + '\'' + 
			",warehouseId = '" + warehouseId + '\'' + 
			",outputUserId = '" + outputUserId + '\'' + 
			",delveringDate = '" + delveringDate + '\'' + 
			",goodsStagingEnum = '" + goodsStagingEnum + '\'' + 
			",orderCategoryId = '" + orderCategoryId + '\'' + 
			",orderDate = '" + orderDate + '\'' + 
			",orderCategory = '" + orderCategory + '\'' + 
			"}";
		}
}