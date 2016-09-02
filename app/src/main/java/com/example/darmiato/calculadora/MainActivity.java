package com.example.darmiato.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Calculadora calculadora = new Calculadora();

    public void setCampo(View view){

        Button btn = (Button) view;
        EditText campo = (EditText) findViewById(R.id.idCampo);

        String strOld = campo.getText().toString();
        String strNew = btn.getText().toString();

        campo.setText(strOld+strNew);
        campo.setSelection(campo.getText().length());
    }


    public void soma(View view){
        EditText campo = (EditText) findViewById(R.id.idCampo);
        String strOld = campo.getText().toString();

        campo.setText(strOld+"+");
        campo.setSelection(campo.getText().length());


        calculadora.setNum1(Integer.parseInt(strOld));
        calculadora.setOperator("+");
    }

    public void sub(View view){
        EditText campo = (EditText) findViewById(R.id.idCampo);
        String strOld = campo.getText().toString();

        campo.setText(strOld+"-");
        campo.setSelection(campo.getText().length());


        calculadora.setNum1(Integer.parseInt(strOld));
        calculadora.setOperator("-");
    }

    public void mult(View view){
        EditText campo = (EditText) findViewById(R.id.idCampo);
        String strOld = campo.getText().toString();

        campo.setText(strOld+"x");
        campo.setSelection(campo.getText().length());


        calculadora.setNum1(Integer.parseInt(strOld));
        calculadora.setOperator("x");
    }

    public void div(View view){
        EditText campo = (EditText) findViewById(R.id.idCampo);
        String strOld = campo.getText().toString();

        campo.setText(strOld+"/");
        campo.setSelection(campo.getText().length());


        calculadora.setNum1(Integer.parseInt(strOld));
        calculadora.setOperator("/");

    }

    public void result(View view){

        int numero1 = calculadora.getNum1();
        int numero2 = calculadora.getNum2();
        int resultado=0;

        StringBuilder strInicio = new StringBuilder();

        strInicio.append(numero1);
        strInicio.append(calculadora.getOperator());


        EditText campo = (EditText) findViewById(R.id.idCampo);
        String strOld = campo.getText().toString();
        String num2 = strOld.replace(strInicio,"");



        calculadora.setNum2(Integer.parseInt(num2));

        if(calculadora.getOperator().equalsIgnoreCase("+")){
            resultado=numero1+numero2;
        }else if(calculadora.getOperator().equalsIgnoreCase("-")){
            resultado=numero1-numero2;
        }else if(calculadora.getOperator().equalsIgnoreCase("x")){
            resultado=numero1*numero2;
        }else if(calculadora.getOperator().equalsIgnoreCase("/")){
            resultado=numero1/numero2;
        }

        StringBuilder resultadoStr = new StringBuilder();
        resultadoStr.append(resultado);

        campo.setText(resultadoStr);
        campo.setSelection(campo.getText().length());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
