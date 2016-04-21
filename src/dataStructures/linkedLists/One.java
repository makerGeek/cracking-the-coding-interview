package dataStructures.linkedLists;
import java.util.*;
/**
 *
 * @author makerGeek
 */
public class One {
    public static void main(String[] args) {
        Node x = new Node();   
        x.initSample();
        x.print();
        
        deleteDups(x);
        x.print();
    }
    
    
    public static void deleteDups(Node head){
        System.out.println("Deleting dups...");
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        while(head.next!=null){
            if(set.contains(head.next.val)) head.next=head.next.next;
            else {
                set.add(head.next.val);
                head=head.next;
            }
        }
        System.out.println("Dups deleted!");
    }
}
