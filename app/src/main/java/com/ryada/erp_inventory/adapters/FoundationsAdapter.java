package com.ryada.erp_inventory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.models.foundationDetials.FoundationInfoDTO;

import java.util.List;

public class FoundationsAdapter extends RecyclerView.Adapter<FoundationsAdapter.FoundationViewHolder> {


    OnFoundationClickListener onClick;
    List<FoundationInfoDTO> foundationInfoList;

    public void setFoundationInfoList(List<FoundationInfoDTO> foundationInfoList) {
        this.foundationInfoList = foundationInfoList;
    }

    public void setOnClick(OnFoundationClickListener onClick) {
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public FoundationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoundationViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_foundation, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoundationViewHolder holder, int position) {
        FoundationInfoDTO foundation = foundationInfoList.get(position);

        holder.foundationNameTv.setText(foundation.getName());

        if (onClick != null)
            holder.itemView.setOnClickListener(v-> onClick.onFoundationClick(position, foundation));
    }

    @Override
    public int getItemCount() {
        return foundationInfoList!=null?foundationInfoList.size():0;
    }

    public static class FoundationViewHolder extends RecyclerView.ViewHolder {
        TextView foundationNameTv;
        public FoundationViewHolder(@NonNull View itemView) {
            super(itemView);
            foundationNameTv = itemView.findViewById(R.id.foundation_item_name_tv);
        }
    }

    public interface OnFoundationClickListener {
        void onFoundationClick(int position, FoundationInfoDTO model);
    }
}
