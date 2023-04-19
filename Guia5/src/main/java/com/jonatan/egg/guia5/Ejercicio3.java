/**
 * Recorrer un vector de N enteros contabilizando cuántos números
 * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package com.jonatan.egg.guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("ingrese cuantos numeros cargar al vector:");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        
        int v[] = new int[n];
        llenarVector(v, n);
        
        contavilizarDigitos(v);
    }

    /**
     *SE LE PASA UN NUMERO Y DEVUELVE CUANTOS DIGITOS TIENE ESE NUMERO
     * SE PODRIA CONVERTIR EL NUMERO A TEXTO Y USAR .LENGHT PARA SABER LOS DIGITOS
     */
    public static int cantidadDigitos(int n) {
        int con=0;
        if(n<10){
            return 1;
        }else{
            while(n!=0){
                n=n/10;
                con++;
            }
        }
        return con;
    }
    
    /**
     * LLENA EL VECTOR CON NUMEROS ALEATORIOS DEL 0 AL 10000
     */
    public static void llenarVector(int v[], int dimention) {
        //llena el vector con valores aleatorios del 0 al 100 de n elementos
        Random rand = new Random();
        for (int i = 0; i < dimention; i++) {
            v[i] = rand.nextInt(10001);
        }
    }
    
    /**
     * SE LE PASA UN VECTOR Y MUESTRA EN CONSOLA CUANTOS DIGITOS HAY
     * DE 1 DIGITO A 5 DIGITOS
     */
    public static void contavilizarDigitos(int v[]){
        int canDigitos[]= new int[5];
        
        /**
         * uso el vector y si la funcion catidadDigitos me devuelve por ejemplo 2
         * incrementa en la posicion 2-1, en uno
         * eje digito[2-1]++
         */
        for(int i=0;i<v.length;i++){
            canDigitos[cantidadDigitos(v[i])-1]++;
        }
        
        for(int i=0;i<5;i++){
            System.out.println("cantidad numeros de "+(i+1)+" digito es:"+canDigitos[i]);
        }
    }
}
