package algorithms;

import algorithms.BubbleSort;
import java.util.Collection;
import java.util.Comparator;

public class Main{
    private static int[] iArray = {1,2,3,4,5,6};

    public static void main(String[] args) {
        SelectionSort sel = new SelectionSort(); 
        sel.selectionSort(iArray);   
    }

//    @Override
//    public void sort(Sortable collection) {
//        
//    }
    
    
}
