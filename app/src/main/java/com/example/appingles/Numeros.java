package com.example.appingles;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Numeros extends AppCompatActivity {
    MediaPlayer sonidonumeros;
    TextView txtuno,txtdos,txttres,txtcuatro,txtcinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_numeros);
        txtuno=findViewById(R.id.txtuno);
        txtdos=findViewById(R.id.txtdos);
        txttres=findViewById(R.id.txttres);
        txtcuatro=findViewById(R.id.txtcuatro);
        txtcinco=findViewById(R.id.txtcinco);

    }
    public void sonarnumeros(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.numeros);
        sonidonumeros.start();
    }
    public void sonaruno(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.uno);
        sonidonumeros.start();
        txtuno.setText("ONE");
    }
    public void sonardos(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.dos);
        sonidonumeros.start();
        txtdos.setText("TWO");
    }
    public void sonartres(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.tres);
        sonidonumeros.start();
        txttres.setText("THREE");
    }
    public void sonarcuatro(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.cuatro);
        sonidonumeros.start();
        txtcuatro.setText("FOUR");
    }
    public void sonarcinco(View view) {

        sonidonumeros = MediaPlayer.create(this, R.raw.cinco);
        sonidonumeros.start();
        txtcinco.setText("FIVE");
    }

    public void volver(View view) {
        finish();
    }
}