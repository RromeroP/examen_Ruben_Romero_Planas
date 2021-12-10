package com.example.examen_ruben_romero_planas;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TrainingSeriesFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.training_series_fragment, container, false);

        ListView listView = view.findViewById(android.R.id.list);

        ArrayAdapter<Entrenament> adapter = new ArrayAdapter<Entrenament>(getContext(),
                android.R.layout.simple_list_item_1, Entrenament.entrenaments);

        listView.setAdapter(adapter);

        return view;

    }

    interface Listener {
        void itemClicked(long id);
    }
}
