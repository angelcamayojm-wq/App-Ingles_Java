package com.example.appingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dividir extends AppCompatActivity {
    EditText edtnum1d, edtnum2d;
    Button btnCalcularD, btnLimpiarD;
    TextView txtresulD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);
        edtnum1d=findViewById(R.id.edtnum1d);
        edtnum2d=findViewById(R.id.edtnum2d);
        btnCalcularD=findViewById(R.id.btnCalcularD);
        btnLimpiarD=findViewById(R.id.btnLimpiarD);
        txtresulD=findViewById(R.id.txtResultadoD);

        btnCalcularD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s1 = edtnum1d.getText().toString();
                    String s2 = edtnum2d.getText().toString();
                    if (s1.isEmpty() || s2.isEmpty()) {
                        txtresulD.setText("Por favor ingrese ambos números");
                        return;
                    }
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    if (num2 == 0) {
                        txtresulD.setText("No se puede dividir por cero");
                        return;
                    }
                    int dividir = num1 / num2;
                    txtresulD.setText("El resultado es: " + dividir);
                } catch (Exception e) {
                    txtresulD.setText("Error en los datos");
                }
            }
        });

        btnLimpiarD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnum1d.setText("");
                edtnum2d.setText("");
                txtresulD.setText("Resultado de División");
            }
        });
    }

    public void volver(View view) {
        finish();
    }
}
