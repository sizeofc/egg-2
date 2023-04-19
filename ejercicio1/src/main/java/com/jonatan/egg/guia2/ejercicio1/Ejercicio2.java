/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 * pide nombre lo guarda en una variable y lo muestra por pantalla
 */
package com.jonatan.egg.guia2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Hola "+nombre);
    }
    
}
