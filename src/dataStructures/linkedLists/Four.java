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
public class Four {
    public static void main(String[] args) {
        Node x = new Node();
        x.initSample();
        x.print();
        Node partitioned = partition(x, 4);
        partitioned.print();
    }
    
    public static Node partition(Node a, int threshold){
        System.out.println("partitioning...");
        Node runner = a;
        Node result = new Node();
        while(runner!=null){
            if(runner.val<=threshold){
                Node aux = new Node(runner.val);
                aux.next=result;
                result=aux;
            } else {
                result.appendTail(new Node(runner.val));
            }
            runner=runner.next;
        }
        return result;
    }
}
