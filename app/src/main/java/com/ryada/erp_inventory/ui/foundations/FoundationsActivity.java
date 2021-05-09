package com.ryada.erp_inventory.ui.foundations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.adapters.FoundationsAdapter;
import com.ryada.erp_inventory.databinding.ActivityFoundationsBinding;
import com.ryada.erp_inventory.ui.companies.CompaniesActivity;
import com.ryada.erp_inventory.ui.login.LoginActivity;

public class FoundationsActivity extends AppCompatActivity {

    FoundationsViewModel mViewModel;
    ActivityFoundationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_foundations);

        FoundationViewModelFactory factory = new FoundationViewModelFactory(getApplication());
        mViewModel = new ViewModelProvider(this, factory).get(FoundationsViewModel.class);

        Intent intent = getIntent();
        String token = intent.getStringExtra(LoginActivity.USER_TOKEN_INTENT);

        setData(token);
    }

    private void setData(String token) {
        FoundationsAdapter adapter = new FoundationsAdapter();
        binding.foundationsRv.setLayoutManager(new LinearLayoutManager(this));
        mViewModel.getAllFoundations(token);
        mViewModel.foundationsListMutableLiveData.observe(this, foundations -> {
            adapter.setFoundationInfoList(foundations);
            adapter.notifyDataSetChanged();
            binding.foundationsRv.setAdapter(adapter);
            adapter.setOnClick(((position, foundationModel) -> {
                startActivity(new Intent(this, CompaniesActivity.class)
                        .putExtra(LoginActivity.USER_TOKEN_INTENT, token)
                        .putExtra(LoginActivity.FOUNDATION_ID_INTENT, foundationModel.getId()));
            }));
        });
    }
}