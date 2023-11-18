package com.example.ibraimkulov_hw3_project2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder> {
    private ArrayList<String> seriesList;

    public SeriesAdapter(ArrayList<String> seriesList) {
        this.seriesList = seriesList;
    }
    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SeriesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_series,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        holder.bind(seriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }
}
