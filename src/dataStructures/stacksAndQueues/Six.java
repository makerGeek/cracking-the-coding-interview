/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataStructures.stacksAndQueues;

import java.util.Stack;

/**
 *
 * @author makerGeek
 */
public class Six {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        
        a.push(2);
        a.push(3);
        a.push(1);
        
        sort(a,b);
        
        while(!a.empty()){
            System.out.println(b.pop());
        }
    }
    
    static public void sort(Stack<Integer> a, Stack<Integer> b){
        int size=0;
        while(!a.isEmpty()){
            b.push(a.pop());
            size++;
        }
        Stack aux= b;
        b=a;
        a=aux;
        
        for (int i = 0; i < size; i++) {
            Integer min=a.pop();
            for (int j = 0; j < size-i-1; j++) {
                int x =a.pop();
                if(x<min) {
                    b.push(min);
                    min=x;
                }
                else b.push(x);
            }
            a.push(min);
            for (int j = 0; j < size-i-1; j++) {
                a.push(b.pop());
            }
        }
        
    }
}
