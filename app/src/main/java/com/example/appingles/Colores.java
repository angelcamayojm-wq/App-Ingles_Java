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

public class Colores extends AppCompatActivity {

    MediaPlayer sonidoverde;
    TextView txtverde, txtazul,txtnaranja,txtrojo,txtmorado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colores);
        txtverde=findViewById(R.id.txtverde);
        txtazul=findViewById(R.id.txtazul);
        txtnaranja=findViewById(R.id.txtnaranja);
        txtrojo=findViewById(R.id.txtrojo);
        txtmorado=findViewById(R.id.txtmorado);

    }
    public void sonarcolores(View view){

        sonidoverde = MediaPlayer.create(this, R.raw.colores);
        sonidoverde.start();
    }

    public void sonarVerde(View view){

        sonidoverde = MediaPlayer.create(this, R.raw.verde);
        sonidoverde.start();
        txtverde.setText("GREEN");
    }
    public void sonarazul(View view) {

        sonidoverde = MediaPlayer.create(this, R.raw.azul);
        sonidoverde.start();
        txtazul.setText("BLUE");

    }
    public void sonarnaranja(View view) {

        sonidoverde = MediaPlayer.create(this, R.raw.naranja);
        sonidoverde.start();
        txtnaranja.setText("ORANGE");
    }
    public void sonarrojo(View view) {

        sonidoverde = MediaPlayer.create(this, R.raw.rojo);
        sonidoverde.start();
        txtrojo.setText("RED");
    }
    public void sonarmorado(View view) {

        sonidoverde = MediaPlayer.create(this, R.raw.morado);
        sonidoverde.start();
        txtmorado.setText("PURPLE");
    }

    public void volver(View view) {
        finish();
    }
}