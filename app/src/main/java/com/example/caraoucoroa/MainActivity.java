package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView moedaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonFlip = findViewById(R.id.buttonJogar);
        buttonFlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moedaView = (ImageView) findViewById(R.id.moedaView);
                Random random = new Random();
                int valorAleatorio = random.nextInt(2); // 0 para cara, 1 para coroaA

                if (valorAleatorio == 0) {
                    moedaView.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.cara));
                } else {
                    moedaView.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.coroa));
                }
            }
        });
    }
}