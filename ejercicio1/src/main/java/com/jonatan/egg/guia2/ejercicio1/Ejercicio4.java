/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package com.jonatan.egg.guia2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese grados centigrados para convertin en Farenheit: ");
        double C= leer.nextDouble();
        System.out.println(C+" en Farenheit= "+ (32+(9*C/5)));
    }
}