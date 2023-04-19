/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia2.guia3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio7 {

    public static void main(String[] args) throws IOException, InterruptedException {
        int cont = 0;
        int conterror = 0;
        Scanner scanner = new Scanner(System.in);
        String cadena;
        System.out.println("Hola, este es un programa RS232");

        do {
            System.out.println("Por favor ingrese caracteres: ");
            System.out.println("Para finalizar ingrese &&&&&");

            cadena = scanner.nextLine();

            if (cadena.length() >= 2 && cadena.length() <= 5) {
                if (cadena.substring(0, 1).equals("X") && (cadena.substring(cadena.length() - 1).equals("O"))) {
                    cont++;
                } else {
                    conterror++;

                }
            } else {
                conterror++;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("La cantidad bien son: " + cont);
        System.out.println("La cantidad mal son: " + (conterror - 1));
    }
}
