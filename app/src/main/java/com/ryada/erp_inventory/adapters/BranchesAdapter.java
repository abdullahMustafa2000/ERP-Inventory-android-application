package com.ryada.erp_inventory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.models.branches.BranchModel;

import java.util.List;

public class BranchesAdapter extends RecyclerView.Adapter<BranchesAdapter.BranchesViewHolder> {

    OnBranchClickListener onClick;
    List<BranchModel> branchesModelList;

    public void setBranchesModelList(List<BranchModel> branchesModelList) {
        this.branchesModelList = branchesModelList;
    }

    public void setOnClick(OnBranchClickListener onClick) {
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public BranchesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BranchesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_branch, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BranchesViewHolder holder, int position) {
        BranchModel branch = branchesModelList.get(position);

        holder.branchNameTv.setText(branch.getName());
        holder.branchAddressTv.setText(branch.getAddress());

        if (onClick != null)
            holder.itemView.setOnClickListener(v-> onClick.onBranchClick(position, branch));
    }

    @Override
    public int getItemCount() {
        return branchesModelList!=null?branchesModelList.size(): 0;
    }

    public static class BranchesViewHolder extends RecyclerView.ViewHolder {
        TextView branchNameTv, branchAddressTv;
        public BranchesViewHolder(@NonNull View itemView) {
            super(itemView);
            branchNameTv = itemView.findViewById(R.id.branch_item_name_tv);
            branchAddressTv = itemView.findViewById(R.id.branch_address_tv);
        }
    }

    public interface OnBranchClickListener {
        void onBranchClick(int position, BranchModel model);
    }
}
