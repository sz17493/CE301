package com.example.ce301_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_login = findViewById(R.id.login);
        Button btn_forget = findViewById(R.id.forget);
        Button btn_newid = findViewById(R.id.newid);

        //login
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //enter the face recognition page
            }
        });

        //create new account
        btn_newid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //enter the create new account page
            }
        });
    }
}