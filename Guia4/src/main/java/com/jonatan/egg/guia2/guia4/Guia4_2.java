/**
 * Crea un procedimiento EsMultiplo que reciba los dos números 
 * pasados por el usuario, validando que el primer número múltiplo 
 * del segundo e imprima si el primer número es múltiplo del segundo, 
 * sino informe que no lo son.
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Guia4_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingrese el primer valor:");
        n1=leer.nextInt();
        System.out.println("Ingrese el primer valor:");
        n2= leer.nextInt();
        esMultiplo(n1, n2);
    }
    
    public static void esMultiplo(int num1,int num2){
        if(num1%num2==0){
            System.out.println(num1+ " es multiplo de "+num2);
        }else{
            System.out.println(num1+ " no multiplo de "+num2);
        }
    }
}
