package ArraysAndStrings;

import java.util.*;

public class Three {

    public static void main(String[] args) {
        String a = "azertyuiop";
        String b = "azerpoiuyt";
        String c = "azertyuiop  ";

        System.out.println(isPermutation(a, b));
        System.out.println(isPermutation(a, c));
        System.out.println(isPermutation(b, c));
    }

    /**
     *
     * @param a string to compare
     * @param b string to compare
     * @return true if a is permutation of b, false otherwise
     */
    static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Character ac = a.charAt(i);
            Character bc = b.charAt(i);
            if (countMap.containsKey(ac)) {
                countMap.put(ac, countMap.get(ac) + 1);
            } else {
                countMap.put(ac, 1);
            }
            if (countMap.containsKey(bc)) {
                countMap.put(bc, countMap.get(bc) - 1);
            } else {
                countMap.put(bc, -1);
            }
        }

        for (Integer x : countMap.values()) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}
