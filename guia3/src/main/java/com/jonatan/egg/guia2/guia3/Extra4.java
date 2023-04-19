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
public class Extra4 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero entre 1 y 10");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num < 1 || num > 10) {
            System.out.println("numero incorrecto");
        } else {
            switch (num) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X8");
                    break;
            }
        }
        System.out.println(num%5);
    }
}
