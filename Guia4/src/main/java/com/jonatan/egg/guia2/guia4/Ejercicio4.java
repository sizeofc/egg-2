/**
 * Crea una aplicación que nos pida un número por teclado y con
 * una función se lo pasamos por parámetro para que nos indique
 * si es o no un número primo, debe devolver true si es primo,
 * sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin
 * embargo, 17 si es primo.
 *
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero para determinar si es primo:");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if(esPrimo(num)==true){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }

    //El blucle no tiene en cuenta el 2 ni el mismo numero
    //si en el if entra una sola vez quiere decir que ya es par
    //por lo que devuelve false
    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
