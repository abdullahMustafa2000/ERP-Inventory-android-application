package com.ryada.erp_inventory.ui.branches;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.models.foundationDetials.CompaniesDTO;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class BranchesViewModel extends AndroidViewModel {

    private static final String TAG = "BranchesViewModel";

    MutableLiveData<CompaniesDTO> companiesDTOMutableLiveData = new MutableLiveData<>();
    ApiService mApiService;
    CompositeDisposable disposable = new CompositeDisposable();
    public BranchesViewModel(@NonNull Application application) {
        super(application);
        mApiService = WebDatabaseManager.getDatabaseApi().getApiService();
    }

    public void getAllBranches(String token, int companyId) {
        Single<CompaniesDTO> single = mApiService
                .getCompanyDetails(token, companyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        disposable.add(single.subscribe(o-> companiesDTOMutableLiveData.setValue(o)
                ,e-> Log.d(TAG, "getAllBranches: "+e.getMessage())));
    }
}
