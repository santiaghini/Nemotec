package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Landing2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing2);
        Toast toast = Toast.makeText(getApplicationContext(),"Mmm, eso estuvo mal! Intenta otra vez",15);
        toast.show();
    }

    public void preguntaunoo(View view) {
        EditText name = (EditText) findViewById(R.id.landing2_name);
        Intent intent = new Intent(Landing2Activity.this, P1Activity.class);
        //putExtra es "llevalo a otra activity. get text obtiene un editable, pero necesitamos un string, por eso .toString
        intent.putExtra("name", name.getText().toString());
        startActivity(intent);
    }
}

