package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSumar;
    private Button buttonRestar;
    private TextView textViewContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonSumar = findViewById(R.id.buttonSumar);
        this.buttonRestar = findViewById(R.id.buttonRestar);
        this.textViewContador = findViewById(R.id.textViewContador);
    }
}
