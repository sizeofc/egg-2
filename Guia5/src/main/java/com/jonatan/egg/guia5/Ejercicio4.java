/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores
 * aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta
 * de una matriz A se denota por B y se obtiene cambiando sus filas por
 * columnas (o viceversa).
 */
package com.jonatan.egg.guia5;

import java.util.Random;

/**
 *
 * @author Alexi
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
    public static void main(String[] args) {
        int m[][] = new int[4][4];

        llenarMatriz(m, 4);
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m);
        
    }

    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10
     */
    public static void llenarMatriz(int v[][], int dimention) {
        //llena el vector con valores aleatorios del 0 al 100 de n elementos
        Random rand = new Random();
        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                v[i][j] = rand.nextInt(10);
            }
        }
    }
    
    
    public static void matrizTraspuesta(int m[][]){
        for(int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                System.out.print("["+ m[c][f]+"]");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatriz(int m[][]){
        for(int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                System.out.print("["+m[f][c]+"]");
            }
            System.out.println("");
        }
    }
}
