package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcilindro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcilindro);
        TextView ResultadoA = findViewById(R.id.ResultadoA);
        TextView ResultadoV = findViewById(R.id.ResultadoV);
         ResultadoA.setText(Cilindro.getArea()+"m²");
        ResultadoV.setText(Cilindro.getVolumen()+"m³");

    }
    public void finalizar(View view) {
        finishAffinity();

    }

}