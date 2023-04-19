/**
 * Crear una función rellene un vector con números aleatorios, 
 * pasándole un arreglo por parámetro. Después haremos otra función o 
 * procedimiento que imprima el vector.
 */
package com.jonatan.egg.guia5;

import java.util.Random;

/**
 *
 * @author Alexi
 */
public class Extra3 {
    public static void main(String[] args) {
        int []v=new int[5];
        cargarVector(v);
        mostrarVector(v);
    }
    
    public static void cargarVector(int v[]){
        Random rand=new Random();
        for (int i = 0; i < v.length; i++) {
            v[i]=rand.nextInt(10);
        }
    }
    
    public static void mostrarVector(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+v[i]+"]");
        }
    }
}
