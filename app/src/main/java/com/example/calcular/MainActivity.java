package com.example.calcular;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity<EditText> extends Activity {
EditText ed1;
EditText ed2;
Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.numberone);
        ed2 = (EditText) findViewById(R.id.numbertwo);
        bt = (Button) findViewById(R.id.calculate);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double valorGasolina = ed1.getText().toString();
                Double valorEtanol = Double.parseDouble(ed2.getText().toString());

                double i = valorEtanol / valorGasolina;

                if (i > 0.7) {
                    Toast.makeText(MainActivity.this, "Compensa gasolina", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Compensa Etanol", Toast.LENGTH_SHORT).show();
                }



            }


        });
    }
}
