package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {
    public static String altura;
    public static String radio;
    public static String resultado;
    public static String getArea( ) {
        Double nro1=Double.parseDouble(altura);
        Double nro2=Double.parseDouble(radio);
        Double area = 6.282*nro2*nro1*nro2;
         resultado = String.valueOf(area);
        return resultado;
    }
    public static String getVolumen( ) {
        Double nro1=Double.parseDouble(altura);
        Double nro2=Double.parseDouble(radio);
        Double area = 3.141*nro2*nro2*nro1;
        resultado = String.valueOf(area);
        return resultado;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        EditText h = findViewById(R.id.h);
        EditText r = findViewById(R.id.r);
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 altura = h.getText().toString() ;
                radio = r.getText().toString() ;

                Intent intent = new Intent(Cilindro.this, Rcilindro.class);
                startActivity(intent);
            }
        });
    }

    public void finalizar(View view) {
        finish();
    }
}
