package ar.com.max.calculadora;

import android.content.Intent;
import android.view.View;

public class ListenerDivision implements View.OnClickListener {
    MainActivity context;

    public ListenerDivision(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, Resultado.class);
        context.startActivity(Resultado);
    }
}
