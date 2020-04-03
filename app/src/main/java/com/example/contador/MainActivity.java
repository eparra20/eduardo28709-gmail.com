package com.example.contador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSumar;
    private Button buttonRestar;
    private TextView textViewContador;
    private Integer contador;

    private ImageView imageView;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.contador = 0;
        this.buttonSumar = findViewById(R.id.buttonSumar);
        this.buttonRestar = findViewById(R.id.buttonRestar);
        this.textViewContador = findViewById(R.id.textViewContador);
        this.imageView = findViewById(R.id.imageViewFrozen);


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

        this.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Libre soy", Toast.LENGTH_SHORT).show();
            }
        });

        this.imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "LONNNG", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

}
