package com.ryada.erp_inventory.localDb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.ryada.erp_inventory.localDb.Daos.UserDao;
import com.ryada.erp_inventory.localDb.Tables.UserInfo;

@Database(entities = {UserInfo.class}, version = 1, exportSchema = false)
public abstract class LocalDbManager extends RoomDatabase {

    public abstract UserDao getUserDao();
    static LocalDbManager mInstance;

    public static synchronized LocalDbManager getRoomDbInstance(Context context) {
        if (mInstance == null) {
            mInstance = Room
                    .databaseBuilder(context,
                            LocalDbManager.class,
                            "roomdb.db")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return mInstance;
    }

}
