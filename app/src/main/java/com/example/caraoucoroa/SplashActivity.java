package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /**
         * Desabilita a ActionBar
         */
        getSupportActionBar().hide();

        // Inicia a MainActivity após 2 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(
                        getActivity(), MainActivity.class);
                startActivity(intent);

            }
        }, 2000);

    }

    public Context getActivity() {
        return this;
    }
}
