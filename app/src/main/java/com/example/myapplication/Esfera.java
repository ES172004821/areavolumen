package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;






public class Esfera extends AppCompatActivity {
    private static String valorArea;
    private static String valorVolumen;
    public static String getArea() {
        Double nro1=Double.parseDouble(valorArea);
        Double area = (4*3.141*nro1*nro1);
        valorArea = String.valueOf(area);
        return valorArea ;
    }
    public static String getVolumen() {
        Double nro2=Double.parseDouble(valorVolumen);
        Double volumen = (1.333333333333*3.141*nro2*nro2*nro2);
        valorVolumen = String.valueOf(volumen);
        return valorVolumen ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        final EditText mAge = findViewById(R.id.mAge);
        Button besfera = findViewById(R.id.besfera);
        besfera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorArea = mAge.getText().toString() ;
                valorVolumen = mAge.getText().toString() ;

                Intent intent = new Intent(Esfera.this, Resfera.class);
                startActivity(intent);
            }
        });
    }
    public void finalizar(View view) {
        finish();
    }
}









