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

public class Vocales extends AppCompatActivity {
    MediaPlayer sonidovocales;
    TextView txta,txte,txti,txto,txtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vocales);
        txta=findViewById(R.id.txta);
        txte=findViewById(R.id.txte);
        txti=findViewById(R.id.txti);
        txto=findViewById(R.id.txto);
        txtu=findViewById(R.id.txtu);


    }

    public void sonarvocales(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.vocales);
        sonidovocales.start();
    }

    public void sonara(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.a);
        sonidovocales.start();
        txta.setText("EI");
    }

    public void sonare(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.e);
        sonidovocales.start();
        txte.setText("I");
    }
    public void sonari(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.i);
        sonidovocales.start();
        txti.setText("AI");
    }
    public void sonaro(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.o);
        sonidovocales.start();
        txto.setText("OU");
    }
    public void sonaru(View view){

        sonidovocales = MediaPlayer.create(this, R.raw.u);
        sonidovocales.start();
        txtu.setText("IU");
    }

    public void volver(View view) {
        finish();
    }
}