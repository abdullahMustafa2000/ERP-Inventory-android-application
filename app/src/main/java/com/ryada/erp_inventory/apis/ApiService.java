package com.ryada.erp_inventory.apis;


import com.ryada.erp_inventory.models.IdentityUser;
import com.ryada.erp_inventory.models.JsonResponse;
import com.ryada.erp_inventory.models.branches.BranchModel;
import com.ryada.erp_inventory.models.foundationDetials.CompaniesDTO;
import com.ryada.erp_inventory.models.foundationDetials.FoundationInfoDTO;
import com.ryada.erp_inventory.models.inventory.InventoryModel;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @POST("Account/Login")
    Single<JsonResponse> login(
            @Body IdentityUser user
    );


    @GET("Foundation/FoundationDetails")
    Single<FoundationInfoDTO> getFoundationInfo (
            @Header("Authorization") String token,
            @Query("id") int foundationId
    );

    @GET("Company/CompanyDetails")
    Single<CompaniesDTO> getCompanyDetails (
            @Header("Authorization") String token,
            @Query("Id") int companyId
    );

    @GET("Branch/BranchDetails")
    Single<BranchModel> getBranchDetails (
            @Header("Authorization") String token,
            @Query("Id") int BranchId
    );

    @GET("Admin/Foundations")
    Observable<List<FoundationInfoDTO>> getFoundationsList(
            @Header("Authorization") String token
    );

    @GET("Account/Logout")
    Single<String> logout();

}
