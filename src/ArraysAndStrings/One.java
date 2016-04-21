package ArraysAndStrings;

import java.util.*;

public class One {
    public static void main(String[] args) {
        String s ="azertyui";
        String q ="fmlsdqkjdfsd";
        System.out.println(unique(s));
        System.out.println(unique(q));
    }
    
    static boolean unique(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
            
        }
        return true;
    }
}
