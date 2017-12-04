/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Letras_alfabeto;

/**
 * @date 26/10/2017
 * @author barre
 */
public class Latras_alfabeto1 {
    
    public void CambioArray(char[] array) {
        int aux;  // Se agraga un auxiliar para hacer el intercambio de posición en el arreglo
        for (int i = 0; i < array.length - 1; i++) {  // Ciclos para que recorra el arreglo
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) { //Condicional para usar el auxiliar
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = (char) aux;

                }
            }
        }
    }
}
