/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.io.InputStream;

/**
 *
 * @author barre
 */
public class ArrayClass {

    //Metodo que imprima un vector de tipo int
    //@array[]
    public void imprimeArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

    //Método que imprime un array bidimensional de tipo int
    public void imprimeArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
        }
    }

    //Metodo que carga un array de tipo integer en un rango de números
    public void cargarArray(int array[], int minRandom, int maxRandom) {
        for (int i = 0; i < array.length; i++) {
            array[i] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
        }
    }

    //Método que carga una array bidimensional de tipo int con un rango de números
    public void cargarArray(int array[][], int minRandom, int maxRandom) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
            }
        }
    }

    //Metodo que suma las posiciones de un array de tipo int
    public int sumaArray(int array[]) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray = sumArray + array[i]; //sumArray+=array[i];
        }
        return sumArray;
    }

    //Método que halle el numero mayor dentro de un array
    public int numeroMayor(int array[]) {
        int numMayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (numMayor < array[i]) {
                numMayor = array[i];
            }
        }
        return numMayor;
    }

    //Método que halle el numero menor dentro de un array
    public int numeroMenor(int array[]) {
        int numMenor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (numMenor > array[i]) {
                numMenor = array[i];
            }
        }
        return numMenor;
    }

    public void cargarEnteros(int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = i + 1;
                array[0][j] = j + 1;
            }
        }
    }

    //Ordenamiento por intercambio para una matriz
    public void ordIntercambioMatirz(int array[][], boolean ord) {
        int aux;
        for (int i = 0; i < array.length; i++) {//ordena la matriz de abajo hacia arriba
            for (int j = 0; j < array[i].length; j++) {
                for (int x = 0; x < array.length; x++) {
                    for (int y = 0; y < array[x].length; y++) {
                        if (ord == true) {
                            if ((array[x][y] > array[i][j])) {
                                cambioDato(array, i, j, x, y);
                            }
                        } else {
                            if (array[x][y] < array[i][j]) {
                                cambioDato(array, i, j, x, y);
                            }
                        }
                    }
                }
            }
        }
    }

    public void cambioDato(int array[][], int i, int j, int x, int y) {
        int aux;
        aux = array[i][j];
        array[i][j] = array[x][y];
        array[x][y] = aux;
    }

    //Ordenamiento por intercambio para un array
    public void ordIntercambioArray(int[] array, boolean ord) {
        int aux;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    //Ordenación por selección
    public void ordSeleccionArray(int[] array) {
        int indiceMenor, aux;
        for (int col = 0; col < array.length - 1; col++) {
            indiceMenor = col;
            for (int sCol = col + 1; sCol < array.length; sCol++) {
                if (array[sCol] < array[indiceMenor]) {
                    indiceMenor = sCol;
                }
            }
            if (col != indiceMenor) {
                aux = array[col];
                array[col] = array[indiceMenor];
                array[indiceMenor] = aux;
            }
        }
    }

    //Ordenamiento por Inserción
    public void ordInsercionArray(int[] array) {
        int aux, sCol;
        for (int col = 1; col < array.length; col++) {
            sCol = 1;
            aux = array[col];
            while (sCol > 0 && aux < array[sCol - 1]) {
                array[sCol] = array[sCol - 1];
                sCol--;
            }
            array[sCol] = aux;
        }
    }

    //Ordenamiento por Burbuja
    public void ordBurbujaArray(int[] array) {
        boolean interruptor = true;
        int aux;
        for (int i = 0; i < array.length - 1 && interruptor == true; i++) {
            interruptor = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    interruptor = true;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }
        }
    }

    //Ordenamiento por Burbuja modificado
    public void ordBurbujaModificadoArray(int[] array) {
        int i = array.length - 1, indiceIntercambio, aux;
        while (i > 0) {
            indiceIntercambio = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    indiceIntercambio = j;
                }
            }
            i = indiceIntercambio;
        }
    }

    //Ordenamiento Shell
    public void ordShellArry(int[] array) {
        int intervalo = array.length / 2, j, k, temp;
        while (intervalo > 0) {
            for (int i = intervalo; i < array.length; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (array[j] <= array[k]) {
                        j = -1;
                    } else {
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }

    //Ordenamiento QuickSort
    public void ordQuickSort(int[][] array, int primero, int ultimo) {

        int pivote, central, i, j, temp, l;
        central = (int) (primero + ultimo) / 2;
        l = (int) (primero + ultimo) / 2;
        pivote = array[central][l];
        i = primero;
        j = ultimo;
        do {
            while (array[i][j] < pivote) {
                i++;
            }
            while (array[i][j] > pivote) {
                j--;
            }
            if (i <= j) {
                temp = array[i][j];
                array[i] = array[j];
                array[j][i] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordQuickSort(array, primero, j);
        }
        if (i < ultimo) {
            ordQuickSort(array, i, ultimo);
        } 
    }

    //Ordenamiento Binsort
    
    
    //Ordenamiento Radixsort
    
    //Busqueda binaria
    int busquedaBin(int lista[], int n, int clave) {
        int central, bajo, alto;
        int valorCentral;
        bajo = 0;
        alto = n - 1;
        while (bajo <= alto) {
            central = (bajo + alto) / 2;
            valorCentral = lista[central];
            if (clave == valorCentral) {
                return central;
            } else if (clave < valorCentral) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }
    //Busqueda secuencial
    public double busquedaBin1(int[] array, int clave) {
        int valorCentral, central, bajo = 0, alto = array.length - 1;
        while (bajo <= alto) {
            central = (bajo + alto) / 2;
            valorCentral = array[central];
            if (clave == valorCentral) {
                return central;
            } else {
                if (clave < valorCentral) {
                    alto = central - 1;
                } else {
                    bajo = central + 1;
                }
            }
        }
        return -1;
    }

    void cargarEnteros(int[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fin de la clase...
    

