package com.example.aluno.aulaandoid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText num1EditText;
    private EditText num2EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1EditText =findViewById(R.id.numero1EditText);
        num2EditText =findViewById(R.id.numero2EditText);
    }
    public void calcular(View v){
        String num1Text = num1EditText.getText().toString();
        String num2Text =num2EditText.getText().toString();

        int num1 = Integer.parseInt(num1Text);
        int num2 = Integer.parseInt(num2Text);

        int result = num1 + num2;

        Toast.makeText(this,"o resultado é" + result, Toast.LENGTH_SHORT);

    }
}
