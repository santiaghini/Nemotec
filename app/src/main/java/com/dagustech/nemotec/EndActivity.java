package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    protected void regresarEnd(View view) {
        Intent intent = new Intent(EndActivity.this, Landing2Activity.class);
        startActivity(intent);
    }

    protected void irACalc(View view) {
        Intent intent = new Intent(EndActivity.this, CalcActivity.class);
        startActivity(intent);
    }
}
