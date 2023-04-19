/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("La frase en mayuscula es: "+frase.toUpperCase());
        System.out.println("La frase en minuscula es: "+frase.toLowerCase());       
    }
    
}
