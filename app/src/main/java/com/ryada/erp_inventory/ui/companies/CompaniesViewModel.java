package com.ryada.erp_inventory.ui.companies;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.models.foundationDetials.FoundationInfoDTO;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class CompaniesViewModel extends AndroidViewModel {
    private static final String TAG = "CompaniesViewModel";

    MutableLiveData<FoundationInfoDTO> foundationInfoDTOMutableLiveData = new MutableLiveData<>();
    CompositeDisposable disposable = new CompositeDisposable();
    ApiService mApiService;
    public CompaniesViewModel(@NonNull Application application) {
        super(application);
        mApiService = WebDatabaseManager.getDatabaseApi().getApiService();
    }

    public void getFoundationDetails(String token, int foundationId) {
        Single<FoundationInfoDTO> single = mApiService
                .getFoundationInfo(token, foundationId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        disposable.add(single.subscribe(o-> foundationInfoDTOMutableLiveData.setValue(o)
                , e-> Log.d(TAG, "getFoundationDetails error: "+e.getMessage())));
    }
}
