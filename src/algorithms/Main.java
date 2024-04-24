package algorithms;

import algorithms.NodeTraversal.Node;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    private static Scanner SC = new Scanner(System.in);
    private static int[] numberArray = {1,9,2,3,4,5,6};
    private static Set<String> set = new HashSet<>(Arrays.asList("banana", "apple", "orange", "grape"));



    public static void main(String[] args) {
        nodeTraversal();
        SelectionSort sel = new SelectionSort();
        System.out.println(Arrays.toString(numberArray));
        sel.selectionSort(numberArray);
        System.out.println(Arrays.toString(numberArray));

        BubbleSort.bubbleSort(set);
    }

  public static void nodeTraversal(){
    Node head = null;
    head = NodeTraversal.push(head, 5);
    head = NodeTraversal.push(head, 10);
    head = NodeTraversal.push(head, 15);
    head = NodeTraversal.push(head, 20);
    head = NodeTraversal.removeFirstNode(head);

        for (Node temp = head; temp != null; temp = temp.next){
            System.out.println(temp.data + "  ");
        }
    }
}

