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
public class Ex11_GetNumberOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        System.out.println(getNumberOfDigits(input));

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
