package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrar extends AppCompatActivity {
    EditText edtProfesion,edtDireccion;
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edtDireccion=findViewById(R.id.edtDireccion);
        edtProfesion=findViewById(R.id.edtProfesion);
        btnRegistro=findViewById(R.id.btnRegistrar);
    }

    public void registrar(View view){
        String sProfesion=edtProfesion.getText().toString();
        String sDireccion=edtDireccion.getText().toString();

        if("".equals(sProfesion)){
            edtProfesion.setError("Ingresa Profesión");
            edtProfesion.requestFocus();
        }

        if("".equals(sDireccion)){
            edtDireccion.setError("Ingresa Die=rección");
            edtDireccion.requestFocus();
        }

    }
}