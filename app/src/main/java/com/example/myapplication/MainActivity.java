package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void esfera(View view){
        Intent i = new Intent(this, Esfera.class);
        startActivity(i);



    }
    public void cilindro(View view){
        Intent i = new Intent(this, Cilindro.class);
        startActivity(i);
    }
    public void cono(View view){
        Intent i = new Intent(this, Cono.class);
        startActivity(i);
    }







}