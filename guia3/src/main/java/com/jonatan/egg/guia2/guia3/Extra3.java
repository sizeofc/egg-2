/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte
 * si se trata de una vocal. Caso contrario mostrar un mensaje. Nota:
 * investigar la función equals() de la clase String.
 *
 */
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra3 {

    public static void main(String[] args) {
        System.out.println("Ingrese una letra para ver si es una vocal:");
        Scanner leer = new Scanner(System.in);
        String letter = leer.next();

        if (letter.length() == 1) {
            switch (letter.toLowerCase().charAt(0)) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("Es una vocal");
                    break;
                default:
                    System.out.println("No es vocal");
            }
        }
    }
}
