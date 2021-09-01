package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.netflix.MainScreens.MainScreen;
import com.example.netflix.R;

public class SigninActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView forgotPassword,SignUp;
    Button SignIn;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        hook();
        SignIn.setOnClickListener(v -> {
            progressBar.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> startActivity(new Intent(SigninActivity.this, MainScreen.class)),1000);
        });
        SignUp.setOnClickListener(v -> {
            progressBar.setVisibility(View.VISIBLE);
            new Handler().postDelayed(() -> startActivity(new Intent(SigninActivity.this,SwipeScreen.class)),1000);
        });
        forgotPassword.setOnClickListener(v -> Toast.makeText(SigninActivity.this, "Forgot Password!!!", Toast.LENGTH_SHORT).show());
    }

    private void hook() {
        progressBar=findViewById(R.id.progressBar2);
        forgotPassword=findViewById(R.id.forgotPassword);
        SignUp=findViewById(R.id.SignUp);
        SignIn=findViewById(R.id.signinButton);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        progressBar.setVisibility(View.INVISIBLE);
    }
}