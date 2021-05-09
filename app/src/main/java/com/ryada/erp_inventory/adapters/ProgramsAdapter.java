package com.ryada.erp_inventory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryada.erp_inventory.R;
import com.ryada.erp_inventory.models.branches.LstApplication;

import java.util.List;

public class ProgramsAdapter extends RecyclerView.Adapter<ProgramsAdapter.ProgramViewHolder> {


    List<LstApplication> applicationList;
    OnItemClick onItemClick;

    public void setApplicationList(List<LstApplication> applicationList) {
        this.applicationList = applicationList;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProgramViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_program, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder holder, int position) {
        LstApplication application = applicationList.get(position);
        holder.programNameTv.setText(application.getName());
        if (onItemClick != null)
            holder.itemView.setOnClickListener(v-> onItemClick.onProgramClick(position, application));
    }

    @Override
    public int getItemCount() {
        return applicationList!=null?applicationList.size():0;
    }

    public static class ProgramViewHolder extends RecyclerView.ViewHolder {
        TextView programNameTv;
        public ProgramViewHolder(@NonNull View itemView) {
            super(itemView);
            programNameTv = itemView.findViewById(R.id.program_item_name_tv);
        }
    }

    public interface OnItemClick {
        void onProgramClick(int position, LstApplication application);
    }
}
