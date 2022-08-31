package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin, btnRegistrar, btnContactos,btnReporte,btnSplash,btnGoogle,btnCamara, btnLlamar, btnMaps,btnFotos,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContactos=findViewById(R.id.btnContactos);
        btnLogin=findViewById(R.id.btnLogin);
        btnRegistrar=findViewById(R.id.btnRegistrar);
        btnReporte=findViewById(R.id.btnReporte);
        btnSplash=findViewById(R.id.btnSplash);
        btnGoogle=findViewById(R.id.btnGoogle);
        btnCamara=findViewById(R.id.btnCamara);
        btnLlamar=findViewById(R.id.btnLlamar);
        btnMaps=findViewById(R.id.btnIrRuta);
        btnFotos=findViewById(R.id.btnFotos);
        btn5=findViewById(R.id.btn5);

        btnContactos.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
        btnReporte.setOnClickListener(this);
        btnSplash.setOnClickListener(this);
        btnGoogle.setOnClickListener(this);
        btnCamara.setOnClickListener(this);
        btnLlamar.setOnClickListener(this);
        btnMaps.setOnClickListener(this);
        btnFotos.setOnClickListener(this);
        btn5.setOnClickListener(this);

        String sCorreoRecibido=getIntent().getStringExtra("nombreCorreo");
        String sUsuaioRecibido=getIntent().getStringExtra("nombreUsuario");
        String sPassRecibido=getIntent().getStringExtra("nombrePassword");
        Toast.makeText(this, "Los datos recibidos son: \nCorreo->"+sCorreoRecibido+"\nUsuario-> "+sUsuaioRecibido+"\nContraseña-> "+sPassRecibido, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View ver) {
        switch (ver.getId()){
            case R.id.btnContactos:{
                Intent i=new Intent(this,Contactos.class);
                startActivity(i);
                break;
            }
            case R.id.btnLogin:{
                Intent i=new Intent(this,Login.class);
                startActivity(i);
                break;
            }
            case R.id.btnRegistrar:{
                Intent i=new Intent(this,Registrar.class);
                startActivity(i);
                break;
            }
            case R.id.btnReporte:{
                Intent i=new Intent(this,Reporte.class);
                startActivity(i);
                break;
            }
            case R.id.btnSplash:{
                Intent i=new Intent(this,Splash.class);
                startActivity(i);
                break;
            }
            case R.id.btnGoogle:{
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);
                break;
            }
            case R.id.btnCamara:{
                Intent i=new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i);
                break;
            }
            case R.id.btnLlamar:{
                Intent i=new Intent(this,Llamar.class);
                startActivity(i);
                break;
            }
            case R.id.btnIrRuta:{
                Intent i = new Intent(this,Ruta.class);
                startActivity(i);
                break;
            }
            case R.id.btnFotos:{
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(i);
                break;
            }
            case R.id.btn5:{
                Intent i=new Intent(this,MensajeTexto.class);
                startActivity(i);
                break;
            }
        }
    }
}