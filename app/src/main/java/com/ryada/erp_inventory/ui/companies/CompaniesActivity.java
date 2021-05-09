package com.ryada.erp_inventory.ui.companies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.ryada.erp_inventory.R;

import com.ryada.erp_inventory.adapters.CompaniesAdapter;
import com.ryada.erp_inventory.databinding.ActivityCompaniesBinding;

import com.ryada.erp_inventory.ui.branches.BranchesActivity;

import static com.ryada.erp_inventory.ui.login.LoginActivity.FOUNDATION_ID_INTENT;
import static com.ryada.erp_inventory.ui.login.LoginActivity.USER_TOKEN_INTENT;

public class CompaniesActivity extends AppCompatActivity {

    private CompaniesViewModel mViewModel;
    private ActivityCompaniesBinding binding;

    public static final String USER_TOKEN_INT = "com.ryada.erp_inventory.ui.companies.token";
    public static final String COMPANY_ID_INT = "com.ryada.erp_inventory.ui.companies.company_id";
    public static final String COMPANY_NAME_INT = "com.ryada.erp_inventory.ui.companies.company_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_companies);

        Intent intent = getIntent();
        String token = intent.getStringExtra(USER_TOKEN_INTENT);
        int foundationId = intent.getIntExtra(FOUNDATION_ID_INTENT, -1);
        CompaniesViewModelFactory factory = new CompaniesViewModelFactory(getApplication());
        mViewModel = new ViewModelProvider(this, factory).get(CompaniesViewModel.class);
        setData(token, foundationId);
    }

    private void setData(String token, int foundationId) {
        binding.companiesRv.setLayoutManager(new LinearLayoutManager(this));

        mViewModel.getFoundationDetails(token, foundationId);
        mViewModel.foundationInfoDTOMutableLiveData.observe(this, foundation -> {
            binding.foundationNameTv.setText(foundation.getName());
            CompaniesAdapter adapter = new CompaniesAdapter();
            adapter.setCompaniesList(foundation.getCompanies());
            adapter.notifyDataSetChanged();
            binding.companiesRv.setAdapter(adapter);
            adapter.setOnClick((position, company) -> {
                startActivity(new Intent(this, BranchesActivity.class)
                        .putExtra(USER_TOKEN_INT, token)
                        .putExtra(COMPANY_ID_INT, company.getId())
                        .putExtra(COMPANY_NAME_INT, company.getName()));
            });
        });
    }
}