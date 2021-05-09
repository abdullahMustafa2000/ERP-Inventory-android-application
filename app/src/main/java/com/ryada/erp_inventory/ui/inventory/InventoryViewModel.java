package com.ryada.erp_inventory.ui.inventory;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.apis.portInventory.InventoryApi;
import com.ryada.erp_inventory.apis.portInventory.InventoryDatabase;
import com.ryada.erp_inventory.models.LatestSalesModel.LatestSalesModel;
import com.ryada.erp_inventory.models.inventory.InventoryModel;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class InventoryViewModel extends AndroidViewModel {
    private static final String TAG = "InventoryViewModel";

    MutableLiveData<InventoryModel> inventoryModelMutableLiveData = new MutableLiveData<>();
    MutableLiveData<List<LatestSalesModel>> latestSalesModelMutableLiveData = new MutableLiveData<>();
    InventoryApi mService;
    CompositeDisposable disposable = new CompositeDisposable();

    public InventoryViewModel(@NonNull Application application) {
        super(application);
        mService = InventoryDatabase.getDatabaseApi().getApiService();
    }

    public void getInventory(String token, int branchId) {
        Single<InventoryModel> single = mService
                .getInventory(token, branchId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        disposable.add(single.subscribe(o-> inventoryModelMutableLiveData.setValue(o)
                , e-> Log.d(TAG, "getInventory: "+e.getMessage())));
    }


    public void getLatestSalesList(String token, int branchId) {
        Observable<List<LatestSalesModel>> observable = mService
                .getLatestSales(token, branchId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        disposable.add(observable.subscribe(o-> latestSalesModelMutableLiveData.setValue(o)
                , e-> checkError(e.getMessage())));
    }

    private void checkError(String message) {
        if (message.contains("401"))
            latestSalesModelMutableLiveData.setValue(null);
    }
}
