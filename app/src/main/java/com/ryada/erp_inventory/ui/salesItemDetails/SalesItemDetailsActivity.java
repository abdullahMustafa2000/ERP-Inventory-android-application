package com.ryada.erp_inventory.ui.salesItemDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.databinding.ActivitySalesItemDetailsBinding;
import com.ryada.erp_inventory.ui.inventory.InventoryActivity;

public class SalesItemDetailsActivity extends AppCompatActivity {

    ActivitySalesItemDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sales_item_details);
        setOrderDetails();
    }

    private void setOrderDetails() {
        Intent intent = getIntent();
        if (intent!=null) {
            binding.inventoryName.setText(intent.getStringExtra(InventoryActivity.INVENTORY_NAME_DATA_INTENT));
            binding.branchName.setText(intent.getStringExtra(InventoryActivity.BRANCH_NAME_DATA_INTENT));
            binding.orderDateTv.setText(intent.getStringExtra(InventoryActivity.ORDER_DATE_DATA_INTENT));
            binding.orderNo.setText(intent.getStringExtra(InventoryActivity.ORDER_NO_DATA_INTENT));
            binding.statusTitle.setText(intent.getStringExtra(InventoryActivity.GOOD_STAGING_DATA_INTENT));
            binding.orderType.setText(intent.getStringExtra(InventoryActivity.ORDER_TYPE_DATA_INTENT));
        }
    }
}