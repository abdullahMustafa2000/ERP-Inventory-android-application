package com.ryada.erp_inventory.models.LatestSalesModel;

public class LstSalesOrderItemsItem{
	private int salesOrderId;
	private double unitPrice;
	private int destOutputWarehouseProductGroupsId;
	private Product product;
	private String orderNumber;
	private int productId;
	private Object destOutputWarehouseProductGroupsName;
	private Object warehouseProductGroups;
	private int warehouseProductGroupsId;
	private double productCount;
	private Object salesOrder;
	private boolean isDeleted;
	private Object warehouseProductGroupsName;
	private Object destPackingWarehouseProductGroupsId;
	private Object deleteUserId;
	private int measurementUnitId;
	private Object lstProductSerials;
	private int id;
	private MeasurementUnits measurementUnits;
	private Object destPackingWarehouseProductGroupsName;
	private String deleteDate;

	public int getSalesOrderId(){
		return salesOrderId;
	}

	public double getUnitPrice(){
		return unitPrice;
	}

	public int getDestOutputWarehouseProductGroupsId(){
		return destOutputWarehouseProductGroupsId;
	}

	public Product getProduct(){
		return product;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public int getProductId(){
		return productId;
	}

	public Object getDestOutputWarehouseProductGroupsName(){
		return destOutputWarehouseProductGroupsName;
	}

	public Object getWarehouseProductGroups(){
		return warehouseProductGroups;
	}

	public int getWarehouseProductGroupsId(){
		return warehouseProductGroupsId;
	}

	public double getProductCount(){
		return productCount;
	}

	public Object getSalesOrder(){
		return salesOrder;
	}

	public boolean isIsDeleted(){
		return isDeleted;
	}

	public Object getWarehouseProductGroupsName(){
		return warehouseProductGroupsName;
	}

	public Object getDestPackingWarehouseProductGroupsId(){
		return destPackingWarehouseProductGroupsId;
	}

	public Object getDeleteUserId(){
		return deleteUserId;
	}

	public int getMeasurementUnitId(){
		return measurementUnitId;
	}

	public Object getLstProductSerials(){
		return lstProductSerials;
	}

	public int getId(){
		return id;
	}

	public MeasurementUnits getMeasurementUnits(){
		return measurementUnits;
	}

	public Object getDestPackingWarehouseProductGroupsName(){
		return destPackingWarehouseProductGroupsName;
	}

	public String getDeleteDate(){
		return deleteDate;
	}

	@Override
 	public String toString(){
		return 
			"LstSalesOrderItemsItem{" + 
			"salesOrderId = '" + salesOrderId + '\'' + 
			",unitPrice = '" + unitPrice + '\'' + 
			",destOutputWarehouseProductGroupsId = '" + destOutputWarehouseProductGroupsId + '\'' + 
			",product = '" + product + '\'' + 
			",orderNumber = '" + orderNumber + '\'' + 
			",productId = '" + productId + '\'' + 
			",destOutputWarehouseProductGroupsName = '" + destOutputWarehouseProductGroupsName + '\'' + 
			",warehouseProductGroups = '" + warehouseProductGroups + '\'' + 
			",warehouseProductGroupsId = '" + warehouseProductGroupsId + '\'' + 
			",productCount = '" + productCount + '\'' + 
			",salesOrder = '" + salesOrder + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",warehouseProductGroupsName = '" + warehouseProductGroupsName + '\'' + 
			",destPackingWarehouseProductGroupsId = '" + destPackingWarehouseProductGroupsId + '\'' + 
			",deleteUserId = '" + deleteUserId + '\'' + 
			",measurementUnitId = '" + measurementUnitId + '\'' + 
			",lstProductSerials = '" + lstProductSerials + '\'' + 
			",id = '" + id + '\'' + 
			",measurementUnits = '" + measurementUnits + '\'' + 
			",destPackingWarehouseProductGroupsName = '" + destPackingWarehouseProductGroupsName + '\'' + 
			",deleteDate = '" + deleteDate + '\'' + 
			"}";
		}
}
