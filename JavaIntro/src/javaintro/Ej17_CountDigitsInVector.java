/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;


/**
 *
 * @author rczgr
 */
public class Ej17_CountDigitsInVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        // de 2 dígitos, etcétera (hasta 5 dígitos).

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 123;
        numbers[3] = 1234;
        numbers[4] = 1245;

        printArray(numbers);
        countDigits(numbers);

    }

    public static void countDigits(int[] vector) {
        int[] countDigits = {0, 0, 0, 0, 0};

        for (int i = 0; i < vector.length; i++) {
            switch (getNumberOfDigits(vector[i])) {
                case 1: {
                    countDigits[0]++;
                    break;
                }
                case 2: {
                    countDigits[1]++;
                    break;
                }
                case 3: {
                    countDigits[2]++;
                    break;
                }
                case 4: {
                    countDigits[3]++;
                    break;
                }
                case 5: {
                    countDigits[4]++;
                    break;
                }
            }
        }

        printArray(countDigits);
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
