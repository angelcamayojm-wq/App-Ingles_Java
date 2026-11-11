package com.example.appingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pregunta5 extends AppCompatActivity {
    MediaPlayer sonido;
    TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
        txtTitulo=findViewById(R.id.txtTitulo);
        txtTitulo.setText("👆 ¡Toca la calculadora para descubrir el número!");
    }

    public void sonarpregunta5(View view) {
        sonido = MediaPlayer.create(this, R.raw.pregunta5);
        sonido.start();
        txtTitulo.setText("WHAT IS NUMBER THREE?");
    }
    public void sonarcorrecto(View view){
        Toast.makeText(this, "¡Correcto! 🎉 ¡Juego completado!", Toast.LENGTH_LONG).show();
        sonido = MediaPlayer.create(this, R.raw.correcto);
        sonido.start();
        Intent ir = new Intent(pregunta5.this, Menu_Principal.class);
        startActivity(ir);
    }
    public void sonarincorrecto(View view){
        Toast.makeText(this, "¡Incorrecto! Inténtalo de nuevo ❌", Toast.LENGTH_SHORT).show();
        sonido = MediaPlayer.create(this, R.raw.incorrecto);
        sonido.start();
    }
}
