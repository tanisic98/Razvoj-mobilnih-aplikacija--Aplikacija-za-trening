package com.example.rmaprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRoutines,btnExercises,btnLogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();

    }
    public void setUI(){
        btnRoutines = findViewById(R.id.buttonRoutines);
        btnExercises = findViewById(R.id.buttonExercises);
        btnLogs = findViewById(R.id.buttonLogs);
    }




    }
