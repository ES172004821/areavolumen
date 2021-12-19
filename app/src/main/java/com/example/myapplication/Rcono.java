package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rcono extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcono);
        TextView Rarea = findViewById(R.id.Rarea);
        TextView Rvolumen = findViewById(R.id.Rvolumen);
        Rarea.setText(Cono.getArea()+"m²");
        Rvolumen.setText(Cono.getVolumen()+"m³");
    }
    public void finalizar(View view) {
        finishAffinity();
    }
}