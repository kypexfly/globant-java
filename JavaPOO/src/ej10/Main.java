/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        fillRandomNumbers(arrayA);
        System.out.println("Array A:\n"
                + Arrays.toString(arrayA));

        Arrays.sort(arrayA);

        for (int i = 0; i < arrayB.length; i++) {
            if (i < 10) {
                arrayB[i] = arrayA[i];
            } else {
                arrayB[i] = 0.5;
                // This also works outside of the for loop
                // Arrays.fill(arrayB, 0.5);
            }
        }

        System.out.println("Array A sorted:\n"
                + Arrays.toString(arrayA)
                + "\nArray B:\n"
                + Arrays.toString(arrayB));

    }

    public static void fillRandomNumbers(double[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

}
