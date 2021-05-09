package com.ryada.erp_inventory.ui.programs;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ProgramsViewModelFactory extends ViewModelProvider.AndroidViewModelFactory {
    /**
     * Creates a {@code AndroidViewModelFactory}
     *
     * @param application an application to pass in {@link AndroidViewModel}
     */
    public ProgramsViewModelFactory(@NonNull Application application) {
        super(application);
        new ProgramsViewModel(application);
    }
}
