package com.example.sem2_wcq_appbanco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull @NotNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_transferencia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull @NotNull MenuItem menuelegido) {
        switch (menuelegido.getItemId()){
            case R.id.nav_registrar:{
                Toast.makeText(this,"Registrar Usuario", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_transferencia:{
                Toast.makeText(this,"Efectuar transferencia", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_consultar_transferencia:{
                Toast.makeText(this,"Consultar", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.nav_preferencias:{
                Toast.makeText(this,"Configurar Preferencias", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return true;
    }
}