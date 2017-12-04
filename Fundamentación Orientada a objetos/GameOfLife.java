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

public class GameOfLife {
    public static void main(String[] args) {
        
        int[][] matrix = new int[101][101];

        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rd.nextInt(2);
                
                if (i == 0){
                    if (j == 0){
                        this.matrix[i][j+1] + this.matrix[i+1][j] + this.matrix[i+1][j+1];
                    } else {
                        if (j == 2){
                            matrix[i][j-1] + (i+1,j-1) + (i+1,j);
                        } else {
                            (i,j-1) + (i,j+1) + (i+1,j-1) + (i+1,j) + (i+1,j+1);
                        }
                    }
                } else {
                    if (i == 2){
                        if (j == 0){
                            (i-1,j) + (i-1,j+1) + (i,j+1);
                        } else {
                            if (j == 2){
                                (i-1,j-1) + (i-1,j) + (i,j-1);
                            } else {
                                (i-1,j-1) + (i-1,j) + (i-1,j+1) + (i,j-1) + (i,j+1);
                            }
                        }
                    } else {
                        if (j == 0){
                            matrix[i-1][j] + matrix[i-1][j+1] + matrix[i+1][j+1];
                        }
                    }
                }
            }
        }

        int counter;
        while (true) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    counter = matrix[i - 1][j - 1] + matrix[i - 1][j] + matrix[i - 1][j + 1] + matrix[i][j - 1] + matrix[i][j + 1] + matrix[i + 1][j - 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];

                    if (counter < 2 || counter > 3) {
                        matrix[i][j] = 0;
                    }
                    else {
                        if (matrix [i][j] == 0 && counter == 3){
                            matrix [i][j] = 1;
                        }
                    }
                }
            }
        }
    }
}