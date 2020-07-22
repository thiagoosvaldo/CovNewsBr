package com.covi.covidnewsbr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private Button btnCurva;
    private Button btnBbc;
    private Button btnCnn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCurva = findViewById(R.id.btnCurva);
        btnBbc = findViewById(R.id.btnBbc);
        btnCnn = findViewById(R.id.btnCnn);










        btnCurva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://news.google.com/covid19/map?hl=pt-BR&gl=BR&ceid=BR%3Apt-419&mid=%2Fm%2F015fr")));



            }
        });

        btnBbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  startActivity(new Intent(MainActivity.this,NoviActivity.class));
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.bbc.com/portuguese/topics/c340q430z4vt")));



            }
        });

        btnCnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.cnnbrasil.com.br/saude")));
            }
        });




    }
}
