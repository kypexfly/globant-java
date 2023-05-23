/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class utils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int[][] transpose(int[][] matrix) {
        int nrow = matrix.length;
        int ncol = matrix[0].length;

        int[][] transpose = new int[nrow][ncol];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print("[" + element + "] ");
            }
            System.out.println("");
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print("[" + element + "]");
            }
            System.out.println("");
        }
    }

    public static int getNumberOfDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

}
