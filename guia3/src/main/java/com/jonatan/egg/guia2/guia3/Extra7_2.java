/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra7_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos a cargar");
        int n = leer.nextInt();
        int con = 1, num = 0, max, min;
        double sum = 0.0;
        max = -999999;
        min = 99999999;
        do {
            System.out.println("[" + con + "] Ingrese un valor:");
            num = leer.nextInt();
            sum += num;
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            con++;
        } while (con <= n);
        System.out.println("El numero mayor es:" + max);
        System.out.println("El numero menor es:" + min);
        System.out.println("El promedio es:" + (sum / n));
    }
}
