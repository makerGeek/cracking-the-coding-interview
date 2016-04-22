package dataStructures.linkedLists;

import java.util.*;

/**
 *
 * @author makerGeek
 */
public class Seven {
    public static void main(String[] args) {
        Node a =Node.intToNode(1230321);
        System.out.println(isPalindrome(a));
    }
    
    public static boolean isPalindrome(Node x){
        Node r1=x;
        ArrayList<Integer> arrl = new ArrayList<>();
        while(r1!=null){
            arrl.add(r1.val);
            r1=r1.next;
        }
        for (int i = 0; i < arrl.size()/2; i++) {
            if(arrl.get(i)!=arrl.get(arrl.size()-1-i)) return false;
        }
        
        return true;
    }
}
