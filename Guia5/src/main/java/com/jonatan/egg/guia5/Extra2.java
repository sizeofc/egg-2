/**
 * Escriba un programa que averigüe si dos vectores de N enteros 
 * son iguales (la comparación deberá detenerse en cuanto se detecte 
 * alguna diferencia entre los elementos).

 */
package com.jonatan.egg.guia5;

/**
 *
 * @author Alexi
 */
public class Extra2 {
    public static void main(String[] args) {
        int[] a,b;
        a=new int[]{1,2,3};
        b= new int[]{1,0,3};
        if(comparaVectores(a, b)){
        System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son distintos");
        }
    }
    
    public static boolean comparaVectores(int[]a, int b[]){
        
        if(a.length!=b.length){
            return false;
        }else{
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
