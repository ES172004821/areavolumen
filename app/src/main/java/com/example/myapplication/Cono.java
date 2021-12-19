package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cono extends AppCompatActivity {
private static String altura;
private static String radio;
private static String incalt;
    public static String resultado;

    public static String getArea( ) {

        Double nro2=Double.parseDouble(radio);
        Double nro3=Double.parseDouble(incalt);
        Double area = 3.141*nro2*nro3+3.141*nro2*nro2;
        resultado = String.valueOf(area);
        return resultado;
    }
    public static String getVolumen( ) {
        Double nro1=Double.parseDouble(altura);
        Double nro2=Double.parseDouble(radio);
        Double volumen = 0.333333333*3.141*nro2*nro2*nro1;
        resultado = String.valueOf(volumen);
        return resultado;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        EditText rcono = findViewById(R.id.rcono);
        EditText acono = findViewById(R.id.acono);
        EditText aicono = findViewById(R.id.aicono);
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio = rcono.getText().toString() ;
                altura = acono.getText().toString() ;
                incalt = aicono.getText().toString() ;
                Intent intent = new Intent(Cono.this, Rcono.class);
                startActivity(intent);
            }
        });
    }

    public void finalizar(View view) {
        finish();
    }
}