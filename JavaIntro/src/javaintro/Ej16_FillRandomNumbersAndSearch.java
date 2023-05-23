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
public class Ej16_FillRandomNumbersAndSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        // usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        // numero y si se encuentra repetido

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the vector size N: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        // fill vector with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }

        // show numbers
        printArray(numbers);

        System.out.print("Enter the number you want to search: ");
        int target = scanner.nextInt();

        // search algorithm
        int[] foundIndexes = searchIndexes(numbers, target);

        if (foundIndexes.length == 0) {
            System.out.println("The target value was not found in the vector.");
        } else {
            System.out.print("The target value " + target + " was found in the next indexes: ");
            printArray(foundIndexes);
        }

    }

    public static int[] searchIndexes(int[] vector, int target) {
        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == target) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int currentIndex = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == target) {
                indexes[currentIndex] = i;
                currentIndex++;
            }
        }

        return indexes;
    }

    public static void printArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.println(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
    }

}
