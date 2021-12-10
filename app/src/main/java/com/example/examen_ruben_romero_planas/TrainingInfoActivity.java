package com.example.examen_ruben_romero_planas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TrainingInfoActivity extends AppCompatActivity {

    long programId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_info_activity);
    }

    public void setProgram(long id){
        this.programId = id;
    }
}