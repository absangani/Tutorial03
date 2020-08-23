package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valUsername, valPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valUsername = findViewById(R.id.txtUsername);
        valPassword = findViewById(R.id.txtPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valUsername.getText().toString().equals("admin@gmail.com") && valPassword.getText().toString().equals("123456")){

                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    finish();
                    Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this,"Username or Password is incorrect",Toast.LENGTH_SHORT).show();

                }
//                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });


    }

}

