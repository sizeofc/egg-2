/**
 * Escribir un programa que procese una secuencia de caracteres
 * ingresada por teclado y terminada en punto, y luego codifique
 * la palabra o frase ingresada de la siguiente manera: cada vocal
 * se reemplaza por el carácter que se indica en la tabla y el resto
 * de los caracteres (incluyendo a las vocales acentuadas) se mantienen
 * sin cambios.
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Guia4 {

    public static void main(String[] args) {
        System.out.println("ingrese una frease terminada con punto");
        Scanner leer = new Scanner(System.in);
        String frase = "", entrada = "";
        
        while (true) {
            entrada = leer.nextLine();
            if (entrada.endsWith(".")) {
                frase += entrada.substring(0, entrada.length() - 1);
                break;
            } else {
                frase += entrada;
            }
        }

        System.out.println(codificar(frase));

    }

    public static String codificar(String text) {
        String code = "";
        char l;
        for (int i = 0; i < text.length(); i++) {
            l = text.charAt(i);
            //a=@-e=#-i=$-o=%-u=*
            switch (l) {
                case 'a':
                    code += "@";
                    break;
                case 'e':
                    code += "#";
                    break;
                case 'i':
                    code += "$";
                    break;
                case 'o':
                    code += "%";
                    break;
                case 'u':
                    code += "*";
                    break;
                default:
                    code += l;

            }
        }
        return code;
    }
}
