package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSumar;
    private Button buttonRestar;
    private TextView textViewContador;
    private Integer contador;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.contador = 0;
        this.buttonSumar = findViewById(R.id.buttonSumar);
        this.buttonRestar = findViewById(R.id.buttonRestar);
        this.textViewContador = findViewById(R.id.textViewContador);

        // pedirle el texto al textView
        // pasar este texto a Integer.
        // Sumarle uno.
        //setearle al textView el valor nuevo.
        this.buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String texto = textViewContador.getText().toString();
                Integer textoEnFormatoNumero = Integer.parseInt(texto);
                Integer nuevoValor = textoEnFormatoNumero + 1;
                textViewContador.setText(nuevoValor.toString());*/
                contador++;
                textViewContador.setText(contador.toString());
            }
        });


        this.buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                textViewContador.setText(contador.toString());
            }
        });


    }
}
