package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        Toast toast = Toast.makeText(getApplicationContext(),"Correcto!",9);
        toast.show();
    }

    protected void irA4(View view) {
        Intent intent = new Intent(P3Activity.this, P4Activity.class);
        startActivity(intent);
    }

    protected void regresartres(View view) {
        Intent intent = new Intent(P3Activity.this, Landing2Activity.class);
        startActivity(intent);
    }

}
