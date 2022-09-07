package com.example.sem2_wcq_appbanco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
TextView tvIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this, Login.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        },3000);
    }
}