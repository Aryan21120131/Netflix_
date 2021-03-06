package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.netflix.R;

public class StepTwo extends AppCompatActivity {

    String selected_plan_name,selected_plan_cost,selected_plan_format_of_cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_two);
        Intent next=getIntent();
        selected_plan_name=next.getStringExtra("PlanName");
        selected_plan_cost=next.getStringExtra("PlanCost");
        selected_plan_format_of_cost=next.getStringExtra("PlanCostFormat");
        Toast.makeText(StepTwo.this, selected_plan_name+"\n"+selected_plan_cost+"\n"+selected_plan_format_of_cost, Toast.LENGTH_SHORT).show();

    }
}