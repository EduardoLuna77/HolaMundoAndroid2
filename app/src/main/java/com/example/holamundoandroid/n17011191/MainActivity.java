package com.example.holamundoandroid.n17011191;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaramos los componentes del lado de java
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private Button  button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definimos los componentes de nuestra interfaz

       editText1 = findViewById(R.id.ediText1);
       editText2 = findViewById(R.id.ediText2);
       editText3 = findViewById(R.id.ediText3);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);

       //Agregamos un escuchador al botón saludo
       button1.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       //Creamos un paquete que contendrá nuestros datos
                       Bundle bundle = new Bundle();
                       //Guardamos el nombre tecleado
                       bundle.putString("nombre",
                               editText1.getText().toString());
                       bundle.putString("aPaterno",
                               editText2.getText().toString());
                       bundle.putString("aMaterno",
                               editText3.getText().toString());
                       //Creamos la intención de lanzar la nueva actividad
                       Intent intent = new Intent(
                                MainActivity.this, MainActivity2.class
                       );
                       //Montamos el paquete sobre la intención
                       intent.putExtras(bundle);
                       //Lanzamos la nueva actividad
                       startActivity(intent);

                   }
               }
       );
        //Agregamos un escuchador al botón salir
       button2.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       System.exit(0);
                   }
               }
       );

    }
}