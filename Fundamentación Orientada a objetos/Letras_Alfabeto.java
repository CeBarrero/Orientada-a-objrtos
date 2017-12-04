/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Letras_alfabeto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;


/**
 *
 * @author barre
 */
public class Letras_Alfabeto {

    public static void main(String[] args) throws IOException {

        //Se crea la cadena del alfabeto
        String Alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        String AlfabetoMayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

        Random rd = new Random();   //Para que sea aleatorio
        Latras_alfabeto1 alf = new Latras_alfabeto1();
        Random r = new Random();
        char [] array = new char[54];  // Se crea un arreglo de 54 casillas

        for (int i = 0; i < array.length; i++) {
            int Letra = (r.nextInt(25) + 97); //Se crea entero para que cada valor se almacene en el arreglo
            array[i] = (char) Letra;
        }

        for (int i = 0; i < array.length; i++) {   //Ciclo para imprimir las letras
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

        alf.CambioArray(array); //Se imprime la casilla del arreglo
        System.out.println(array);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Buffer para leer
        BufferedWriter bw = new BufferedWriter(new FileWriter("Letra.txt")); //Buffer para escribir
        String input = br.readLine();

        char character = 0;  //Se crea la casilla caracter 
        int max = 0, temp;

        int num = 27;
        switch (num) {
            case 1:
                if (num == 1234567890) {
                    System.out.println("No es valido ingresar numeros");
                }

        }

        for (int i = 0; i < Alfabeto.length(); i++) {

            temp = countCharacter(Alfabeto.charAt(i), input);
            if (temp > max) {
                character = Alfabeto.charAt(i);
                max = temp;
            }
        }
        bw.write("la letra seleccionada se repite = " + character + +max + " veces \n ");  //Dar un mensaje después de ingresar el número
        bw.flush();  //Imprime en pantalla

        //Se crea un contador
    }

    public static int countCharacter(char character, String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            counter += input.charAt(i) == character ? 1 : 0;
        }
        return counter;
    }
    
    
    /*public static void main(String[] args) {
        
        char[][] alfabet = new char[3][3];
        char minRandom = 65;
        char maxRandom = 122;

        for (int i = 0; i < alfabet.length; i++) {
            alfabet[i][0] = (char) ((Math.random()*(maxRandom - minRandom ))+minRandom);
            for (int j = 0; j < alfabet.length; j++) {
                alfabet[0][j] = (char) ((Math.random()*(maxRandom - minRandom))+ minRandom);
                System.out.println(alfabet[i][j]);
        }
     */   
}