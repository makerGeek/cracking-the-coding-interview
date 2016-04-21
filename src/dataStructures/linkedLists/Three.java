/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataStructures.linkedLists;

/**
 *
 * @author makerGeek
 */
public class Three {
    public static void main(String[] args) {
        Node x = new Node();
        x.initSample();
        Node toDelete=x.next.next.next;
        x.print();
        blindDelete(toDelete);
        
        x.print();
    }
    
    public static void blindDelete(Node toDelete){
    System.out.println("deleting :"+toDelete.val);
        toDelete.val=toDelete.next.val;
        toDelete.next=toDelete.next.next;
    }
}
