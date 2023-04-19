/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad
 * de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene
 * 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son:
 * 
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
 * Al final del programa los profesores necesitan obtener por pantalla la cantidad 
 * de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
 * promedio mayor o igual al 7 de sus notas del curso.
 *
 */
package com.jonatan.egg.guia5;

import java.util.Scanner;

/**
 *
 * @author Alexi
 */
public class Extra4 {

    public static void main(String[] args) {

        int n = 5;
        int canAlumnos = n;

        double[] practico1 = new double[n];
        double[] practico2 = new double[n];
        double[] integrador1 = new double[n];
        double[] integrador2 = new double[n];
        cargarNotas(practico1, practico2, integrador1, integrador2);
    }

    public static void cargarNotas(double[] p1, double[] p2, double[] i1, double[] i2) {
        System.out.println("Cargar Notas...");
        Scanner leer = new Scanner(System.in);

        double[] nota=new double[p1.length];
        double prom=1;
        for(int i=0;i<p1.length;i++){
            System.out.println((i+1)+" Alumno--------------");
            
            System.out.print("Practico 1: ");
            p1[i]= leer.nextDouble();
            
            System.out.print("Practico 2:");
            p2[i]= leer.nextDouble();
            
            System.out.print("Integrador 1:");
            i1[i]= leer.nextDouble();
            
            System.out.print("Integrador 2:");
            i2[i]= leer.nextDouble();
            
            nota[i]+=(p1[i]*0.1)+(p2[i]*0.15)+(i1[i]*0.25)+(i2[i]*0.5);
            prom+=nota[i];
        }
        cantAprobados(nota);
    }
    
    public static void cantAprobados(double[] v){
        int aprobados=0, reprobados=0;
        for(int i=0;i<v.length;i++){
            System.out.println("Nota alumno "+i+" es:"+v[i]);
            if(v[i]>=7){
                aprobados++;
            }else{
                reprobados++;
            }
        }
        System.out.println("Cantidad de alumnos aprobados:"+aprobados);
        System.out.println("Cantidad de alumnos desaprobados:"+reprobados);
    }
}
