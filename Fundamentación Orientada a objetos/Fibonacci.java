/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursión;

/**
 *
 * @author barre
 */
public class Fibonacci {
    
    /*public static int Fibona(int number){
        if (number <=0){
            return 0;
        } else {
            return number+-Fibona(number-1);
        }
    }*/
    
    static int potencia(int x,int n){
        int aux;
        if (n == 0) {
            return 1;
        } else {
            aux = potencia(x, n/2);
            if (n % 2 == 0){
                return aux * aux;
            } else {
                return x* aux *aux;
            }
        }
    }
    
    public static void main(String[] args) {
        //System.out.println("Función Fibonacci = " + Fibonacci.Fibona(0));
        System.out.println("Función Fibonacci = " + Fibonacci.potencia(2, 4));
    }
    
}
