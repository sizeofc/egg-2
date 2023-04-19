/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de 
 * un vector de tamaño N, con los valores ingresados por el usuario.
 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Ingrese la cantidad de elementos del vector:");
        Scanner leer = new Scanner(System.in);
        n=leer.nextInt();
        int sum=0, vec[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+"-ingrese valor:");
            vec[i]=leer.nextInt();
            sum+=vec[i];
        }
        
        System.out.println("La suma de todos los elementos es:"+sum);
    }
}
