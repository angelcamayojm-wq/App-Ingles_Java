package com.example.appingles;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Perfil extends AppCompatActivity {
    TextView txtNombrePerfil, txtCiudadPerfil, txtPuntos, txtNivel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        txtNombrePerfil = findViewById(R.id.txtNombrePerfil);
        txtCiudadPerfil = findViewById(R.id.txtCiudadPerfil);
        txtPuntos = findViewById(R.id.txtPuntos);
        txtNivel = findViewById(R.id.txtNivel);

        String nombre = getIntent().getStringExtra("NOMBRE_USUARIO");
        String ciudad = getIntent().getStringExtra("CIUDAD_USUARIO");

        if (nombre != null && !nombre.trim().isEmpty()) {
            txtNombrePerfil.setText("Nombre: " + nombre);
        }
        if (ciudad != null && !ciudad.trim().isEmpty()) {
            txtCiudadPerfil.setText("📍 Ciudad: " + ciudad);
        }
    }

    public void volver(View view) {
        finish();
    }
}
