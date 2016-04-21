package ArraysAndStrings;

import java.util.Arrays;

/**
 *
 * @author makerGeek
 */
public class Six {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4},
        {3, 4, 5, 6},
        {5, 6, 7, 8},
        {1, 8, 4, 9}};
        int[][] res = rotateMatrix(matrix);
        System.out.println("original:");
        printMatrix(matrix);
        System.out.println("rotate:");
        printMatrix(res);
        System.out.println("rotate in place: ");
        rotateMatrixInPlace(matrix);
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("");
    }

    static int[][] rotateMatrix(int[][] mat) {
        int[][] res = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            int[] aux = mat[i];
            for (int j = 0; j < mat.length; j++) {
                res[j][mat.length - 1 - i] = aux[j];
            }
        }
        return res;
    }

    static void rotateMatrixInPlace(int[][] mat) {
        int aux;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = aux;
            }
        }


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length / 2; j++) {
                aux = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 - j];
                mat[i][mat.length - 1 - j] = aux;
            }
        }

    }
}
