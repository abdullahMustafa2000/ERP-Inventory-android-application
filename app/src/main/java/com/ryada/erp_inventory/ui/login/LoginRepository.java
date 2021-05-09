package com.ryada.erp_inventory.ui.login;

import android.content.Context;

import com.ryada.erp_inventory.apis.ApiService;
import com.ryada.erp_inventory.apis.WebDatabaseManager;
import com.ryada.erp_inventory.localDb.Daos.UserDao;
import com.ryada.erp_inventory.localDb.LocalDbManager;
import com.ryada.erp_inventory.localDb.Tables.UserInfo;

public class LoginRepository {

    private final UserDao mUserDao;
    public LoginRepository(Context context) {
        WebDatabaseManager databaseManager = new WebDatabaseManager();
        ApiService mApiService = databaseManager.getApiService();
        mUserDao = LocalDbManager.getRoomDbInstance(context).getUserDao();
    }

    public void newUserInfo(UserInfo userInfo) {
        /*Completable.fromRunnable(() -> mUserDao.newLogin(userInfo))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());*/
    }
}
