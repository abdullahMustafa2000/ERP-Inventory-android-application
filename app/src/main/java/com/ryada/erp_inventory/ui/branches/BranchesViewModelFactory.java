package com.ryada.erp_inventory.ui.branches;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

public class BranchesViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {
    /**
     * Creates a {@code AndroidViewModelFactory}
     *
     * @param application an application to pass in {@link AndroidViewModel}
     */
    public BranchesViewModelFactory(@NonNull Application application) {
        super(application);
        new BranchesViewModel(application);
    }
}
