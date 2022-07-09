package com.example.textmessageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //Button btnSend = findViewById(R.id.btnSend);
        Spinner spnDays = findViewById(R.id.spinner);
        String[] cars = {"Monday","Tuesday","Wednesday","Thu","Fri"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cars);
        spnDays.setAdapter(adapter);
        //btnSend.setOnClickListener(new View.OnClickListener() {
        };
    }
