/**
 * Realizar un algoritmo que llene un vector con los 100 primeros 
 * números enteros y los muestre por pantalla en orden descendente
 */

package com.jonatan.egg.guia5;

/**
 *
 * @author Alexi
 */
public class Guia5 {

    public static void main(String[] args) {
        int v[]= new int[100];
        System.out.println("Cargo el vector con 100 elementos");
        llenarVector(v, 100);
        System.out.println("Muestro el vector desendente");
        mostrarVector(v);
    }
    
    public static void llenarVector(int v[],int dimention){
        for(int i=0;i<dimention;i++){
            v[i]=i;
        }
    }
    
    public static void mostrarVector(int v[]){
        for(int i=v.length-1;i>0;i--){
            System.out.println(v[i]);
        }
    }
}
