/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class Ej19_AntisymmetricMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        // matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        // signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        // denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

        int[][] A = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        System.out.println("Is antisymmetric matrix?: " + isAntisymmetricMatrix(A));

    }

    public static boolean isAntisymmetricMatrix(int[][] matrix) {
        boolean isAntisymmetricMatrix = true;

        int[][] T = transpose(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                isAntisymmetricMatrix = matrix[i][j] == T[i][j] * -1;
                if (!isAntisymmetricMatrix) {
                    break;
                }
            }
        }

        return isAntisymmetricMatrix;
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

}
