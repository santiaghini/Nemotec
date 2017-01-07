package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class P1Activity extends AppCompatActivity {

    int preguntaActual = 0;
    ArrayList<String> listapreguntas = new ArrayList<String>();
    ArrayList<String> listatits = new ArrayList<String>();
    ArrayList<String> listaopca = new ArrayList<String>();
    ArrayList<String> listaopcb = new ArrayList<String>();
    ArrayList<Integer> listaimages = new ArrayList<Integer>();
    ArrayList<String> listacorrectas = new ArrayList<String>();

    Button opcA;
    Button opcB;
    TextView tit;
    TextView preg;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);

        opcA = (Button) findViewById(R.id.p1_a);
        opcB = (Button) findViewById(R.id.p1_b);
        tit = (TextView) findViewById(R.id.p1_texttitulo);
        preg = (TextView) findViewById(R.id.p1_textpreg);
        image = (ImageView) findViewById(R.id.p1_image);

        String name = getIntent().getStringExtra("name");
        Toast toast = Toast.makeText(getApplicationContext(),"Iniciaste como "+name,Toast.LENGTH_LONG);
        toast.show();


        listapreguntas.add(getString(R.string.preg1)); //0
        listapreguntas.add(getString(R.string.preg2)); //1
        listapreguntas.add(getString(R.string.preg3)); //2
        listapreguntas.add(getString(R.string.preg4));
        listapreguntas.add(getString(R.string.preg5));

        listaopca.add(getString(R.string.p1_a));
        listaopca.add(getString(R.string.p2_a));
        listaopca.add(getString(R.string.p3_a));
        listaopca.add(getString(R.string.p4_a));
        listaopca.add(getString(R.string.p5_a));

        listaopcb.add(getString(R.string.p1_b));
        listaopcb.add(getString(R.string.p2_b));
        listaopcb.add(getString(R.string.p3_b));
        listaopcb.add(getString(R.string.p4_b));
        listaopcb.add(getString(R.string.p5_b));

        listatits.add(getString(R.string.p1));
        listatits.add(getString(R.string.p2));
        listatits.add(getString(R.string.p3));
        listatits.add(getString(R.string.p4));
        listatits.add(getString(R.string.p5));

        listaimages.add(R.drawable.bruselas);
        listaimages.add(R.drawable.telefono);
        listaimages.add(R.drawable.wright);
        listaimages.add(R.drawable.internet);
        listaimages.add(R.drawable.pagani);

    }


    protected void nextQ (View view) {
        preguntaActual = preguntaActual + 1 < listatits.size() ? preguntaActual + 1 : 0 ;
        tit.setText(listatits.get(preguntaActual));
        preg.setText(listapreguntas.get(preguntaActual));
        opcA.setText(listaopca.get(preguntaActual));
        opcB.setText(listaopcb.get(preguntaActual));
        image.setImageResource(listaimages.get(preguntaActual));

    }


    protected void prevQ (View view) {
        preguntaActual = preguntaActual == 0 ? listatits.size() - 1 : preguntaActual - 1 ;
        tit.setText(listatits.get(preguntaActual));
        preg.setText(listapreguntas.get(preguntaActual));
        opcA.setText(listaopca.get(preguntaActual));
        opcB.setText(listaopcb.get(preguntaActual));
        image.setImageResource(listaimages.get(preguntaActual));

    }
















    protected void irA2(View view) {
        Intent intent = new Intent(P1Activity.this, P2Activity.class);
        startActivity(intent);
    }

    protected void regresaruno(View view) {
        Intent intent = new Intent(P1Activity.this, Landing2Activity.class);
        startActivity(intent);
    }


}
