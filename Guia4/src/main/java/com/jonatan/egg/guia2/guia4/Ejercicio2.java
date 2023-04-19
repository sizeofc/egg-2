/**
 * Diseñe una función que pida el nombre y la edad de N
 * personas e imprima los datos de las personas ingresadas
 * por teclado e indique si son mayores o menores de edad. Después
 * de cada persona, el programa debe preguntarle al usuario si
 * quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       
        cargardDatos();
    }

    public static void cargardDatos() {
        String salir = "";
        int n;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas a cargar:");
        n = leer.nextInt();
        
        String[] nombre = new String[n];
        int[] edad= new int[n];
        
        for (int i = 0; i < n ; i++) {
            System.out.println((i+1) + "- Ingrese Nombre:");
            nombre[i] = leer.next();
            System.out.println("Ingrese la edad:");
            edad[i] = leer.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            
            System.out.println("nombre:"+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            if(edad[i]>18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("Es menor de edad");
            }
            System.out.println("Desea seguir viendo mas personas? -[S/No]:");
            if(!(salir=leer.next().toLowerCase()).equals("s")){
                break;
            }

        }
    }
}
