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

public class Menu_Operaciones extends AppCompatActivity {
    MediaPlayer sonido;
    TextView txtoperaciones, txtsuma, txtresta, txtmultiplicar, txtdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_operaciones);
        txtoperaciones = findViewById(R.id.txtoperaciones);
        txtsuma = findViewById(R.id.txtsuma);
        txtresta = findViewById(R.id.txtresta);
        txtmultiplicar = findViewById(R.id.txtmultiplicar);
        txtdividir = findViewById(R.id.txtdividir);
    }
    public void sonarmenuprincipal(View view){
        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        txtoperaciones.setText("OPERATIONS");
    }
    public void sonarsuma(View view){
        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        if (txtsuma != null) txtsuma.setText("ADDITION");
    }
    public void sonarrestar(View view){
        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        if (txtresta != null) txtresta.setText("SUBTRACTION");
    }
    public void sonarmultiplicar(View view){
        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        if (txtmultiplicar != null) txtmultiplicar.setText("MULTIPLICATION");
    }
    public void sonardividir(View view){
        sonido = MediaPlayer.create(this, R.raw.menupricipal);
        sonido.start();
        if (txtdividir != null) txtdividir.setText("DIVISION");
    }
    public void irsuma(View view) {
        Intent ir = new Intent(Menu_Operaciones.this, Sumar.class);
        startActivity(ir);
    }

    public void irrestar(View view) {
        Intent ir = new Intent(Menu_Operaciones.this, Restar.class);
        startActivity(ir);
    }


    public void irmultiplicacion(View view) {
        Intent ir = new Intent(Menu_Operaciones.this, Multiplicar.class);
        startActivity(ir);
    }
    public void irdivision(View view) {
        Intent ir = new Intent(Menu_Operaciones.this, Dividir.class);
        startActivity(ir);
    }

    public void volver(View view) {
        finish();
    }

}