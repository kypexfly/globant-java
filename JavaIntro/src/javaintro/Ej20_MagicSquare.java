/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ej20_MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        //  suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        //  permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        //  El programa deberá comprobar que los números introducidos son correctos, es decir,
        //  están entre el 1 y el 9.

        // This is a magic square
        /*
        [   [2 7 6],
            [9 5 1],
            [4 3 8]
        ]
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix 3x3");
        int N = 3;
        int[][] matrix = new int[N][N];

        // User assign values of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                do {
                    System.out.print("Value for [" + i + "," + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                    if (matrix[i][j] < 1 || matrix[i][j] > 9) {
                        System.out.println("ERROR: Value must be between 1 and 9. Please retry!");
                    }

                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
            }
        }

        utils.printMatrix(matrix);

        System.out.println("Is this matrix a magic square?: " + isMagicSquare(matrix));

    }

    public static boolean isMagicSquare(int[][] matrix) {

        int magicNumber = 0;
        int sum;

        // get magicNumber ie. sum of the first row
        for (int j = 0; j < matrix[0].length; j++) {
            magicNumber += matrix[0][j];
        }

        System.out.println("Magic number: " + magicNumber);

        // check for every row
        for (int[] row : matrix) {
            sum = 0;
            for (int el : row) {
                sum += el;
            }

            if (magicNumber != sum) {
                return false;
            }
        }

        // check for every column
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[j][i];
            }

            if (magicNumber != sum) {
                return false;
            }
        }

        // check for main diagonal
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        if (magicNumber != sum) {
            return false;
        }

        // check for main diagonal
        sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }

        return magicNumber == sum;
    }

}
