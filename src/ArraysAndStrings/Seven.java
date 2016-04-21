package ArraysAndStrings;

import java.util.*;

/**
 *
 * @author makerGeek
 */
public class Seven {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {3, 4, 0, 6},
            {5, 6, 7, 8},
            {1, 0, 4, 9}};
        
        Six.printMatrix(matrix);
        
        fillZeros(matrix);
        Six.printMatrix(matrix);
    }
    
    
    static void fillZeros(int [][] matrix){
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        for (Integer col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col]=0;
            }
        }
        
        for (Integer row : rows) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[row][i]=0;
            }
        }
        
    }
}
