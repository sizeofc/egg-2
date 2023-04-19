/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a 
 * su propia traspuesta, pero cambiada de signo. Es decir, A es 
 * antisimétrica si A = -AT. La matriz traspuesta de una matriz A 
 * se denota por AT y se obtiene cambiando sus filas por columnas 
 * (o viceversa).
 */
package com.jonatan.egg.guia5;

import java.util.Random;

/**
 *
 * @author Alexi
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int f=3,c=3;
        int m[][] = {{0,-2,4},{2,0,2},{-4,-2,0}} ;//new int[f][c];
        int mt[][]= new int[f][c];
        
        
        //llenarMatriz(m, f);           //quitar comentarios para probar con valores aleatorios
        System.out.println("MATRIZ A");
        mostrarMatriz(m);
        
        System.out.println("TRASPUESTA DE A");
        matrizTraspuesta(m,mt);
        mostrarMatriz(mt);
        
        if(esTraspuesta(m, mt)){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
            
        
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
    
    
    public static void matrizTraspuesta(int m[][],int[][] mt){
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m.length;c++){
               mt[f][c]= m[c][f];
            }
        }
    }

    public static void mostrarMatriz(int m[][]){
        for(int f=0;f<m.length;f++){
            for(int c=0;c<m.length;c++){
                System.out.print("["+m[f][c]+"]");
            }
            System.out.println("");
        }
    }
    
    public static boolean esTraspuesta(int[][] a, int[][] at){
        for(int f=0;f<a.length;f++){
            for(int c=0;c<a.length;c++){
                if(a[f][c]*-1!=at[f][c]){
                    return false;
                }
            }
        }
        return true;
    }
}