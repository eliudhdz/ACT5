package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x,y,sum,res,mul,div,mod;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Hola,en el siguiente programa podras realizar la suma,resta,multiplicación,division y modulo de dos numeros ");
        System.out.println("dame el primer número");
        x= keyboard.nextDouble();
        System.out.println("dame el segundo número");
        y= keyboard.nextDouble();
        sum=x+y;
        res=x-y;
        mul=x*y;
        div=x/y;
        mod=x%y;
        System.out.println("el resultado de la suma es "+ sum);
        System.out.println("el resultado de la resta es "+ res);
        System.out.println("el resultado de la multiplicacion es "+ mul);
        System.out.println("el resultado de la division es "+ div);
        System.out.println("el resultado del modulo es "+ mod);




    }
}
