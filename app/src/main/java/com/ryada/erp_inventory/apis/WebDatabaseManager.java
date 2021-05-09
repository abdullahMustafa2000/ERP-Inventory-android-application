package com.ryada.erp_inventory.apis;

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebDatabaseManager {

    private final ApiService apiService;
    private static final String URL = "http://198.38.92.189:5001/api/";
    public static WebDatabaseManager Instance;


    public WebDatabaseManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public static WebDatabaseManager getDatabaseApi() {
        if (Instance == null)
            Instance = new WebDatabaseManager();

        return Instance;
    }

    public ApiService getApiService() {
        return apiService;
    }
}
