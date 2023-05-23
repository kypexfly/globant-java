/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class Ej21_IsSubset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        // 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        // dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        // se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        // que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        // la matriz M en la cual empieza el primer elemento de la submatriz P.

        System.out.println("Matrix A");
        int[][] matrixA = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        utils.printMatrix(matrixA);

        System.out.println("Matrix B");

        int[][] matrixB = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };

        utils.printMatrix(matrixB);

        System.out.println("Is Matrix B a subset of MatrixA A: " + isSubset(matrixA, matrixB));

    }

    public static boolean isSubset(int[][] matrixA, int[][] matrixB) {
        boolean isSubset;
        System.out.println("Checking if B is a submatrix of A...");
        // l = change in row
        // k = change in column
        for (int l = 0; l <= matrixA[0].length - matrixB[0].length; l++) {
//            System.out.println("Change in row");
            for (int k = 0; k <= matrixA.length - matrixB.length; k++) {
                // 3x3 checker (check if B is inside A)
                isSubset = true;
                for (int i = 0 + l; i < matrixB.length + l; i++) {
                    for (int j = 0 + k; j < matrixB[0].length + k; j++) {
                        isSubset = matrixB[i - l][j - k] == matrixA[i][j];
                        if (!isSubset) {
                            break;
                        }
//                        System.out.print("[" + matrixA[i][j] + "] ");
                    }
                    if (!isSubset) {
                        break;
                    }
//                    System.out.println("");
                }
                if (isSubset) {
                    System.out.println("Submatrix starts in matrixA[" + l + "][" + k + "]");
                    return true;
                }
//                System.out.println("-------------");
            }
        }

        return false;
    }
}
