package com.ryada.erp_inventory.localDb.Daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.ryada.erp_inventory.localDb.Tables.UserInfo;

@Dao
public interface UserDao {

    @Insert
    void newLogin(UserInfo userInfo);

    @Query("DELETE FROM user_info WHERE token = :userToken")
    void signOut(String userToken);
}
