package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.netflix.R;

public class ChooseYourPlan extends AppCompatActivity {

    RadioButton SD_radio,HD_radio,Basic_radio,Standard_radio, Premium_radio;
    String selected_plan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_plan);
        hook();

//        SD_radio.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            selected_plan="SD";
//            HD_radio.setChecked(false);
//            Basic_radio.setChecked(false);
//            Standard_radio.setChecked(false);
//            Premium_radio.setChecked(false);
//        });

//        HD_radio.setOnClickListener(v -> {
//            selected_plan="HD";
//            SD_radio.setChecked(false);
//            Basic_radio.setChecked(false);
//            Standard_radio.setChecked(false);
//            Primium_radio.setChecked(false);
//        });
//        Basic_radio.setOnClickListener(v -> {
//            selected_plan="Basic";
//            HD_radio.setChecked(false);
//            SD_radio.setChecked(false);
//            Standard_radio.setChecked(false);
//            Primium_radio.setChecked(false);
//        });
//        Standard_radio.setOnClickListener(v -> {
//            selected_plan="Standard";
//            HD_radio.setChecked(false);
//            Basic_radio.setChecked(false);
//            SD_radio.setChecked(false);
//            Primium_radio.setChecked(false);
//        });
//        Primium_radio.setOnClickListener(v -> {
//            selected_plan="Premium";
//            HD_radio.setChecked(false);
//            Basic_radio.setChecked(false);
//            Standard_radio.setChecked(false);
//            SD_radio.setChecked(false);
//        });
    }


    private void hook() {
        SD_radio=findViewById(R.id.SD_radio);
        HD_radio=findViewById(R.id.HD_radio);
        Basic_radio=findViewById(R.id.basic_radio);
        Standard_radio=findViewById(R.id.standard_radio);
        Premium_radio =findViewById(R.id.premium_radio);
    }
}