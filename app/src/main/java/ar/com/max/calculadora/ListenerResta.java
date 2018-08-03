package ar.com.max.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerResta implements View.OnClickListener {
    MainActivity context;

    public ListenerResta(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, Resultado.class);
        Integer resta = Integer.valueOf(context.getEditText1().getText().toString()) - Integer.valueOf(context.getEditText2().getText().toString());
        intent.putExtra("resultado", resta);
        context.startActivity(intent);
    }
}
