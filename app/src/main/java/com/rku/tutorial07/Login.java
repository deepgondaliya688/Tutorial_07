package com.rku.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    String valPassword;
    String valUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }

    public void btnLoginClick(View view) {
        valUsername = edtUsername.getText().toString();
        valPassword = edtPassword.getText().toString();

        if(valUsername.equals("")){
            Toast.makeText(this, "Username can not be empty!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(valPassword.equals("")){
            Toast.makeText(this, "Password can not be empty!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (valPassword.length() < 6) {
            Toast.makeText(this, "Password must be minimum of 6 character!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(){
            SharedPreferences preferences =getSharedPreferences("Login",MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("UserName",valUsername);
            editor.commit();

            Intent intent = new Intent(Login.this,Welcome.class);
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            startActivity(intent );
            finish();
        }else {

            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        Intent intent = new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }
}