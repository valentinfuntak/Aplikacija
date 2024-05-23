package com.example.aplikacija;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_pocetna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);

        // Prijava gumb
        Button prijavaGumb = findViewById(R.id.prijavaGumb);
        prijavaGumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_pocetna.this, activity_prijava.class);
                startActivity(intent);
            }
        });

        // Registracija gumb
        Button registracijaGumb = findViewById(R.id.registracijaGumb);
        registracijaGumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_pocetna.this, activity_registracija.class);
                startActivity(intent);
            }
        });
    }
}
