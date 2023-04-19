/**
 * Crea una aplicación que le pida dos números al usuario y este
 * pueda elegir entre sumar, restar, multiplicar y dividir. La
 * aplicación debe tener una función para cada operación matemática
 * y deben devolver sus resultados para imprimirlos en el main.
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("ingrese un valor:");
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo valor:");
        num2 = leer.nextDouble();
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        int opc = leer.nextInt();
        
        if (opc == 1) {
            System.out.println(sumar(num1, num2));
        }
        if (opc == 2) {
            System.out.println(restar(num1, num2));
        }
        if (opc == 3) {
            System.out.println(multiplicar(num1, num2));
        }
        if (opc == 4) {
            if (num2 == 0) {
                System.out.println("No se puede dividir por Cero");
            } else {
                System.out.println(dividir(num1, num2));
            }
        }
    }

    public static double sumar(double n, double n2) {
        return n + n2;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
