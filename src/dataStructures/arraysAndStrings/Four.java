package dataStructures.arraysAndStrings;

import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        String s =args[0];
        System.out.println(Arrays.toString(replaceSpaces(s)));
        
        
        
    }
    
    /**
     * this method replaces all spaces in the string s with %20
     * @param s string to modify
     * @return char[] containing the new string in an array of characters
     */
    static char [] replaceSpaces(String s){
         int nspaces=0;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ') nspaces++;
        }
        
        char[] carr = new char[s.length()+2*nspaces];
        
        int k=carr.length-1;
        for (int i = s.length()-1; i >=0; i--) {
            if(s.charAt(i)==' '){
                carr[k]='0';
                carr[k-1]='2';
                carr[k-2]='%';
                k-=3;
            }else {
                carr[k--]=s.charAt(i);
            }
        }
        
        return carr;
    }
}
