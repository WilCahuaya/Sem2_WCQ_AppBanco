package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText edtCorreo,edtPassword;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtCorreo=findViewById(R.id.edtCorreo);
        edtPassword=findViewById(R.id.edtPassword);
        btnIngresar=findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Home.class);
        String sCorreo=edtCorreo.getText().toString();
        String sPassword=edtPassword.getText().toString();
        String correo="x@x.com";
        String pass="123";


        if("x@x.com".equals(sCorreo) && "123".equals(sCorreo)){
            startActivity(i);
        }else{
            Toast.makeText(this,"Correo o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }

//        i.putExtra("nombreCorreo",sCorreo);
//        i.putExtra("nombrePassword",sPassword);


    }
}