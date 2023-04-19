/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
 * del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales 
 * son idénticas. Crear un programa que permita introducir un cuadrado 
 * por teclado y determine si este cuadrado es mágico o no. El programa 
 * deberá comprobar que los números introducidos son correctos, es decir, 
 * están entre el 1 y el 9.
 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int n=3, m[][]= new int[n][n];
        System.out.println("Cargar Matriz "+n+"x"+n);
        Scanner leer = new Scanner(System.in);
        
        //CARGAMOS LA MATRIZ CON CADA VALOR
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("-Ingrese un valor ["+i+"]["+j+"]");
                m[i][j]=leer.nextInt();
            }
        }
        
        mostrarMatriz(m);
        int tot= sumarFila(m, 0);
        boolean esMagica=false;
        
        //COMPARO EL VALOR DE LAS FILAS CON LA PRIMERA
        for(int f=1;f<n-1;f++){
            if(sumarFila(m, f)!=tot){
                esMagica&=false;
                break;
            }
        } 
        esMagica=true;
        
        //COMPARO LA SUMA DE LAS COLUMNAS CON LA SUMA DE LA PRIMERA FILA Q ESTA EN TOT
        for (int i = 0; i < n; i++) {
            if(sumarColumna(m, i)!=tot){
                esMagica=false;
                break;
            }
        }
        
        esMagica&=true;
        
        //COMPRUEBO SI EL TOTAL DE LA DIAGONAL PRINCIPAL ES IGUAL A TOT
        if(sumarDiagonal_1(m)!=tot){
            esMagica&=false;
        }else{
            esMagica=true;
        }
        
        //COMPRUEBO SI EL TOTAL DE LA DIAGONAL SECUNDARIA ES IGUAL A TOT
        if(sumarDiagonal_2(m)!=tot){
            esMagica&=false;
        }else{
            esMagica=true;
        }
        
        
        
        if(esMagica){
            System.out.println("La Matriz es magica");
        }else{
            System.out.println("La matriz no es magica");
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
     
     public static int sumarColumna(int[][] m,int numColumna){
         int sum=0;
         for(int f=0;f<m.length;f++){
             sum=sum+ m[f][numColumna];
         }
         return sum;
     }
     
       public static int sumarFila(int[][] m,int numFila){
         int sum=0;
         for(int c=0;c<m.length;c++){
             sum=sum+ m[numFila][c];
         }
         return sum;
     }
       
       public static int sumarDiagonal_1(int m[][]){
           int sum=0;
           for (int i = 0; i < m.length; i++) {
               sum+=m[i][i];
           }
           return sum;
       }
       
        public static int sumarDiagonal_2(int m[][]){
           int sum=0;
           for (int i = 0; i < m.length; i++) {
               sum+=m[i][m.length-1-i];
           }
           return sum;
       }
}
