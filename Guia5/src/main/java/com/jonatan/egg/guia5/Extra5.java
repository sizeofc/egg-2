/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 */
package com.jonatan.egg.guia5;

import java.util.Random;

/**
 *
 * @author Alexi
 */
public class Extra5 {

    public static void main(String[] args) {
        int sum=0,v[][] = new int[5][5];
        sum=cargarMatrizAleatoria(v);
        mostrarMatriz(v);
        System.out.println("La suma de los elementos de la matriz es:"+sum);
    }

    public static int cargarMatrizAleatoria(int m[][]) {
        Random rand = new Random();
        int sum = 0;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                m[f][c] = rand.nextInt(10);
                sum += m[f][c];
            }
        }
        return sum;
    }

    public static void mostrarMatriz(int m[][]) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                System.out.print("[" + m[f][c] + "]");
            }
            System.out.println("");
        }
    }
}
