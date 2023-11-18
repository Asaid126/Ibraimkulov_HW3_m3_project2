package com.example.ibraimkulov_hw3_project2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SeriesFragment extends Fragment {

    private RecyclerView rvSeries;
    private ArrayList<String> seriesList=new ArrayList<>();
    private SeriesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_series, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter=new SeriesAdapter(seriesList);
        rvSeries.setAdapter(adapter);
    }

    private void loadData() {
        seriesList.add("Дневники Вампира");
        seriesList.add("Собор у моря");
        seriesList.add("Меч");
        seriesList.add("Универ");
        seriesList.add("Доктор Хаус");
        seriesList.add("Шерлок");
        seriesList.add("Сельский детектив");
        seriesList.add("Широка река");
        seriesList.add("РиверДэйл");
        seriesList.add("ФорсМажоры");
        seriesList.add("Мажор");
        seriesList.add("Хрустальные вершины");
        seriesList.add("Хрустальный");
        seriesList.add("Декстер");
        seriesList.add("Сверхестественное");
        seriesList.add("Волчонок");
        seriesList.add("Пиннокио");
    }

    private void initView() {
        rvSeries=requireActivity().findViewById(R.id.rv_series);
    }
}