package com.ryada.erp_inventory.apis.portInventory;

import com.ryada.erp_inventory.models.LatestSalesModel.LatestSalesModel;
import com.ryada.erp_inventory.models.inventory.InventoryModel;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface InventoryApi {

    @GET("CommonStatisticals/CommonStatisticals")
    Single<InventoryModel> getInventory(
            @Header("Authorization") String token,
            @Query("branchId") int BranchId
    );

    @GET("SalesStatiticals/LatestSalesOrders")
    Observable<List<LatestSalesModel>> getLatestSales(
            @Header("Authorization") String token,
            @Query("branchId") int BranchId
    );
}
