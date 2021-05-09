
package com.ryada.erp_inventory.models.inventory;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class InventoryModel {

    @SerializedName("countOfOpenedPurchaseOrders")
    private Long mCountOfOpenedPurchaseOrders;
    @SerializedName("countOfOpenedSalesOrders")
    private Long mCountOfOpenedSalesOrders;
    @SerializedName("countOfProducts")
    private Long mCountOfProducts;
    @SerializedName("countOfUnusedGroups")
    private Long mCountOfUnusedGroups;
    @SerializedName("standardInventoryValue")
    private Long mStandardInventoryValue;

    public Long getCountOfOpenedPurchaseOrders() {
        return mCountOfOpenedPurchaseOrders;
    }

    public void setCountOfOpenedPurchaseOrders(Long countOfOpenedPurchaseOrders) {
        mCountOfOpenedPurchaseOrders = countOfOpenedPurchaseOrders;
    }

    public Long getCountOfOpenedSalesOrders() {
        return mCountOfOpenedSalesOrders;
    }

    public void setCountOfOpenedSalesOrders(Long countOfOpenedSalesOrders) {
        mCountOfOpenedSalesOrders = countOfOpenedSalesOrders;
    }

    public Long getCountOfProducts() {
        return mCountOfProducts;
    }

    public void setCountOfProducts(Long countOfProducts) {
        mCountOfProducts = countOfProducts;
    }

    public Long getCountOfUnusedGroups() {
        return mCountOfUnusedGroups;
    }

    public void setCountOfUnusedGroups(Long countOfUnusedGroups) {
        mCountOfUnusedGroups = countOfUnusedGroups;
    }

    public Long getStandardInventoryValue() {
        return mStandardInventoryValue;
    }

    public void setStandardInventoryValue(Long standardInventoryValue) {
        mStandardInventoryValue = standardInventoryValue;
    }

}
