package com.ryada.erp_inventory.ui.programs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.adapters.ProgramsAdapter;
import com.ryada.erp_inventory.databinding.ActivityProgramsBinding;
import com.ryada.erp_inventory.ui.branches.BranchesActivity;
import com.ryada.erp_inventory.ui.inventory.InventoryActivity;

public class ProgramsActivity extends AppCompatActivity {

    private static final String TAG = "ProgramsActivity";

    ActivityProgramsBinding binding;
    ProgramsViewModel mViewModel;

    public static final String BRANCH_ID_INTENT = "com.ryada.erp_inventory.ui.programs.branch_id";
    public static final String USER_TOKEN_INTENT = "com.ryada.erp_inventory.ui.programs.user_token";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_programs);

        ProgramsViewModelFactory factory = new ProgramsViewModelFactory(getApplication());
        mViewModel = new ViewModelProvider(this, factory).get(ProgramsViewModel.class);

        Intent intent = getIntent();
        String token = intent.getStringExtra(BranchesActivity.USER_TOKEN_INTENT);
        int branchId = intent.getIntExtra(BranchesActivity.BRANCH_ID, -1);
        setData(token, branchId);

    }

    private void setData(String token, int branchId) {
        ProgramsAdapter adapter = new ProgramsAdapter();
        binding.branchesRv.setLayoutManager(new LinearLayoutManager(this));
        mViewModel.getBranch(token, branchId);
        mViewModel.branchesMutableLiveData.observe(this, branchModel -> {
            binding.branchNameTv.setText(branchModel.getName());
            adapter.setApplicationList(branchModel.getLstApplications());
            adapter.notifyDataSetChanged();
            binding.branchesRv.setAdapter(adapter);
            adapter.setOnItemClick(((position, application) -> {
                if (application.getId() == 1) {
                    startActivity(new Intent(this, InventoryActivity.class)
                            .putExtra(USER_TOKEN_INTENT, token)
                            .putExtra(BRANCH_ID_INTENT, branchModel.getId()));
                }
            }));
        });
    }
}