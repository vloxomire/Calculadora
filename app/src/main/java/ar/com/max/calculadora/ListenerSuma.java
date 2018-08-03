package ar.com.max.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerSuma implements View.OnClickListener {
    MainActivity context;

    public ListenerSuma(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, Resultado.class);
        //context.getEditText1().getText().toString(); //llamo a memoria la direccion para usarlo
        Integer suma = Integer.valueOf(context.getEditText1().getText().toString()) + Integer.valueOf(context.getEditText2().getText().toString());
        intent.putExtra("resultado",suma);
        context.startActivity(intent);
    }
}
