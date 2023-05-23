/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class Ej18_MatrixTranspose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        // traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        // cambiando sus filas por columnas (o viceversa).

        int N = 4;
        int[][] matrixA = new int[N][N];

        // fill matrix A with random numbers
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
            }
        }

        // print matrix
        System.out.println("Original Matrix");
        printMatrix(matrixA);

        System.out.println("Transpose Matrix");
        // generate the transpose of matrixA        
        int[][] transposeMatrix = transpose(matrixA);
        printMatrix(transposeMatrix);
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

}
