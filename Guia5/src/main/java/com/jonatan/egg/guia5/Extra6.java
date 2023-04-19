/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra6 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    String[] palabrasInput = new String[5];
    char[][] matrixSopaDeLetras = new char[20][20];
    int rows = (int) (Math.random() * 19);
    int columns = 0;

    // lee  las palabras y las ubica horizontalmente en la matriz
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese la palabra " + (i + 1) + ": ");
      palabrasInput[i] = scanner.nextLine();
      rows = (int) (Math.random() * 19);
      while (palabrasInput[i].length() < 3 || palabrasInput[i].length() > 5) {
        System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese la palabra " + (i + 1) + ": ");
        palabrasInput[i] = scanner.nextLine();
      }

      // ubica la palabra en forma de caracteres en la matriz
      columns = (int) (Math.random() * (19 - palabrasInput[i].length() - 1));
      for (int j = 0; j < palabrasInput[i].length(); j++) {
        System.out.println(rows);
        matrixSopaDeLetras[rows][columns] = palabrasInput[i].charAt(j);
        columns++;
      }
      columns = 0;

    }
    // rellena el resto de la matriz con numeros random entre el 0 y 9
    for (int i = 0; i < matrixSopaDeLetras.length; i++) {
      for (int j = 0; j < matrixSopaDeLetras[i].length; j++) {
        if (matrixSopaDeLetras[i][j] == '\u0000') {
          matrixSopaDeLetras[i][j] = (char) ((int) (Math.random() * 10) + '0'); // el + 0 lo convierte a caracter ascii
        }
        System.out.print(matrixSopaDeLetras[i][j] + " ");
      }
      System.out.println();
   }
 } 
}
