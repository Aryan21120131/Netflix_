package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.netflix.R;

public class StepOne extends AppCompatActivity {

    TextView SignIn;
    Button step1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_one);
        hook();
        SignIn.setOnClickListener(v -> startActivity(new Intent(StepOne.this,SigninActivity.class)));
        step1.setOnClickListener(v -> startActivity(new Intent(StepOne.this,ChooseYourPlan.class)));
    }

    private void hook() {
        SignIn=findViewById(R.id.SignIn);
        step1=findViewById(R.id.step1);
    }
}