package com.ryada.erp_inventory.ui.inventory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.adapters.LatestSalesOrdersAdapter;
import com.ryada.erp_inventory.databinding.ActivityInventoryBinding;
import com.ryada.erp_inventory.models.LatestSalesModel.LatestSalesModel;
import com.ryada.erp_inventory.ui.programs.ProgramsActivity;
import com.ryada.erp_inventory.ui.salesItemDetails.SalesItemDetailsActivity;

public class InventoryActivity extends AppCompatActivity {

    private static final String TAG = "InventoryActivity";

    public static final String ORDER_NO_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.ORDER_NO_DATA_INTENT";
    public static final String ORDER_DATE_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.ORDER_DATE_DATA_INTENT";
    public static final String BRANCH_NAME_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.BRANCH_NAME_DATA_INTENT";
    public static final String INVENTORY_NAME_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.INVENTORY_NAME_DATA_INTENT";
    public static final String ORDER_TYPE_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.ORDER_TYPE_DATA_INTENT";
    public static final String GOOD_STAGING_DATA_INTENT = "com.ryada.erp_inventory.ui.inventory.GOOD_STAGING_DATA_INTENT";

    InventoryViewModel mViewModel;
    ActivityInventoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_inventory);

        InventoryViewModelFactory factory = new InventoryViewModelFactory(getApplication());
        mViewModel = new ViewModelProvider(this, factory).get(InventoryViewModel.class);
        Intent intent = getIntent();
        String token = intent.getStringExtra(ProgramsActivity.USER_TOKEN_INTENT);
        int branchId = intent.getIntExtra(ProgramsActivity.BRANCH_ID_INTENT, -1);
        setData(token, branchId);

        binding.graphDashboardLink.setOnClickListener(v-> startDashboard(token, branchId));

        binding.latestSalesOpener.setOnClickListener(v-> {
            if (binding.latestSalesView.getVisibility() == View.VISIBLE) {
                binding.latestSalesView.setVisibility(View.GONE);
                binding.showMoreIv.setImageResource(R.drawable.ic_show_more);
            } else {
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.latest_sales_anim);
                binding.latestSalesView.setAnimation(animation);
                binding.latestSalesView.setVisibility(View.VISIBLE);
                binding.showMoreIv.setImageResource(R.drawable.ic_show_less);
            }
        });

    }

    private void startDashboard(String token, long branchId) {

    }

    private void setData(String token, int branchId) {
        setInventoryData(token, branchId);
        setLatestSalesOrders(token, branchId);
    }

    private void setLatestSalesOrders(String token, int branchId) {
        LatestSalesOrdersAdapter adapter = new LatestSalesOrdersAdapter();
        binding.latestSalesRv.setLayoutManager(new LinearLayoutManager(this));
        mViewModel.getLatestSalesList(token, branchId);
        mViewModel.latestSalesModelMutableLiveData.observe(this, latestSalesList -> {
            if (latestSalesList != null) {
                adapter.setLatestSalesModels(latestSalesList);
                adapter.notifyDataSetChanged();
                binding.latestSalesRv.setAdapter(adapter);
                adapter.setOnItemClickListener(this::startItemSalesDetails);
            }
        });
    }

    private void startItemSalesDetails(LatestSalesModel salesItem) {
        Intent intent = new Intent(this, SalesItemDetailsActivity.class);
        intent.putExtra(ORDER_NO_DATA_INTENT, salesItem.getOrderNumber());
        intent.putExtra(ORDER_DATE_DATA_INTENT, salesItem.getOrderDate());
        intent.putExtra(BRANCH_NAME_DATA_INTENT, salesItem.getBranchName());
        intent.putExtra(INVENTORY_NAME_DATA_INTENT, salesItem.getDestOutputWarehouseName());
        intent.putExtra(ORDER_TYPE_DATA_INTENT, salesItem.getOrderTypeName());
        intent.putExtra(GOOD_STAGING_DATA_INTENT, salesItem.getGoodsStagingName());
        startActivity(intent);
    }

    public void setInventoryData(String token, int branchId) {
        mViewModel.getInventory(token, branchId);
        mViewModel.inventoryModelMutableLiveData.observe(this, inventoryData -> {
            setCardsValue(inventoryData.getStandardInventoryValue()
                    , inventoryData.getCountOfOpenedSalesOrders(),
                    inventoryData.getCountOfOpenedPurchaseOrders(),
                    inventoryData.getCountOfUnusedGroups());
        });
    }

    public void setCardsValue(Long inventoryVal, Long openedSales, Long openedPurchase, Long unUsedGroups) {
        @SuppressLint("DefaultLocale") String inventoryValue = String.format("%d", inventoryVal);
        @SuppressLint("DefaultLocale") String openedSalesOrders = String.format("%d", openedSales);
        @SuppressLint("DefaultLocale") String openedPurchaseOrders = String.format("%d", openedPurchase);
        @SuppressLint("DefaultLocale") String unusedGroups = String.format("%d", unUsedGroups);

        binding.inventoryValueData.setText(inventoryValue);
        binding.openedSalesData.setText(openedSalesOrders);
        binding.openPurchaseOrderData.setText(openedPurchaseOrders);
        binding.unusedGroupsData.setText(unusedGroups);
    }
}