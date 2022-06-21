package com.example.ejercicio1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        String dato = getIntent().getStringExtra("dato");
        txtResultado.setText("" + dato);

        Button btnatras = (Button) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent pantalla = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantalla);
            }
        });


    }
}