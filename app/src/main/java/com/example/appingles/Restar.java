package com.example.appingles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Restar extends AppCompatActivity {
    EditText edtnum1r, edtnum2r;
    Button btnCalcularResta, btnLimpiarResta;
    TextView txtresulResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);
        edtnum1r=findViewById(R.id.edtnum1r);
        edtnum2r=findViewById(R.id.edtnum2r);
        btnCalcularResta=findViewById(R.id.btnCalcularResta);
        btnLimpiarResta=findViewById(R.id.btnLimpiarResta);
        txtresulResta=findViewById(R.id.txtResultadoResta);

        btnCalcularResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s1 = edtnum1r.getText().toString();
                    String s2 = edtnum2r.getText().toString();
                    if (s1.isEmpty() || s2.isEmpty()) {
                        txtresulResta.setText("Por favor ingrese ambos números");
                        return;
                    }
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int restar = num1 - num2;
                    txtresulResta.setText("El resultado es: " + restar);
                } catch (Exception e) {
                    txtresulResta.setText("Error en los datos");
                }
            }
        });

        btnLimpiarResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnum1r.setText("");
                edtnum2r.setText("");
                txtresulResta.setText("Resultado de la Resta");
            }
        });
    }

    public void volver(View view) {
        finish();
    }
}
