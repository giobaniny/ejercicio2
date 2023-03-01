package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
TextView nombre, edad, correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nombre=(TextView) findViewById(R.id.resultnombre);
        edad=(TextView) findViewById(R.id.resultedad);
        correo=(TextView)findViewById(R.id.resultcorreo);

        limpiar();

        Intent datos= getIntent();
        String nombres=getIntent().getStringExtra("Nombre");
        String edades=getIntent().getStringExtra("Edad");
        String correos=getIntent().getStringExtra("correoelec");

        nombre.setText(nombres);
        edad.setText(edades);
        correo.setText(correos);

    }
    void limpiar(){
        nombre.setText("");
        edad.setText("");
        correo.setText("");
    }
}