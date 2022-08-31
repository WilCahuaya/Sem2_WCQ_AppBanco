package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ruta extends AppCompatActivity implements View.OnClickListener {
    EditText edtLugar;
    Button btnRuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta);

        edtLugar=findViewById(R.id.edtLugar);
        btnRuta=findViewById(R.id.btnRuta);

        btnRuta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sLugar=edtLugar.getText().toString();
        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q="+sLugar));
        startActivity(i);
    }
}