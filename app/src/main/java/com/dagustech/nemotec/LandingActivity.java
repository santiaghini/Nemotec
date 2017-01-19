package com.dagustech.nemotec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        peticion();
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

    public void peticion() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://54.157.44.249/estudiantes";
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("response", response);
            }

        }
                , new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("error" , error.toString());
            }
        });
        queue.add(request);


    }
}
