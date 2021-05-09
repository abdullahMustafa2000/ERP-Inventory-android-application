package com.ryada.erp_inventory.ui.companies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

public class CompaniesViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {
    /**
     * Creates a {@code AndroidViewModelFactory}
     *
     * @param application an application to pass in {@link AndroidViewModel}
     */
    public CompaniesViewModelFactory(@NonNull Application application) {
        super(application);
        new CompaniesViewModel(application);
    }
}
