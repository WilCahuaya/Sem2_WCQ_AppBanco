package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MensajeTexto extends AppCompatActivity implements View.OnClickListener {
    Button btnEnviarMensaje;
    EditText edtNumeroMensaje, edtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_texto);

        btnEnviarMensaje=findViewById(R.id.btnEnviarMensaje);
        edtNumeroMensaje=findViewById(R.id.edtNumeroMensaje);
        edtMensaje=findViewById(R.id.edtMensaje);

        btnEnviarMensaje.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sNumMensaje=edtNumeroMensaje.getText().toString();
        String sMensaje=edtMensaje.getText().toString();
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+sNumMensaje));
        i.putExtra("sms_body",sMensaje);
        startActivity(i);
    }
}