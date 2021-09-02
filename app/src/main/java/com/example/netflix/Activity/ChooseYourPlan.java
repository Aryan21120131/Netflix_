package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.netflix.R;

public class ChooseYourPlan extends AppCompatActivity {

    RadioButton SD_radio,HD_radio,Basic_radio,Standard_radio, Premium_radio;
    String selected_plan_name,selected_plan_cost,selected_plan_format_of_cost;
    Button continue_;
    TextView SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_plan);
        hook();

//        SD_radio.setOnCheckedChangeListener(new RadioCheck());
//        HD_radio.setOnCheckedChangeListener(new RadioCheck());
//        Basic_radio.setOnCheckedChangeListener(new RadioCheck());
//        Standard_radio.setOnCheckedChangeListener(new RadioCheck());
//        Premium_radio.setOnCheckedChangeListener(new RadioCheck());
//        Basic_radio.setChecked(true);
        continue_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChooseYourPlan.this,FinishUpAccount.class);
                intent.putExtra("PlanName",selected_plan_name);
                intent.putExtra("PlanCost",selected_plan_cost);
                intent.putExtra("PlanCostFormat",selected_plan_format_of_cost);
                startActivity(intent);
            }
        });
        SignIn.setOnClickListener(v -> startActivity(new Intent(ChooseYourPlan.this,SigninActivity.class)));
    }

    private void hook() {
        SD_radio=findViewById(R.id.SD_radio);
        HD_radio=findViewById(R.id.HD_radio);
        Basic_radio=findViewById(R.id.basic_radio);
        Standard_radio=findViewById(R.id.standard_radio);
        Premium_radio =findViewById(R.id.premium_radio);
        continue_=findViewById(R.id.continue_);
        selected_plan_name="Basic";
        selected_plan_cost="499";
        selected_plan_format_of_cost="499/Month";
        SignIn=findViewById(R.id.SignIn);
    }

    class RadioCheck implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(b){
                switch (compoundButton.getId()){
                    case R.id.SD_radio:
                        selected_plan_name="Mobile";
                        selected_plan_cost="199";
                        selected_plan_format_of_cost="199/Month";
                        HD_radio.setChecked(false);
                        Basic_radio.setChecked(false);
                        Standard_radio.setChecked(false);
                        Premium_radio.setChecked(false);
                        break;
                    case R.id.HD_radio:
                        selected_plan_name="Mobile+";
                        selected_plan_cost="399";
                        selected_plan_format_of_cost="399/Month";
                        SD_radio.setChecked(false);
                        Basic_radio.setChecked(false);
                        Standard_radio.setChecked(false);
                        Premium_radio.setChecked(false);
                        break;
                    case R.id.basic_radio:
                        selected_plan_name="Basic";
                        selected_plan_cost="499";
                        selected_plan_format_of_cost="499/Month";
                        SD_radio.setChecked(false);
                        HD_radio.setChecked(false);
                        Standard_radio.setChecked(false);
                        Premium_radio.setChecked(false);
                        break;
                    case R.id.standard_radio:
                        selected_plan_name="Standard";
                        selected_plan_cost="649";
                        selected_plan_format_of_cost="649/Month";
                        SD_radio.setChecked(false);
                        HD_radio.setChecked(false);
                        Basic_radio.setChecked(false);
                        Premium_radio.setChecked(false);
                        break;
                    case R.id.premium_radio:
                        selected_plan_name="Premium";
                        selected_plan_cost="799";
                        selected_plan_format_of_cost="799/Month";
                        SD_radio.setChecked(false);
                        HD_radio.setChecked(false);
                        Basic_radio.setChecked(false);
                        Standard_radio.setChecked(false);
                        break;
                }
            }
        }

        @Override
        public void onClick(View view) {

        }
    }
}