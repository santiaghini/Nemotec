package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EndActivity extends AppCompatActivity {

    TextView answ;
    TextView puntfu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);


        String puntos = getIntent().getStringExtra("puntos");
        String name = getIntent().getStringExtra("name2");
        Toast punt = Toast.makeText(getApplicationContext() , name + " obtuviste " + puntos + " puntos" , Toast.LENGTH_LONG);
        punt.show();


        answ = (TextView) findViewById(R.id. ea_answ);
        puntfu = (TextView) findViewById(R.id. ea_puntfu);

        answ.setText(puntos);

    }

    protected void regresarEnd(View view) {
        Intent intent = new Intent(EndActivity.this, LandingActivity.class);
        startActivity(intent);
    }

    protected void irACalc(View view) {
        Intent intent = new Intent(EndActivity.this, CalcActivity.class);
        startActivity(intent);
    }
}
