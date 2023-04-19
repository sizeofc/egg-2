/**
 * Realizar un algoritmo que llene un vector de tamaño N con
 * valores aleatorios y le pida al usuario un número a buscar en
 * el vector. El programa mostrará dónde se encuentra el numero y
 * si se encuentra repetido
 */
package com.jonatan.egg.guia5;

import static com.jonatan.egg.guia5.Guia5.llenarVector;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int n;
        System.out.println("ingrese cuantos elementos tendra el vector:");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        
        int v[] = new int[n];
        llenarVector(v, n);
        
        System.out.println("Ingrese que numero desea buscar:");
        int buscar= leer.nextInt();
        
        buscarNumero(v, buscar);
    }

    public static void llenarVector(int v[], int dimention) {
        //llena el vector con valores aleatorios del 0 al 100 de n elementos
        Random rand = new Random();
        for (int i = 0; i < dimention; i++) {
            v[i] = rand.nextInt(101);
        }
    }

    public static void buscarNumero(int v[], int n) {
        int pos = 0, con = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                con++;
            }
            if (con == 1) {
                pos = i;
            }

        }
        if (con > 0) {
            System.out.println("el numero " + n + " Se encuentra en la pos:" + pos);
            System.out.println("Se repite " + con + " veces");
        }else{
            System.out.println("No se encontro el numero!1");
        }
    }
}
