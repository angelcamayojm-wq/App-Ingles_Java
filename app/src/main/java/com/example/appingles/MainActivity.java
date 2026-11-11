package com.example.appingles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void irMenu(View view) {
        sonido = MediaPlayer.create(this, R.raw.vocabulario);
        sonido.start();
        Intent ir = new Intent(MainActivity.this, Datos.class);
        startActivity(ir);

    }


    public void irmenu3(View view) {
    }
}



