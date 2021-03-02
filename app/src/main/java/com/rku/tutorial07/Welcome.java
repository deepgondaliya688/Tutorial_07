package com.rku.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView txtWelcome;
    SharedPreferences Preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtWelcome = findViewById(R.id.txtWelcome);

        Preferences = getSharedPreferences("Login",MODE_PRIVATE);
        String userPreferences = Preferences.getString("UserName", "");

        if(userPreferences.equals("")){

            Intent intent = new Intent(Welcome.this,Login.class);
            startActivity(intent);
            finish();
        }
    }
}