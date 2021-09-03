package com.example.netflix.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.netflix.R;

public class SwipeScreen extends AppCompatActivity {

    TextView privacy,help,signIn;
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_screen);
        hook();
        privacy.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("help.netflix.com/legal/privacy"))));
        help.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://help.netflix.com/en/"))));
        signIn.setOnClickListener(v -> startActivity(new Intent(SwipeScreen.this,SigninActivity.class)));
        getStarted.setOnClickListener(v -> startActivity(new Intent(SwipeScreen.this,StepOne.class)));
    }

    private void hook() {
        privacy=findViewById(R.id.privacy);
        help=findViewById(R.id.help);
        signIn=findViewById(R.id.Signin);
        getStarted=findViewById(R.id.getStarted);
    }
}