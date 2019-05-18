package com.example.proyecto002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private TextView textView3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView3 = (TextView) findViewById(R.id.textView3);

        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //OBTIENE LA CADENA
                String valor1 = editText1.getText().toString();
                String valor2 = editText2.getText().toString();
                //SE HACE LA CONVERCION DE CADENA A ENTERO
                //int nro1 = Integer.parseInt(valor1);
                //int nro2 = Integer.parseInt(valor2);
                  double nro1 = Double.parseDouble(valor1);
                  double nro2 = Double.parseDouble(valor2);
                //SE REALIZA LA OPERACION
                double suma = nro1 + nro2;

                // SE CONVIERTE EL VALOR ENTERO RESULTANTE A TEXTO.
                String result = String.valueOf(suma);

                // SE MUESTRA EL RESULTADO
                textView3.setText(result);
            }
        });

    }


   /* public void sumar (View View){
        //OBTIENE LA CADENA
        String valor1 = editText1.getText().toString();
        String valor2 = editText2.getText().toString();
        //SE HACE LA CONVERCION DE CADENA A ENTERO
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        //SE REALIZA LA OPERACION
        int suma = nro1 + nro2;

        // SE CONVIERTE EL VALOR ENTERO RESULTANTE A TEXTO.
        String result = String.valueOf(suma);

        // SE MUESTRA EL RESULTADO
        textView3.setText(result);
    } */
}
