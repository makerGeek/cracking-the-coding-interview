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
public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
    
    public void appendTail(Node a){
        Node runner =this;
        while(runner.next!=null) runner=runner.next;
        runner.next=a;
    }

}
