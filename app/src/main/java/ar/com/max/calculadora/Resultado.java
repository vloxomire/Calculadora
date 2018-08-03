package ar.com.max.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bolsa = new Bundle(); // creo bolsa, para recibir los clases  de suma, division, etc

        bolsa = getIntent().getExtras(); // guardo los datos pasados del intent

        Integer dato = bolsa.getInt("resultado");


    }
}
