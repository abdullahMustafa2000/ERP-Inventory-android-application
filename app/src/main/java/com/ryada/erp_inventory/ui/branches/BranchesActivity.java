package com.ryada.erp_inventory.ui.branches;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.adapters.BranchesAdapter;
import com.ryada.erp_inventory.databinding.ActivityBranchesBinding;
import com.ryada.erp_inventory.models.branches.BranchModel;
import com.ryada.erp_inventory.ui.companies.CompaniesActivity;
import com.ryada.erp_inventory.ui.programs.ProgramsActivity;

public class BranchesActivity extends AppCompatActivity {

    private BranchesViewModel mViewModel;
    private ActivityBranchesBinding binding;

    public static final String USER_TOKEN_INTENT = "com.ryada.erp_inventory.ui.branches.user_token";
    public static final String BRANCH_ID = "com.ryada.erp_inventory.ui.branches.branch_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = DataBindingUtil
                .setContentView(this, R.layout.activity_branches);

        Intent intent = getIntent();
        String token = intent.getStringExtra(CompaniesActivity.USER_TOKEN_INT);
        int companyId = intent.getIntExtra(CompaniesActivity.COMPANY_ID_INT, -1);
        String companyName = intent.getStringExtra(CompaniesActivity.COMPANY_NAME_INT);

        binding.companyTitleNameTv.setText(companyName);

        BranchesViewModelFactory factory = new BranchesViewModelFactory(getApplication());
        mViewModel = new ViewModelProvider(this, factory).get(BranchesViewModel.class);

        setData(token, companyId);
    }

    private void setData(String token, int companyId) {
        BranchesAdapter adapter = new BranchesAdapter();
        binding.branchesRv.setLayoutManager(new LinearLayoutManager(this));
        mViewModel.getAllBranches(token, companyId);
        mViewModel.companiesDTOMutableLiveData.observe(this, company-> {
            adapter.setBranchesModelList(company.getBranches());
            adapter.notifyDataSetChanged();
            binding.branchesRv.setAdapter(adapter);
            adapter.setOnClick((position, branchModel) -> {
                startActivity(new Intent(this, ProgramsActivity.class)
                        .putExtra(USER_TOKEN_INTENT, token)
                        .putExtra(BRANCH_ID, branchModel.getId()));
            });
        });
    }
}