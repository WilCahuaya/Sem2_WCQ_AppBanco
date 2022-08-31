package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText edtCorreo, edtUsuario,edtPassword;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtCorreo=findViewById(R.id.edtCorreo);
        edtUsuario=findViewById(R.id.edtUsuario);
        edtPassword=findViewById(R.id.edtPassword);
        btnIngresar=findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,MainActivity.class);
        String sCorreo=edtCorreo.getText().toString();
        String sUsuario=edtUsuario.getText().toString();
        String sPassword=edtPassword.getText().toString();

        i.putExtra("nombreCorreo",sCorreo);
        i.putExtra("nombreUsuario",sUsuario);
        i.putExtra("nombrePassword",sPassword);

        startActivity(i);
    }
}