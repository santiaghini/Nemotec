package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class P1Activity extends AppCompatActivity {

    int preguntaActual = 1;
    float b = 2.5f;
    ArrayList<String> listapreguntas = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);
        String name = getIntent().getStringExtra("name");
        Toast toast = Toast.makeText(getApplicationContext(),"Iniciaste como "+name,9);
        toast.show();
        preguntaActual = preguntaActual+1;
        b = b - 1.00f;
        listapreguntas.add(getString(R.string.preg1));
        listapreguntas.add(getString(R.string.preg2));
        listapreguntas.add(getString(R.string.preg3));
        listapreguntas.add(getString(R.string.preg4));
        listapreguntas.add(getString(R.string.preg5));
    }


    protected void








    protected void irA2(View view) {
        Intent intent = new Intent(P1Activity.this, P2Activity.class);
        startActivity(intent);
    }

    protected void regresaruno(View view) {
        Intent intent = new Intent(P1Activity.this, Landing2Activity.class);
        startActivity(intent);
    }


}
