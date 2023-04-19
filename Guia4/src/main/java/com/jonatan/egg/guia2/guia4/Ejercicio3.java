/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia2.guia4;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de Euros a convertir");
        Scanner leer = new Scanner(System.in);
        double euro=leer.nextDouble();
        System.out.println("Ingrese a que moneda convertir [Dolar,Libras,Yenes]");
        String moneda=leer.next();
        convertirDivisas(euro, moneda);
    }
    public static void convertirDivisas(double euro, String moneda){
        if(moneda.toLowerCase().equals("dolar")){
            System.out.println(euro + "E= "+ euro*1.28611+" Dolar");
        }else if(moneda.toLowerCase().equals("libras")){
            System.out.println(euro + "E= "+ euro*0.86+" Libras");
        }else if(moneda.toLowerCase().equals("dolar")){
            System.out.println(euro + "E= "+ euro*129.852+" Yenes");
        }else{
            System.out.println("Moneda incorrecta!!!");
        }
        
    }
}
