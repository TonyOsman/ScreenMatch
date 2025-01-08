package br.com.alura.screenmatch.pratica;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        var num1 = 0;
        var num2 = 0;

        try {
            System.out.println("Informe o primeiro numero: ");
            num1 = entrada.nextInt();
            System.out.println("Informe o segundo numero: ");
            num2 = entrada.nextInt();


        var total = num1 / num2;
        System.out.println("Total : "+total);

        } catch (java.lang.ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        }
    }
    }


