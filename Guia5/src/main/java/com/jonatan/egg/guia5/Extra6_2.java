/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
 * caracteres y, a medida que el usuario las va ingresando, construya
 * una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
 * palabras se ubicarán todas en orden horizontal en una fila que será
 * seleccionada de manera aleatoria. Una vez concluida la ubicación de
 * las palabras, rellene los espacios no utilizados con un número
 * aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de
 * letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan
 * las siguientes funciones de Java substring(), Length() y Math.random().
 */
package com.jonatan.egg.guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra6_2 {

    public static void main(String[] args) {
        String palabra;
        char m[][] = new char[20][20];

        System.out.println("SOPA DE LETRAS");
        Scanner leer = new Scanner(System.in);
        
        inicializarMatriz(m);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese una palabra");
            palabra = leer.next();
            cargarPalabraMatriz(m, palabra);
        }
        completarMatriz(m);
        mostrarMatriz(m);
    }

    public static void cargarPalabraMatriz(char[][] m, String palabra) {
        Random rand = new Random();
        int f = rand.nextInt(20);
        int c = rand.nextInt(20 - palabra.length());
        for (int i = 0; i < palabra.length(); i++) {
            m[f][c + i] = palabra.charAt(i);
        }

    }

    public static void mostrarMatriz(char m[][]) {
        for (int f = 0; f < 20; f++) {
            for (int c = 0; c < 20; c++) {
                System.out.print("[" + m[f][c] + "]");
            }
            System.out.println("");
        }
    }

    public static void completarMatriz(char m[][]) {
        Random rand = new Random();
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (m[f][c] == '*') {
                    m[f][c] = (char) (rand.nextInt(48, 56));
                }

            }
        }

    }

    public static void inicializarMatriz(char m[][]) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                m[f][c] = '*';
            }
        }
    }

}
