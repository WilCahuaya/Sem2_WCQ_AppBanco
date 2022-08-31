package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Llamar extends AppCompatActivity implements View.OnClickListener {
    EditText edtNumero;
    Button btnRealizarLlamada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamar);

        edtNumero=findViewById(R.id.edtNumero);
        btnRealizarLlamada=findViewById(R.id.btnRealizarLlamada);

        btnRealizarLlamada.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sNumero=edtNumero.getText().toString();
        Intent i= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+sNumero));
        startActivity(i);
    }
}