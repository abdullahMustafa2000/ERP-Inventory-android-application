package com.ryada.erp_inventory.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.models.LatestSalesModel.LatestSalesModel;

import java.util.List;

public class LatestSalesOrdersAdapter extends RecyclerView.Adapter<LatestSalesOrdersAdapter.LatestOrdersViewHolder> {


    List<LatestSalesModel> latestSalesModels;
    OnItemClickListener onItemClickListener;
    public void setLatestSalesModels(List<LatestSalesModel> latestSalesModels) {
        this.latestSalesModels = latestSalesModels;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public LatestOrdersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LatestOrdersViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_latest_sales, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull LatestOrdersViewHolder holder, int position) {
        LatestSalesModel salesModel = latestSalesModels.get(position);
        holder.orderDataTv.setText((String.valueOf(salesModel.getOrderCategoryId())));
        holder.orderDateDataTv.setText(salesModel.getOrderDate());
        holder.orderStatusDataTv.setText(salesModel.getOrderStatusName());
        holder.stagingDataTv.setText(salesModel.getGoodsStagingName());
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.parseColor("#121212"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#1d1d1d"));
        }

        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener(v-> onItemClickListener.onSalesItemClick(salesModel));
        }
    }

    @Override
    public int getItemCount() {
        return latestSalesModels!=null?latestSalesModels.size():0;
    }

    public static class LatestOrdersViewHolder extends RecyclerView.ViewHolder {
        TextView orderDataTv, orderStatusDataTv, orderDateDataTv, stagingDataTv;
        public LatestOrdersViewHolder(@NonNull View itemView) {
            super(itemView);
            orderDataTv = itemView.findViewById(R.id.order_data_item);
            orderStatusDataTv = itemView.findViewById(R.id.order_status_data_item);
            orderDateDataTv = itemView.findViewById(R.id.order_date_data_item);
            stagingDataTv = itemView.findViewById(R.id.staging_data_item);
        }
    }

    public interface OnItemClickListener {
        void onSalesItemClick(LatestSalesModel salesItem);
    }
}
