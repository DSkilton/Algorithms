/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author MC03353
 */
public class SelectionSort {
    
    //Swaps the elements at i and j
    public void swapElements(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public int indexLowest(int[] array, int start){
        int lowIndex = start;
        for(int i = start; i < array.length; i++){
            if(array[i] < array[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }
    
    public void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
}
