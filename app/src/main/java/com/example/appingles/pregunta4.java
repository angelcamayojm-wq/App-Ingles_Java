package com.example.appingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pregunta4 extends AppCompatActivity {
    MediaPlayer sonido;
    TextView txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
        txtTitulo=findViewById(R.id.txtTitulo);
        txtTitulo.setText("👆 ¡Toca la fruta para descubrir la pregunta!");
    }
    public void sonarpreguntafrutas4 (View view) {
        sonido = MediaPlayer.create(this, R.raw.preguntafrutas4);
        sonido.start();
        txtTitulo.setText("WHAT IS THE MANGO?");
    }
    public void sonarcorrecto(View view){
        Toast.makeText(this, "¡Correcto! 🎉", Toast.LENGTH_SHORT).show();
        sonido = MediaPlayer.create(this, R.raw.correcto);
        sonido.start();
        Intent ir = new Intent(pregunta4.this, pregunta5.class);
        startActivity(ir);
    }
    public void sonarincorrecto(View view){
        Toast.makeText(this, "¡Incorrecto! Inténtalo de nuevo ❌", Toast.LENGTH_SHORT).show();
        sonido = MediaPlayer.create(this, R.raw.incorrecto);
        sonido.start();
    }
}
