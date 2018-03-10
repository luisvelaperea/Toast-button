package com.avrperu.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button miboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button miboton = findViewById(R.id.button);
        miboton =findViewById(R.id.button);
        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarTostada();
            }
        });
    }

    public void mostrarTostada(){
        Context c = getApplicationContext();
        String mensaje = "Bienvenido";
        Toast mitostada = Toast.makeText(c,mensaje,Toast.LENGTH_LONG);
        mitostada.show();

       // Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_LONG.show();





    }

}
