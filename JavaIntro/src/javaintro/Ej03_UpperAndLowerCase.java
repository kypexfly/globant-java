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
public class Ej03_UpperAndLowerCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en 
        // mayúsculas y después toda en minúsculas. 
        // Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = read.nextLine();
        System.out.println("UPPERCASE: " + sentence.toUpperCase());
        System.out.println("LOWERCASE: " + sentence.toLowerCase());

    }

}
