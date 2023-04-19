/**
 * Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
* descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
* descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
* sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y
* luego un valor real que represente el costo del tratamiento (previo al descuento)
* y determine el importe en efectivo a pagar por dicho socio.

 * 
*/
package com.jonatan.egg.guia2.guia3;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Tipo de socio [A,B,C]:");
        char opc = leer.next().toLowerCase().charAt(0);
        System.out.println("Ingrese Costo de tratamiento");
        double costoTratamiento=0.0,montoAPagar=0.0;
        costoTratamiento=leer.nextDouble();
        
        switch(opc){
            case 'a':
                System.out.println("Importe a abonar: "+costoTratamiento *.5);
                break;
            case 'b':
                     System.out.println("Importe a abonar: "+costoTratamiento *.65);
                     break;
            case 'c':
                System.out.println("Importe a abonar:"+costoTratamiento);
        }
    }
}
