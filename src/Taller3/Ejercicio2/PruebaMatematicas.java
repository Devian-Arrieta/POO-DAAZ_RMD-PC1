package Taller3.Ejercicio2;

import java.util.Scanner;

public class PruebaMatematicas {

    public static void main(String[] args) {

        double num1 = 2, num2 = 4;

        double resultadoSuma = Matematicas.sumar(num1, num2);
        System.out.println("El resultado de la suma "+num1+ " + "+ num2+ " es: " + resultadoSuma);

        double resultadoResta = Matematicas.restar(num1, num2);
        System.out.println("El resultado de la resta "+num1+ " - "+ num2+ " es: " + resultadoResta);

        double resultadoMultiplicacion = Matematicas.multiplicar(num1, num2);
        System.out.println("El resultado de la multiplicación "+num1+ " x "+ num2+ " es: " + resultadoMultiplicacion);

        double resultadoDivision = Matematicas.dividir(num1, num2);
        System.out.println("El resultado de la división "+num1+ " ÷ "+ num2+ " es: " + resultadoMultiplicacion);
    }
}
