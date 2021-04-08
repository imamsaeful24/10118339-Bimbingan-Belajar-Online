package com.becek39studio.bimbinganbelajaronline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText email, password;
    Button login;
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        reg = findViewById(R.id.textRegistrasi);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuRegistrasi();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuHome();
            }
        });
    }

    private void menuRegistrasi(){
        Intent reg = new Intent(this,RegistrasiActivity.class);
        startActivity(reg);
    }

    private void menuHome(){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}