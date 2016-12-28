package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
        Toast toast = Toast.makeText(getApplicationContext(),"Correcto!",9);
        toast.show();
    }

    protected void irAEnd(View view) {
        Intent intent = new Intent(P5Activity.this, EndActivity.class);
        startActivity(intent);
    }

    protected void regresarcinco(View view) {
        Intent intent = new Intent(P5Activity.this, Landing2Activity.class);
        startActivity(intent);
    }
}
