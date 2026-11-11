package com.example.appingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pregunta2 extends AppCompatActivity {
    MediaPlayer sonido;
    TextView txtpregunta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        txtpregunta1=findViewById(R.id.txtpregunta1);
        txtpregunta1.setText("👆 ¡Toca la imagen de la vaca para descubrir la pregunta!");
    }
    public void sonarpregunta2 (View view) {
        sonido = MediaPlayer.create(this, R.raw.pregunta2);
        sonido.start();
        txtpregunta1.setText("WHAT IS THE COW?");
    }
    public void sonarcorrecto(View view){
        Toast.makeText(this, "¡Correcto! 🎉", Toast.LENGTH_SHORT).show();
        sonido = MediaPlayer.create(this, R.raw.correcto);
        sonido.start();
        Intent ir = new Intent( Pregunta2.this, Pregunta3.class);
        startActivity(ir);
    }
    public void sonarincorrecto(View view){
        Toast.makeText(this, "¡Incorrecto! Inténtalo de nuevo ❌", Toast.LENGTH_SHORT).show();
        sonido = MediaPlayer.create(this, R.raw.incorrecto);
        sonido.start();
    }
}
