/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import java.util.Random;

/**
 *
 * @author barre
 */
public class Arreglo {
    
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int average = 0;
        Random rd = new Random();
        int  [] vector = new int [10];
        
        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = rd.nextInt();
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < vector.length; i++)
        {
            min = vector[i] < min ? vector[i] : min ;
            max = vector[i] > max ? vector[i] : max ;
            average += vector[i];
        }
        average /= vector.length;
        
        System.out.println("El menor valor es " + min + "," + "el maximo valor es " + max + "y el promedio es " + average);
    }
    
}
