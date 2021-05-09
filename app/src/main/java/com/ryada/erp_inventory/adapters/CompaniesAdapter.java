package com.ryada.erp_inventory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.models.foundationDetials.CompaniesDTO;

import java.util.List;

public class CompaniesAdapter extends RecyclerView.Adapter<CompaniesAdapter.CompanyViewHolder> {


    OnCompanyClickListener onClick;
    List<CompaniesDTO> companiesDTOList;

    public void setCompaniesList(List<CompaniesDTO> companiesDTOList) {
        this.companiesDTOList = companiesDTOList;
        notifyDataSetChanged();
    }

    public void setOnClick(OnCompanyClickListener onClick) {
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CompanyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_company, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, int position) {
        CompaniesDTO companyData = companiesDTOList.get(position);
        holder.companyNameTv.setText(companyData.getName());
        holder.companyAddressTv.setText(companyData.getAddress());

        if (onClick != null)
            holder.itemView.setOnClickListener(v -> onClick.onCompanyClick(position, companyData));
    }

    @Override
    public int getItemCount() {
        return companiesDTOList!=null?companiesDTOList.size(): 0;
    }

    public static class CompanyViewHolder extends RecyclerView.ViewHolder {
        TextView companyNameTv, companyAddressTv;
        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            companyNameTv = itemView.findViewById(R.id.company_item_name_tv);
            companyAddressTv = itemView.findViewById(R.id.company_address_tv);
        }
    }

    public interface OnCompanyClickListener {
        void onCompanyClick(int position, CompaniesDTO company);
    }
}
