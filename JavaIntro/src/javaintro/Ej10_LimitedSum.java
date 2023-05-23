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
public class Ej10_LimitedSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        // números al usuario hasta que la suma de los números introducidos supere el límite inicial.

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a positive limit value: ");

        int limit;
        do {
            limit = read.nextInt();
        } while (limit < 1);

        int sum = 0;

        while (sum <= limit) {
            System.out.println("Enter a number: ");
            sum += read.nextInt();
        }

        System.out.println("The sum " + sum + " has surpassed the limit value of " + limit);

        read.close();

    }

}
