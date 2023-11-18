package com.example.ibraimkulov_hw3_project2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SeriesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName=itemView.findViewById(R.id.tv_name);
    }
    public void bind(String name){
        tvName.setText(name);
    }
}
