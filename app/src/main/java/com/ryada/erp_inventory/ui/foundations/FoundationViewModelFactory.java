package com.ryada.erp_inventory.ui.foundations;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

public class FoundationViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {
    /**
     * Creates a {@code AndroidViewModelFactory}
     *
     * @param application an application to pass in {@link AndroidViewModel}
     */
    public FoundationViewModelFactory(@NonNull Application application) {
        super(application);
        new FoundationsViewModel(application);
    }
}
