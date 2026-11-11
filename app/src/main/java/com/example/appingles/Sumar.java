package com.example.appingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sumar extends AppCompatActivity {
    EditText edtnum1sumar, edtnum2sumar;
    Button btnCalcularSuma, btnLimpiarSuma;
    TextView txtresulsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        edtnum1sumar = findViewById(R.id.edtnum1s);
        edtnum2sumar= findViewById(R.id.edtnum2s);
        btnCalcularSuma=findViewById(R.id.btnCalcularSuma);
        btnLimpiarSuma=findViewById(R.id.btnLimpiarSuma);
        txtresulsuma=findViewById(R.id.txtResultadosuma);

        btnCalcularSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = edtnum1sumar.getText().toString();
                    String s2 = edtnum2sumar.getText().toString();
                    if (s1.isEmpty() || s2.isEmpty()) {
                        txtresulsuma.setText("Por favor ingrese ambos números");
                        return;
                    }
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int sumar = num1 + num2;
                    txtresulsuma.setText("El resultado es: " + sumar);
                } catch (Exception e) {
                    txtresulsuma.setText("Error en los datos");
                }
            }
        });

        btnLimpiarSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnum1sumar.setText("");
                edtnum2sumar.setText("");
                txtresulsuma.setText("Resultado de la Suma");
            }
        });
    }

    public void volver(View view) {
        finish();
    }
}
