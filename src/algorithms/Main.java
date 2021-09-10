package algorithms;

import algorithms.NodeTraversal.Node;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner SC = new Scanner(System.in);
//    private static int[] iArray = {1,9,2,3,4,5,6};

    public static void main(String[] args) {
        nodeTraversal();
//        SelectionSort sel = new SelectionSort(); 
//        System.out.println(Arrays.toString(iArray));
//        sel.selectionSort(iArray);   
//        System.out.println(Arrays.toString(iArray));
    }
    
  int a = 56;  
  String name = "Duncan";
  //decimal cost  = 2.99;
//    @Override
//    public void sort(Sortable collection) {
//        
//    }

  public static void nodeTraversal(){
    Node head = null;
    head = NodeTraversal.push(head, 5);
    head = NodeTraversal.push(head, 10);
    head = NodeTraversal.push(head, 15);
    head = NodeTraversal.push(head, 20);
    
    head = NodeTraversal.removeFirstNode(head);
    for(Node temp = head; temp != null; temp = temp.next){
        System.out.println(temp.data + "  ")
    ;}
    
    
}
  
}

