package com.becek39studio.bimbinganbelajaronline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrasiActivity extends AppCompatActivity {

    EditText nama, username, password;
    Button registrasi;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        nama = findViewById(R.id.regName);
        username = findViewById(R.id.regUsername);
        password = findViewById(R.id.regPassword);
        registrasi = findViewById(R.id.btnReg);
        login = findViewById(R.id.regTextLogin);

        registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuLogin();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuHome();
            }
        });
    }

    private void menuLogin(){
        Intent reg = new Intent(this,LoginActivity.class);
        startActivity(reg);
    }

    private void menuHome(){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}