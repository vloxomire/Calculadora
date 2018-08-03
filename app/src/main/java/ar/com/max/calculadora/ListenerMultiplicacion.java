package ar.com.max.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerMultiplicacion implements View.OnClickListener{ //INTERFAZE DE ONCLICK
    MainActivity context;   //OBJETO ACTIVITY
    private int a ;
//CONSTRUCTOR
    public ListenerMultiplicacion(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(context, Resultado.class);
        Integer multiplicacion = Integer.valueOf(context.getEditText1().getText().toString()) * Integer.valueOf(context.getEditText2().getText().toString());
        intent.putExtra("resultado", multiplicacion);
        context.startActivity(intent);
    }
}
