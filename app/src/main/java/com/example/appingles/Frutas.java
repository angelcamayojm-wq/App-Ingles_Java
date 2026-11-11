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

public class Frutas extends AppCompatActivity {
    MediaPlayer sonidofrutas;
    TextView txtmango,txtfresa,txtuva,txtmanzana,txtbanano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
        txtfresa=findViewById(R.id.txtfresa);
        txtmango=findViewById(R.id.txtmango);
        txtuva=findViewById(R.id.txtuva);
        txtmanzana=findViewById(R.id.txtmanzana);
        txtbanano=findViewById(R.id.txtbanano);

    }
    public void sonarfruta(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.fruta);
        sonidofrutas.start();
    }
    public void sonarmanzana(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.manzana);
        sonidofrutas.start();
        txtmanzana.setText("Apple");
    }
    public void sonarmango(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.mango);
        sonidofrutas.start();
        txtmango.setText("MANGO");
    }
    public void sonarfresa(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.fresa);
        sonidofrutas.start();
        txtfresa.setText("STRAWBERRY");
        txtfresa.setTextSize(30);
    }
    public void sonaruva(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.uva);
        sonidofrutas.start();
        txtuva.setText("GRAPE");
    }
    public void sonarbanano(View view){

        sonidofrutas = MediaPlayer.create(this, R.raw.banano);
        sonidofrutas.start();
        txtbanano.setText("BANANA");
    }

    public void volver(View view) {
        finish();
    }
}