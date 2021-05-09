package com.ryada.erp_inventory.ui.login;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.localDb.Tables.UserInfo;
import com.ryada.erp_inventory.models.IdentityUser;
import com.ryada.erp_inventory.models.JsonResponse;
import com.ryada.erp_inventory.models.foundationDetials.CompaniesDTO;
import com.ryada.erp_inventory.models.foundationDetials.FoundationInfoDTO;
import com.ryada.erp_inventory.models.foundationDetials.LstFoundationAdminsDTO;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ryada.erp_inventory.other.StaticVariables.USER_TOKEN;

public class LoginViewModel extends AndroidViewModel {

    private static final String TAG = "LoginViewModel";
    MutableLiveData<JsonResponse> jsonResponseMutableLiveData = new MutableLiveData<>();
    MutableLiveData<FoundationInfoDTO> foundationInfoDTOMutableLiveData = new MutableLiveData<>();
    MutableLiveData<String> logoutMutableLiveData = new MutableLiveData<>();
    LoginRepository repository;
    ApiService mApiService;

    CompositeDisposable disposable = new CompositeDisposable();
    public LoginViewModel(@NonNull Application application) {
        super(application);
        repository =  new LoginRepository(application);
        mApiService = WebDatabaseManager.getDatabaseApi().getApiService();
    }

    public void checkUserIdentity(String userName, String password) {
        Single<JsonResponse> single = mApiService
                .login(new IdentityUser(userName, password))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        disposable.add(single.subscribe(o-> getResponse(o, new IdentityUser(userName, password))
                , e-> checkResponseError(e.getMessage())));
    }

    private void checkResponseError(String message) {
        if (message.contains("401"))
            jsonResponseMutableLiveData.setValue(null);
    }

    private void getResponse(JsonResponse response, IdentityUser user) {
        if (response != null) {
            // then check for user roles
            Log.d(TAG, "getResponse: "+response.getExpiration());
            jsonResponseMutableLiveData.setValue(response);
        } else {
            // then check for the error
            // internet connection maybe
            Log.d(TAG, "getResponse: response==NULL");
        }
    }
    private void setUserToLocalDb(JsonResponse response, IdentityUser user) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(user.getUserName());
        userInfo.setPassword(user.getPassword());
        userInfo.setToken(response.getToken());
        userInfo.setExpiration(response.getExpiration());
        /*repository.newUserInfo(userInfo);
        USER_TOKEN = response.getToken();*/
    }

    public void logout() {
        Single<String> stringSingle = mApiService
                .logout()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        stringSingle.subscribe(o-> logoutMutableLiveData.setValue(o), e-> Log.d(TAG, "logout: "+e.getMessage()));
    }
    public void getFoundationInfoDTO(String token, int foundationId) {
        Single<FoundationInfoDTO> single = mApiService
                .getFoundationInfo(token, foundationId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        single.subscribe(o-> foundationInfoDTOMutableLiveData.setValue(o)
                , e-> Log.d(TAG, "getFoundationInfoDTO: "+e.getMessage()));
    }

    MutableLiveData<CompaniesDTO> companiesDTOMutableLiveData = new MutableLiveData<>();

    public void getCompanyDetails(String token, int companyId) {
        Single<CompaniesDTO> singleCompany = mApiService
                .getCompanyDetails(token, companyId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        singleCompany.subscribe(o-> companiesDTOMutableLiveData.setValue(o)
                , e-> Log.d(TAG, "getCompanyDetails: "+e.getMessage()));
    }
    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
