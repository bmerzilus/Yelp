package com.cetemoh.yelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button   login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email =findViewById(R.id.edt_email);
        password= findViewById(R.id.edt_password);
        login = findViewById(R.id.bnt_Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "votre Email Please : "+email.getText().toString()+"\n votre Password Please :"+password.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
