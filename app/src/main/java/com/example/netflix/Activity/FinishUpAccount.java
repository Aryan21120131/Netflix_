package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.netflix.R;

public class FinishUpAccount extends AppCompatActivity {

    String selected_plan_name,selected_plan_cost,selected_plan_format_of_cost;
    Button continue_;
    TextView SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_up_account);
        hooK();
        getData();
        Toast.makeText(FinishUpAccount.this, selected_plan_name+"\n"+selected_plan_cost+"\n"+selected_plan_format_of_cost, Toast.LENGTH_SHORT).show();
        continue_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(FinishUpAccount.this,StepTwo.class);
                next.putExtra("PlanName",selected_plan_name);
                next.putExtra("PlanCost",selected_plan_cost);
                next.putExtra("PlanCostFormat",selected_plan_format_of_cost);
                startActivity(next);
            }
        });
//        SignIn.setOnClickListener(v -> startActivity(new Intent(FinishUpAccount.this,SigninActivity.class)));
    }

    private void getData() {
        Intent intent=getIntent();
        selected_plan_name=intent.getStringExtra("PlanName");
        selected_plan_cost=intent.getStringExtra("PlanCost");
        selected_plan_format_of_cost=intent.getStringExtra("PlanCostFormat");
    }

    private void hooK() {
        continue_=findViewById(R.id.finish_continue_);
        SignIn=findViewById(R.id.SignIn);
    }
}