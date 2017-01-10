package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    public void preguntauno(View view) {
        EditText name = (EditText) findViewById(R.id.landing_name);
        Intent intent = new Intent(LandingActivity.this, P1Activity.class);
        //putExtra es "llevalo a otra activity. get text obtiene un editable, pero necesitamos un string, por eso .toString
        intent.putExtra("name", name.getText().toString());
        startActivity(intent);
        Intent intent2 = new Intent(LandingActivity.this, EndActivity.class);
        intent2.putExtra("name2" , name.getText().toString());
    }
}
