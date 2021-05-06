package com.example.holamundoandroid.n17011191;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    //Definimos los componentes en el lado de java
    private EditText editText2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Enlazamos los componentes en su vista en XML
        editText2=findViewById(R.id.ediText2);
        button3=findViewById(R.id.button3);

        //Recuperamos el paquete enviado
        Bundle bundle= this.getIntent().getExtras();
        //Recuperamos el nombre dentro del paquete
        String tmp =bundle.get("nombre").toString()+" "+bundle.get("aPaterno").toString()+" "+bundle.get("aMaterno").toString();
        //Mostramos el texto recuperado
        editText2.setText(tmp);

        //Al botón Regresar le agregamos un escuchador
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Creamos la intención de lanzar la nueva actividad
                        Intent intent= new Intent(
                                MainActivity2.this, MainActivity.class
                        );
                        //Lanzamos la nueva actividad
                        startActivity(intent);
                    }
                }
        );
    }
}