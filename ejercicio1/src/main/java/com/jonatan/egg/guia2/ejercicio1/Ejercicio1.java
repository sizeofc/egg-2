/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jonatan.egg.guia2.ejercicio1;

import java.util.Scanner;


//movistar.com

/**
 *
 * @author Alexi
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        /**
         * Escribir un programa que pida dos números enteros por teclado y calcule 
         * la suma de los dos. El programa deberá después mostrar el resultado de la suma
         */
        int num1,num2;
        int sum;
        
        //leer num
        Scanner teclado= new Scanner(System.in);//instanciar 
        System.out.println("Ingrese un numero");
        num1= teclado.nextInt();
        System.out.println("Ingrese otro numero");
        num2=teclado.nextInt();
        sum= num1+num2;
     
        
        System.out.println("La suma es:"+sum);
         
        //para i=0 hasta 10 con pasos 1 hacer
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }
         
    }
    
    //si num1>num2 entonces
       
        
}