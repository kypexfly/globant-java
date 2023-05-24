/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ex23_LetterSoup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        // que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        // 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        // será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        // rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        // por pantalla la sopa de letras creada.

        Scanner scanner = new Scanner(System.in);

        char[][] soup = new char[20][20];
        String[] words = new String[5];
        String input;
        int counter = 0;

        fillRandomChars(soup);

        do {
            System.out.print("[" + counter + "]" + " Enter a word of 3-5 letters: ");
            input = scanner.next().toUpperCase();

            if (input.length() < 3 || input.length() > 5) {
                System.out.println("ERROR: Word must be between 3 and 5 letters.");
                continue;
            }

            words[counter] = input;

            counter++;

        } while (counter < 5);

        insertWordsToMatrix(soup, words);
        utils.printMatrix(soup);
        System.out.println("Answers: " + Arrays.toString(words));

    }

    public static void fillRandomChars(char[][] matrix) {
        String numbers = "0123456789";
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = numbers.charAt(random.nextInt(numbers.length()));
            }
        }
    }

    public static void insertWordsToMatrix(char[][] matrix, String[] words) {
        Random random = new Random();
        int randomRow;
        int randomCol;
        for (String word : words) {
            randomRow = random.nextInt(20);
            randomCol = random.nextInt(20);
            System.out.println(word + " " + randomRow + " " + randomCol);

            for (int i = 0; i < word.length(); i++) {
                if (randomCol + word.length() >= 20) {
                    randomCol -= word.length();
                }
                matrix[randomRow][randomCol + i] = word.charAt(i);
            }
        }
    }

}
