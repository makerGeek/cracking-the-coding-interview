package dataStructures.stacksAndQueues;

import java.util.*;

/**
 *
 * @author makerGeek
 */
public class Three {
    public static void main(String[] args) {
        SetOfStacks sos = new SetOfStacks();
        sos.push(2);
        sos.push(3);
        sos.push(4);
        sos.push(5);
        sos.push(7);
        sos.push(8);
        sos.push(4);
        sos.push(3);
        sos.push(2);
        sos.push(7);
        sos.push(8);
        sos.push(8);
        sos.push(8);
        sos.push(5);
        sos.push(7);
        sos.push(8);
        sos.push(4);
        sos.push(3);
        sos.push(2);
        sos.push(7);
        sos.push(8);
        sos.push(8);
        sos.push(8);
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        
    }
}

class SetOfStacks{
    ArrayList<Stack<Integer>> arrl = new ArrayList<>();
    int stackSize=2;
    public SetOfStacks(){
        arrl.add(new Stack<>());
    }
    
    public void push(Integer x){
        Stack<Integer> curr=arrl.get(arrl.size()-1);
        if(curr.size()>stackSize) {
            curr = new Stack<>();
            arrl.add(curr);
        }
        curr.push(x);
    }
    
    public Integer pop(){
        Stack<Integer> curr=arrl.get(arrl.size()-1);
        if(curr.isEmpty()) {
            curr = arrl.get(arrl.size()-2);
            arrl.remove(arrl.size()-1);
        }
        return curr.pop();        
    }
    
    public Integer popAt(int x){
        if(arrl.get(x).isEmpty()) return null;
        return arrl.get(x).pop();
    }
}
