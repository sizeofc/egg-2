/**
 * Realizar un programa que complete un vector con los N primeros números 
 * de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la 
 * sucesión de los siguientes números:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34

 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra7Fibonnaci {
    public static void main(String[] args) {
        System.out.println("ingrese el numero a factoriar:");
        Scanner leer = new Scanner(System.in);
        int n=leer.nextInt();
        int v[]=new int[n];
        for (int i = 1; i <= n; i++) {
            v[i-1]=fibonacci(i);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("["+v[i]+"]");
        }
    }
    
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
