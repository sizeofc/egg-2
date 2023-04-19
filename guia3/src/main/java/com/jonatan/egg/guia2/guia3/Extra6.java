/**
 * Leer la altura de N personas y determinar el promedio de estaturas
 * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas
 * en general.
 *
 */
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a cargar:");
        int n = leer.nextInt();
        int cont = 1, conDebajo = 0;
        double promDebajo = 0.0, promGral = 0.0, altura = 0.0;

        while (cont <= n) {
            System.out.println("[" + cont + "]-" + "Ingrese la altura");
            altura = leer.nextDouble();
            promGral += altura;
            if (altura < 1.60) {
                promDebajo += altura;
                conDebajo++;
            }
            cont++;
        }
        System.out.println("El promedio Gral de alturas es:" + (promGral / n));
        System.out.println("El promedio de Alturas menor a 1.60m es:" + (promDebajo / conDebajo));
    }
}
