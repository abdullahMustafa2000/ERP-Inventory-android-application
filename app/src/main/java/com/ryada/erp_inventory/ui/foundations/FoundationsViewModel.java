package com.ryada.erp_inventory.ui.foundations;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.models.foundationDetials.FoundationInfoDTO;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class FoundationsViewModel extends AndroidViewModel {

    private static final String TAG = "FoundationsViewModel";

    MutableLiveData<List<FoundationInfoDTO>> foundationsListMutableLiveData = new MutableLiveData<>();

    ApiService mService;
    CompositeDisposable disposable = new CompositeDisposable();

    public FoundationsViewModel(@NonNull Application application) {
        super(application);
        mService = WebDatabaseManager.getDatabaseApi().getApiService();
    }

    public void getAllFoundations(String token) {
        Observable<List<FoundationInfoDTO>> listObservable = mService
                .getFoundationsList(token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        disposable.add(listObservable
                .subscribe(o-> foundationsListMutableLiveData.setValue(o)
                        , e-> Log.d(TAG, "getAllFoundations: "+e.getMessage())));
    }
}
