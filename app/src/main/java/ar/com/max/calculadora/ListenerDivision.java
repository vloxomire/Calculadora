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
        Integer division = Integer.valueOf(context.getEditText1().getText().toString()) / Integer.valueOf(context.getEditText2().getText().toString());
        intent.putExtra("resultado",division);
        context.startActivity(intent);
    }
}
