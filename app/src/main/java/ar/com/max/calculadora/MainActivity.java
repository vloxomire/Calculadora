package ar.com.max.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button button1, button2, button3, button4;
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerDivision listenerDivision;
    private ListenerMultiplicacion listenerMultiplicacion;

//GENERADO DE LOS GET
    public EditText getEditText1() {
        return editText1;
    }

    public EditText getEditText2() {
        return editText2;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        //VINCULO LISTENER
        listenerSuma = new ListenerSuma(this);
        listenerResta = new ListenerResta(this);
        listenerDivision = new ListenerDivision(this);
        listenerMultiplicacion = new ListenerMultiplicacion(this);

        //seteo onclick en listener
        button1.setOnClickListener(listenerSuma);
        button2.setOnClickListener(listenerResta);
        button3.setOnClickListener(listenerDivision);
        button4.setOnClickListener(listenerMultiplicacion);
    }
}
