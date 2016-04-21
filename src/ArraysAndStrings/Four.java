package ArraysAndStrings;

import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        String s ="hello good world!";
        System.out.println(Arrays.toString(replaceSpaces(s)));
        
        
        
    }
    
    
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
