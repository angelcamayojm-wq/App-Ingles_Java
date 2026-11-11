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

public class Menu extends AppCompatActivity {
    MediaPlayer sonido;
    TextView txtcolores,txtanimales,txtvocales,txtfrutas,txtnumeros,txtmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu1);
        txtcolores=findViewById(R.id.txtcolores);
        txtmenu=findViewById(R.id.txtmenu);
        txtanimales=findViewById(R.id.txtanimales);
        txtvocales=findViewById(R.id.txtvocales);
        txtfrutas=findViewById(R.id.txtfrutas);
        txtnumeros=findViewById(R.id.txtnumeros);

    }
    public void sonarmenuprincipal(View view){

        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        txtmenu.setText("MAIN MENU");
    }
    public void sonarcolores(View view){

        sonido = MediaPlayer.create(this, R.raw.colores);
        sonido.start();
        txtcolores.setText("COLORS");
    }
    public void sonaranimales(View view){

        sonido = MediaPlayer.create(this, R.raw.animales);
        sonido.start();
        txtanimales.setText("ANIMALS");
    }
    public void sonarvocales(View view){

        sonido = MediaPlayer.create(this, R.raw.vocales);
        sonido.start();
        txtvocales.setText("VOWELS");
    }
    public void sonarfruta(View view){

        sonido = MediaPlayer.create(this, R.raw.fruta);
        sonido.start();
        txtfrutas.setText("FRUIT");
    }
    public void sonarnumeros(View view){

        sonido = MediaPlayer.create(this, R.raw.numeros);
        sonido.start();
        txtnumeros.setText("NUMBERS");
    }


    public void irColores(View view) {
        Intent ir = new Intent(Menu.this, Colores.class);
        startActivity(ir);


    }

    public void irAnimales(View view) {
        Intent ir = new Intent(Menu.this, Animales.class);
        startActivity(ir);

    }
    public void irVocales(View view) {
        Intent ir = new Intent(Menu.this, Vocales.class);
        startActivity(ir);
    }
    public void irFrutas(View view) {
        Intent ir = new Intent(Menu.this, Frutas.class);
        startActivity(ir);
    }
    public void irNumeros(View view) {
        Intent ir = new Intent(Menu.this, Numeros.class);
        startActivity(ir);
    }

    public void volver(View view) {
        finish();
    }

}