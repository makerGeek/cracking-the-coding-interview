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
public class Two {
    public static void main(String[] args) {
        Node x =new Node();
        x.initSample();
        x.print();
        System.out.println("");
        System.out.println(findKthElement(x, 4).val);
    }
    
    public static Node findKthElement(Node head, int k){
        int i=0;
        Node kth=null;
        Node runner = head;
        while(runner.next!=null){
            runner=runner.next;
            i++;
            if(i==k){
                kth=head;
            }
            if(i>k && k>0){
                kth=kth.next;
            }
        }
        
        if(kth==null) return runner;
        return kth;
    }
}
