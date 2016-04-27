/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataStructures.stacksAndQueues;

import java.util.*;

/**
 *
 * @author makerGeek
 */
public class Five {
    
    public static void main(String[] args) {
        Queue<Character> q = new Queue<>();
        q.enqueue('c');
        q.enqueue('b');
        q.enqueue('a');
        System.out.println(q.dequeue());
        q.enqueue('f');
        q.enqueue('e');
        q.enqueue('d');
        System.out.println(q.dequeue());
        
        
    }
    
}
class Queue<E>{
        Stack<E> a = new Stack<>();
        Stack<E> b = new Stack<>();
        
        
        public void enqueue(E e){
            a.push(e);
        }
        
        public E dequeue(){
            while(!a.empty()){
                b.push(a.pop());
            }
            
            E e = b.pop();
            while(!b.empty()){
                a.push(b.pop());
            }
            
            return e;
        }
        
        
    }