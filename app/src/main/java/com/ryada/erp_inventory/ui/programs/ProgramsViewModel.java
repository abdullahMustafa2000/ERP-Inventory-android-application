package com.ryada.erp_inventory.ui.programs;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.models.branches.BranchModel;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ProgramsViewModel extends AndroidViewModel {
    private static final String TAG = "ProgramsViewModel";

    MutableLiveData<BranchModel> branchesMutableLiveData = new MutableLiveData<>();
    ApiService mService;
    CompositeDisposable disposable = new CompositeDisposable();
    public ProgramsViewModel(@NonNull Application application) {
        super(application);
        mService = WebDatabaseManager.getDatabaseApi().getApiService();
    }

    public void getBranch(String token, int branchId) {
        Single<BranchModel> single = mService
                .getBranchDetails(token, branchId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        disposable.add(single.subscribe(o-> branchesMutableLiveData.setValue(o)
                , e-> Log.d(TAG, "getBranch: "+e.getMessage())));
    }
}
