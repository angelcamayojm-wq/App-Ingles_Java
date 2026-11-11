package com.example.appingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Principal extends AppCompatActivity {
    TextView txtSaludo;
    String nombreUsuario = "Estudiante";
    String ciudadUsuario = "Popayán";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        txtSaludo = findViewById(R.id.txtSaludo);
        String nombre = getIntent().getStringExtra("NOMBRE_USUARIO");
        String ciudad = getIntent().getStringExtra("CIUDAD_USUARIO");

        if (nombre != null && !nombre.trim().isEmpty()) {
            nombreUsuario = nombre;
            txtSaludo.setText("¡Hola, " + nombre + "! 👋");
        }
        if (ciudad != null && !ciudad.trim().isEmpty()) {
            ciudadUsuario = ciudad;
        }
    }

    public void iringles(View view) {
        Intent ir = new Intent(Menu_Principal.this, Menu.class);
        startActivity(ir);
    }

    public void irjuegos(View view) {
        Intent ir = new Intent(Menu_Principal.this, Preguntas1.class);
        startActivity(ir);
    }

    public void irmatematicas(View view) {
        Intent ir = new Intent(Menu_Principal.this, Menu_Operaciones.class);
        startActivity(ir);
    }

    public void irPerfil(View view) {
        Intent ir = new Intent(Menu_Principal.this, Perfil.class);
        ir.putExtra("NOMBRE_USUARIO", nombreUsuario);
        ir.putExtra("CIUDAD_USUARIO", ciudadUsuario);
        startActivity(ir);
    }
}
