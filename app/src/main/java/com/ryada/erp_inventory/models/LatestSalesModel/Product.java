package com.ryada.erp_inventory.models.LatestSalesModel;

import java.util.List;

public class Product{
	private int warehouseProductGroupId;
	private double totalTotalBalance;
	private int pieceMeasurementUnitId;
	private double pieceBalance;
	private int productGroupId;
	private boolean isBarcodeGenerated;
	private boolean isActive;
	private int productCount;
	private Object warehouseName;
	private List<Object> products;
	private Object strProductCount;
	private double pieceSalePrice;
	private double totalSalePrice;
	private boolean isDeleted;
	private double totalPurchasePrice;
	private double totalTotalSalePrice;
	private int totalMeasurementUnitId;
	private boolean isSelected;
	private List<Object> lstProductSerials;
	private Object categories;
	private double maxPurchasePrice;
	private Object barcode;
	private int totalTotalMeasurementUnitId;
	private double minPurchasePrice;
	private String deleteDate;
	private String createdUserId;
	private int productId;
	private double totalTotalPurchasePrice;
	private double totalBalance;
	private String strCategories;
	private Object productImg;
	private Object productGroupName;
	private Object deletedUserId;
	private double standardPurchasePrice;
	private Object selectedCategoryIds;
	private int companyId;
	private double piecePurchasePrice;
	private boolean isHaveSerial;
	private String createdDate;
	private int onHandProductCount;
	private int warehouseId;
	private String imgPath;
	private double minPrice;
	private String name;
	private int selectedBalanceMeasurementUnitId;
	private double maxPrice;

	public int getWarehouseProductGroupId(){
		return warehouseProductGroupId;
	}

	public double getTotalTotalBalance(){
		return totalTotalBalance;
	}

	public int getPieceMeasurementUnitId(){
		return pieceMeasurementUnitId;
	}

	public double getPieceBalance(){
		return pieceBalance;
	}

	public int getProductGroupId(){
		return productGroupId;
	}

	public boolean isIsBarcodeGenerated(){
		return isBarcodeGenerated;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public int getProductCount(){
		return productCount;
	}

	public Object getWarehouseName(){
		return warehouseName;
	}

	public List<Object> getProducts(){
		return products;
	}

	public Object getStrProductCount(){
		return strProductCount;
	}

	public double getPieceSalePrice(){
		return pieceSalePrice;
	}

	public double getTotalSalePrice(){
		return totalSalePrice;
	}

	public boolean isIsDeleted(){
		return isDeleted;
	}

	public double getTotalPurchasePrice(){
		return totalPurchasePrice;
	}

	public double getTotalTotalSalePrice(){
		return totalTotalSalePrice;
	}

	public int getTotalMeasurementUnitId(){
		return totalMeasurementUnitId;
	}

	public boolean isIsSelected(){
		return isSelected;
	}

	public List<Object> getLstProductSerials(){
		return lstProductSerials;
	}

	public Object getCategories(){
		return categories;
	}

	public double getMaxPurchasePrice(){
		return maxPurchasePrice;
	}

	public Object getBarcode(){
		return barcode;
	}

	public int getTotalTotalMeasurementUnitId(){
		return totalTotalMeasurementUnitId;
	}

	public double getMinPurchasePrice(){
		return minPurchasePrice;
	}

	public String getDeleteDate(){
		return deleteDate;
	}

	public String getCreatedUserId(){
		return createdUserId;
	}

	public int getProductId(){
		return productId;
	}

	public double getTotalTotalPurchasePrice(){
		return totalTotalPurchasePrice;
	}

	public double getTotalBalance(){
		return totalBalance;
	}

	public String getStrCategories(){
		return strCategories;
	}

	public Object getProductImg(){
		return productImg;
	}

	public Object getProductGroupName(){
		return productGroupName;
	}

	public Object getDeletedUserId(){
		return deletedUserId;
	}

	public double getStandardPurchasePrice(){
		return standardPurchasePrice;
	}

	public Object getSelectedCategoryIds(){
		return selectedCategoryIds;
	}

	public int getCompanyId(){
		return companyId;
	}

	public double getPiecePurchasePrice(){
		return piecePurchasePrice;
	}

	public boolean isIsHaveSerial(){
		return isHaveSerial;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public int getOnHandProductCount(){
		return onHandProductCount;
	}

	public int getWarehouseId(){
		return warehouseId;
	}

	public String getImgPath(){
		return imgPath;
	}

	public double getMinPrice(){
		return minPrice;
	}

	public String getName(){
		return name;
	}

	public int getSelectedBalanceMeasurementUnitId(){
		return selectedBalanceMeasurementUnitId;
	}

	public double getMaxPrice(){
		return maxPrice;
	}

	@Override
 	public String toString(){
		return 
			"Product{" + 
			"warehouseProductGroupId = '" + warehouseProductGroupId + '\'' + 
			",totalTotalBalance = '" + totalTotalBalance + '\'' + 
			",pieceMeasurementUnitId = '" + pieceMeasurementUnitId + '\'' + 
			",pieceBalance = '" + pieceBalance + '\'' + 
			",productGroupId = '" + productGroupId + '\'' + 
			",isBarcodeGenerated = '" + isBarcodeGenerated + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",productCount = '" + productCount + '\'' + 
			",warehouseName = '" + warehouseName + '\'' + 
			",products = '" + products + '\'' + 
			",strProductCount = '" + strProductCount + '\'' + 
			",pieceSalePrice = '" + pieceSalePrice + '\'' + 
			",totalSalePrice = '" + totalSalePrice + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",totalPurchasePrice = '" + totalPurchasePrice + '\'' + 
			",totalTotalSalePrice = '" + totalTotalSalePrice + '\'' + 
			",totalMeasurementUnitId = '" + totalMeasurementUnitId + '\'' + 
			",isSelected = '" + isSelected + '\'' + 
			",lstProductSerials = '" + lstProductSerials + '\'' + 
			",categories = '" + categories + '\'' + 
			",maxPurchasePrice = '" + maxPurchasePrice + '\'' + 
			",barcode = '" + barcode + '\'' + 
			",totalTotalMeasurementUnitId = '" + totalTotalMeasurementUnitId + '\'' + 
			",minPurchasePrice = '" + minPurchasePrice + '\'' + 
			",deleteDate = '" + deleteDate + '\'' + 
			",createdUserId = '" + createdUserId + '\'' + 
			",productId = '" + productId + '\'' + 
			",totalTotalPurchasePrice = '" + totalTotalPurchasePrice + '\'' + 
			",totalBalance = '" + totalBalance + '\'' + 
			",strCategories = '" + strCategories + '\'' + 
			",productImg = '" + productImg + '\'' + 
			",productGroupName = '" + productGroupName + '\'' + 
			",deletedUserId = '" + deletedUserId + '\'' + 
			",standardPurchasePrice = '" + standardPurchasePrice + '\'' + 
			",selectedCategoryIds = '" + selectedCategoryIds + '\'' + 
			",companyId = '" + companyId + '\'' + 
			",piecePurchasePrice = '" + piecePurchasePrice + '\'' + 
			",isHaveSerial = '" + isHaveSerial + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",onHandProductCount = '" + onHandProductCount + '\'' + 
			",warehouseId = '" + warehouseId + '\'' + 
			",imgPath = '" + imgPath + '\'' + 
			",minPrice = '" + minPrice + '\'' + 
			",name = '" + name + '\'' + 
			",selectedBalanceMeasurementUnitId = '" + selectedBalanceMeasurementUnitId + '\'' + 
			",maxPrice = '" + maxPrice + '\'' + 
			"}";
		}
}