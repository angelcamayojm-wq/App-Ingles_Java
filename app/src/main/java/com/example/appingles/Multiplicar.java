package com.example.appingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Multiplicar extends AppCompatActivity {
    EditText edtnum1m, edtnum2m;
    Button btnCalcularM, btnLimpiarM;
    TextView txtresulM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        edtnum1m=findViewById(R.id.edtnum1m);
        edtnum2m=findViewById(R.id.edtnum2m);
        btnCalcularM=findViewById(R.id.btnCalcularM);
        btnLimpiarM=findViewById(R.id.btnLimpiarM);
        txtresulM=findViewById(R.id.txtResultadoM);

        btnCalcularM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = edtnum1m.getText().toString();
                    String s2 = edtnum2m.getText().toString();
                    if (s1.isEmpty() || s2.isEmpty()) {
                        txtresulM.setText("Por favor ingrese ambos números");
                        return;
                    }
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int multiplicar = num1 * num2;
                    txtresulM.setText("El resultado es: " + multiplicar);
                } catch (Exception e) {
                    txtresulM.setText("Error en los datos");
                }
            }
        });

        btnLimpiarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnum1m.setText("");
                edtnum2m.setText("");
                txtresulM.setText("Resultado de Multiplicación");
            }
        });
    }

    public void volver(View view) {
        finish();
    }
}
