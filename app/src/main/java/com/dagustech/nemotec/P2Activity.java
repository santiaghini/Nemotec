package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class P2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        Toast toast = Toast.makeText(getApplicationContext(),"Correcto!",9);
        toast.show();
    }

    protected void irA3(View view) {
        Intent intent = new Intent(P2Activity.this, P3Activity.class);
        startActivity(intent);
    }

    protected void regresardos(View view) {
        Intent intent = new Intent(P2Activity.this, Landing2Activity.class);
        startActivity(intent);
    }

}
