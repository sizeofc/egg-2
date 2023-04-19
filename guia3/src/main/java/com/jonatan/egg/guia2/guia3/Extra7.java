/**
 *Realice un programa que calcule y visualice el valor máximo,
 *el valor mínimo y el promedio de n números (n>0). El valor de n 
 * se solicitará al principio del programa y los números serán 
 * introducidos por el usuario. Realice dos versiones del programa, 
 * una usando el bucle “while” y otra con el bucle “do - while”.
 */
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos a cargar");
        int n= leer.nextInt();
        int con=1,num=0,max,min;
        double sum=0.0;
        max=-999999;
        min= 99999999;
        while(con<=n){
            System.out.println("["+con+"] Ingrese un valor:");
            num=leer.nextInt();
            sum+=num;
            if(num>max){
                max=num;
            }else if(num<min){
                min=num;
            }
            con++;
        }
        System.out.println("El numero mayor es:"+max);
        System.out.println("El numero menor es:"+min);
        System.out.println("El promedio es:"+(sum/n));
    }
}
