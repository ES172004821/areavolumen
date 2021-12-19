package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class Resfera extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resfera);
        TextView ageText = findViewById(R.id.ageText);
        TextView volumen = findViewById(R.id.volumen);
         ageText.setText(Esfera.getArea()+"m²");
        volumen.setText(Esfera.getVolumen()+"m³");


    }
    public void finalizar(View view) {
        finishAffinity();

    }
    
    
    
    
    
}
