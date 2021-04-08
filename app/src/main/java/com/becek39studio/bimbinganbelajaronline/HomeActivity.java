package com.becek39studio.bimbinganbelajaronline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button profil,logout;
    String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profil = findViewById(R.id.btnHomeProfil);
        logout = findViewById(R.id.btnHomeLogout);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuProfil();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void menuProfil(){
        Intent profil = new Intent(this,ProfilActivity.class);
        startActivity(profil);
    }
}