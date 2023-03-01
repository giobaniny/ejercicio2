package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button mostrar;
EditText nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.txtnombre);
        apellido = (EditText)findViewById(R.id.txtapellido);
        edad = (EditText)findViewById(R.id.txtedad);
        correo = (EditText)findViewById(R.id.txtdireccion);
        mostrar = (Button) findViewById(R.id.btnagregar);
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nombre.getText().toString().isEmpty() && !apellido.getText().toString().isEmpty() && !edad.getText().toString().isEmpty() && !correo.getText().toString().isEmpty()) {


                    String nombretotal = nombre.getText().toString() + apellido.getText().toString();
                    Intent pantalla = new Intent(getApplicationContext(), Resultado.class);
                    pantalla.putExtra("Nombre", nombretotal);
                    pantalla.putExtra("Edad", edad.getText().toString());
                    pantalla.putExtra("correoelec", correo.getText().toString());
                    startActivity(pantalla);
                    limpiar();
                }
                else{
                    Toast mensaje = Toast.makeText(getApplicationContext(),"Campos vacios, el proceso se ejecutara una vez complete los campos", Toast.LENGTH_SHORT);
                    mensaje.show();
                }
            }
        });
    }
    void limpiar()
    {
        nombre.setText("");
        apellido.setText("");
        edad.setText("");
        correo.setText("");
    }
}