package ArraysAndStrings;

/**
 *
 * @author makerGeek
 */
public class Five {
    public static void main(String[] args) {
        
        System.out.println(compress(args[0]));
    }
    
    public static String compress(String a){
        char currentChar=a.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(currentChar);
        int occurences=1;
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i)==currentChar) occurences++;
            else{
                sb.append(occurences);
                sb.append(a.charAt(i));
                occurences=1;
                currentChar=a.charAt(i);
            }
            
        }
        sb.append(occurences);
        if(sb.toString().length()<a.length()) return sb.toString();
        return a;
        
    }
}
