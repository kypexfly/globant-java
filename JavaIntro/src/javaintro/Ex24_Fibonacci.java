/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ex24_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n the fibonacci sucession: ");
        int n = scanner.nextInt();
        int[] series = fibonacciSeries(n);
        System.out.println(Arrays.toString(series));
    }

    public static int[] fibonacciSeries(int n) {
        // // Teoría
        // https://espanol.libretexts.org/Matematicas/Matematicas_Aplicadas/Matematicas_universitarias_para_la_vida_cotidiana_%28Inigo_et_al.%29/10%3A_Simetr%C3%ADa_geom%C3%A9trica_y_la_proporci%C3%B3n_%C3%A1urea/10.04%3A_Los_n%C3%BAmeros_de_Fibonacci_y_la_proporci%C3%B3n_%C3%A1urea

        if (n == 0) {
            System.out.println("N must be a possitive integer");
            return null;
        }

        int[] series = new int[n];

        if (n >= 1) {
            series[0] = 0;
        }

        if (n >= 2) {
            series[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;

    }

}
