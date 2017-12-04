/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author barre
 */
public class MenuArray extends ArrayClass{
    
    public static void main(String[] args) {
        
        ArrayClass ac = new ArrayClass();
        
        
        
        int [][] array = null;
        int [] array1 = null;
        ac.cargarArray(array, 1, 100);
        ac.cargarEnteros(array);
        ac.imprimeArray(array);
        ac.ordBurbujaArray(array1);
        ac.ordBurbujaModificadoArray(array1);
        ac.ordIntercambioMatirz(array, true);
        ac.sumaArray(array1);
        ac.ordShellArry(array1);
        ac.ordSeleccionArray(array1);
        ac.ordQuickSort(array, 15, 50);
        ac.ordInsercionArray(array1);
    }
}
