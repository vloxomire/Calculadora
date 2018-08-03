package ar.com.max.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Resultado extends AppCompatActivity {

    private EditText editText3;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        editText3 = findViewById(R.id.editText3);

        Bundle bolsa = new Bundle(); // creo bolsa, para recibir los clases  de suma, division, etc

        bolsa = getIntent().getExtras(); // guardo los datos pasados del intent

        Integer dato = bolsa.getInt("resultado");

            editText3.setText(String.valueOf(dato));

    }
}
