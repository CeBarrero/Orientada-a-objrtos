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
public class Recursión {
    
    public static long s(int n){
        if (n == 1) {
            return 1;
        } else {
            return s(n-1) + n;
        }
    }
    
    public static int factorial(int num){
        if (num <= 0) {
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }
    
    public static long factorial1(int num1, int num2){
        if (num1 <= 1) {
            return num2;
        } else {
            return factorial1(num1-1, num1*num2);
        }
    }
    
    public static long factorialC(int num1){
        return factorial1(num1, 1);
    }
    public static void main(String[] args) {
        
        System.out.println("Función s = " + Recursión.s(5));
        System.out.println("Factorial = " + Recursión.factorial(5));
        System.out.println("Factorial = " + Recursión.factorialC(5));
    }
}
