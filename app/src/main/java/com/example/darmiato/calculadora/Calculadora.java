package com.example.darmiato.calculadora;

/**
 * Created by darmiato on 31/08/16.
 */
public class Calculadora {
    private String operator;
    private int num1;
    private int num2;

    public void setOperator(String op){
        operator=op;
    }

    public String getOperator(){
        return operator;
    }


    public void setNum1(int num){
        num1=num;
    }

    public int getNum1(){
        return num1;
    }


    public void setNum2(int num){
        num2=num;
    }

    public int getNum2(){
        return num2;
    }
}
