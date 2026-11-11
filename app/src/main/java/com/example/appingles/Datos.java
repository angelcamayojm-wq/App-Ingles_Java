package com.example.appingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Datos extends AppCompatActivity {
    EditText edtNombre;
    Spinner spinnerCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        edtNombre = findViewById(R.id.edtNombre);
        spinnerCiudad = findViewById(R.id.spinnerCiudad);
    }

    public void irmenu2(View view) {
        Intent ir = new Intent(Datos.this, Menu_Principal.class);
        startActivity(ir);
    }

    public void registrar(View view) {
        String nombre = edtNombre != null ? edtNombre.getText().toString().trim() : "";
        if (nombre.isEmpty()) {
            nombre = "Amigo/a";
        }
        String ciudad = spinnerCiudad != null && spinnerCiudad.getSelectedItem() != null ? spinnerCiudad.getSelectedItem().toString() : "Popayán";
        if (ciudad.equals("Seleccione la ciudad")) {
            ciudad = "Popayán";
        }

        Toast.makeText(this, "¡Bienvenido/a, " + nombre + "! 🎉", Toast.LENGTH_SHORT).show();
        Intent ir = new Intent(Datos.this, Menu_Principal.class);
        ir.putExtra("NOMBRE_USUARIO", nombre);
        ir.putExtra("CIUDAD_USUARIO", ciudad);
        startActivity(ir);
    }
}
