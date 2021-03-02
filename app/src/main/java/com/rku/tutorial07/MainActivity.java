package com.rku.tutorial07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtFirstName;
    EditText edtLastName;
    EditText editUserName;
    EditText editPassword;
    Spinner city;
    Switch swchBranch;
    CheckBox chkStatus;
    RadioGroup radioGroup;
    RadioButton gender;

    String valFirstName;
    String valLastName;
    String valUserName;
    String valPassword;
    String valCity;
    String valGender;
    int radioID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstName = findViewById(R.id.editFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        editUserName = findViewById(R.id.editUserName);
        editPassword = findViewById(R.id.editPassword);
        city = findViewById(R.id.spinCity);
        swchBranch = findViewById(R.id.switchBranch);
        chkStatus = findViewById(R.id.checkStatus);
        radioGroup = findViewById(R.id.radioGroup);


    }

    public void btnLoginClick(View view) {
        valFirstName = edtFirstName.getText().toString();
        valLastName = edtLastName.getText().toString();
        valUserName = editUserName.getText().toString();
        valPassword = editPassword.getText().toString();
        valCity = city.getSelectedItem().toString();
        radioID = radioGroup.getCheckedRadioButtonId();
        gender = findViewById(radioID);

        valGender = gender.getText().toString();

        String branch = "";
        if(swchBranch.isChecked()){

            branch = swchBranch.getTextOn().toString();
        }else {

            branch = swchBranch.getTextOff().toString();
        }
        String status = "";
        if(chkStatus.isChecked()){

            status = "Active";
        }else{

            status = "Inactive";
        }
    }
}