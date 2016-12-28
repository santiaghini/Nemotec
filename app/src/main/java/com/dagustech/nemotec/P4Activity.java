package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);
        Toast toast = Toast.makeText(getApplicationContext(),"Correcto!",9);
        toast.show();
    }

    protected void irA5(View view) {
        Intent intent = new Intent(P4Activity.this, P5Activity.class);
        startActivity(intent);
    }

    protected void regresarcuatro(View view) {
        Intent intent = new Intent(P4Activity.this, Landing2Activity.class);
        startActivity(intent);
    }
}

