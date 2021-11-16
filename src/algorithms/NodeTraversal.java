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
public class NodeTraversal {
    static class Node{
        int data;
        Node next;
    }
    
    static Node removeFirstNode(Node head){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        return head;
    }
    
    static Node push(Node headRef, int newData){
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = (headRef);
        (headRef) = newNode;
        return headRef;
    }  
    
}
