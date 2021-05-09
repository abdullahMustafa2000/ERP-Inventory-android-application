package com.ryada.erp_inventory.other;

import android.content.Context;

public class CheckInternet {

    Context context;

    public CheckInternet(Context context) {
        this.context = context;
    }

    public boolean isInternetConnected() {
        try {
            String command = "ping -c 1 google.com";
            return (Runtime.getRuntime().exec(command).waitFor() == 0);
        } catch (Exception e) {
            return false;
        }
    }
}
