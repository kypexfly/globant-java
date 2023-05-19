/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ej06_CheckIfOddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = read.nextInt();
        System.out.println(isEven(number));
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "par" : "impar";
    }

}
