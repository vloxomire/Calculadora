package ar.com.max.calculadora;

import android.view.View;

public class ListenerMultiplicacion implements View.OnClickListener{ //INTERFAZE DE ONCLICK
    MainActivity context;   //OBJETO ACTIVITY
//CONSTRUCTOR
    public ListenerMultiplicacion(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

    }
}
