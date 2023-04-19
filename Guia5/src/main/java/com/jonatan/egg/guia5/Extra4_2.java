/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra4_2 {
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        int cont = 0;
        int cont2=0;
        
        double [] vector;
        vector = new double [4];
        
        for (int i=0; i<=4; i++) {
            
            System.out.println("DATOS DEL ALUMNO NUMERO "+ (i+1));
            
            System.out.println("Nota 1 : Trabajo Practico 1");
            System.out.println("Nota 2 : Trabajo Practico 2");
            System.out.println("Nota 3 : Integrador 1");
            System.out.println("Nota 4 : Integrador 2");
            
            for (int j=0; j<=3; j++) {
                
                System.out.println("INGRESE NOTA "+(j+1)+" : ");
                vector[j] = leer.nextDouble(); 
            }
            
            
            for (int k=0; k<=3; k++) {
                
                switch (k) {
                    
                    case 0 :
                        nota1 = vector[i] * 0.10;
                        break;
                        
                    case 1 :
                        nota2 = vector[i] * 0.15;
                        break;
                        
                    case 2 :
                        nota3 = vector[i] * 0.25;
                        break;
                        
                    case 3 :
                        nota4 = vector[i] * 0.50;
                        break;
                }
            }
            double NOTA = nota1 + nota2 + nota3 + nota4;
            
            if (NOTA >= 7) {
                
                System.out.println("EL ALUMNO APROBO");
                cont++;
            
            } else {
                
                System.out.println("EL ALUMNO NO APROBO");
                cont2++;
            }
        }
        System.out.println("HAY " + cont + "ALUMNOS APROBADOS");
        System.out.println("HAY " + cont2 + " ALUMNOS DESAPROBADOS");
    }
}
