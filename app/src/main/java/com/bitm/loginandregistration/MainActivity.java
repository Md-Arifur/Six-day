package com.bitm.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText emailEt, passwordEt;
        emailEt = findViewById(R.id.emailET);
        passwordEt = findViewById(R.id.passwordET);
        Button logInBtn = findViewById(R.id.logInBtn);

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEt.getText().toString();
                if (email.equals("")){
                    emailEt.setError("Please enter your name");

                }else {
                    emailEt.requestFocus();
                }
            }
        });

    }
}
