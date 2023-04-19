/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Guia3 {

/*
Realizar un programa que pida dos números enteros positivos por 
teclado y muestre por pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta 
que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
la opción 5, en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú. 
 */


    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero positivo: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Ingrese otro numero entero positivo: ");
        int num1 = scanner.nextInt();
        int menu;

        do {
            System.out.println("Ingrese la opcion que desee: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multi");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 ->
                    System.out.println(num1 + num);
                case 2 ->
                    System.out.println(num - num1);
                case 3 ->
                    System.out.println(num * num1);
                case 4 ->
                    System.out.println(num / num1);
                case 5 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (menu != 5);
    }
}