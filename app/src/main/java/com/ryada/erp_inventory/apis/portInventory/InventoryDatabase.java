package com.ryada.erp_inventory.apis.portInventory;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InventoryDatabase {

    private final InventoryApi apiService;
    private static final String URL = "http://198.38.92.189:44378/api/";
    public static InventoryDatabase Instance;


    public InventoryDatabase() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(InventoryApi.class);
    }

    public static InventoryDatabase getDatabaseApi() {
        if (Instance == null)
            Instance = new InventoryDatabase();

        return Instance;
    }

    public InventoryApi getApiService() {
        return apiService;
    }
}
