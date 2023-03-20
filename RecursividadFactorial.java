/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.recursividadfactorial;

/**
 *
 * @author USER
 */
public class RecursividadFactorial {

    public static void main(String[] args) {
        RecursividadFactorial obj = new RecursividadFactorial();
        System.out.println("El factorial de 4 mediante metodo recursivo es: "+obj.factorialRecursivo(4));
        System.out.println("El factorial de 4 mediante un metodo con clico es:"+obj.factorialCiclo(4));
    }

    //Creando el metodo factorial de manera recursiva
    public int factorialRecursivo(int n) {
        if (n < 0) {
            return 0;
        }else if (n == 0) {
            return 1;
        }else{
            return n * factorialRecursivo(n-1);
        }
    }
    //Creando metodo factorial mediante ciclo
    public int factorialCiclo(int n){
        int factor=1;
        if(n < 0){
            return 0;
        }else{
            while(n!=0){
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}
