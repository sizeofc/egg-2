/*
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
*ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
*equivalente: 1 día, 2 horas.
*1 dia = 1440 min
*
*/
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("calculo de minutos a dias y horas");
        System.out.print("Ingrese minutos a convertir: ");
        int min= leer.nextInt();
        int dias=0,horas=0;
        
        horas= min/60;
        dias= horas/24;
        horas= horas %24;
        
        System.out.println("los minutos equivalen a :");
        System.out.println("Dias:"+dias);
        System.out.print("Horas:"+horas);       
    }
}
