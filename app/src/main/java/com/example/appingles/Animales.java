package com.example.appingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {
    MediaPlayer sonidovaca;
    TextView txtvaca ,txtPerro,txtGato,txtCerdo,txtConejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animales);

        txtvaca = findViewById(R.id.txtVaca);
        txtPerro = findViewById(R.id.txtPerro);
        txtGato = findViewById(R.id.txtGato);
        txtCerdo = findViewById(R.id.txtCerdo);
        txtConejo = findViewById(R.id.txtConejo);

    }
    public void sonaranimales(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.animales);
        sonidovaca.start();
    }
    public void sonarvaca(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.vaca);
        sonidovaca.start();
        txtvaca.setText("COW");

    }
    public void sonarperro(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.perro);
        sonidovaca.start();
        txtPerro.setText("DOG");
    }
    public void sonargato(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.gato);
        sonidovaca.start();
        txtGato.setText("CAT");
    }
    public void sonarcerdo(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.cerdo);
        sonidovaca.start();
        txtCerdo.setText("PIG");
    }
    public void sonarconejo(View view){

        sonidovaca = MediaPlayer.create(this, R.raw.conejo);
        sonidovaca.start();
        txtConejo.setText("RABBIT");
    }

    public void volver(View view) {
        finish();
    }
}
