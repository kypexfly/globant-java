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
public class Ej09_checkFirstLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        // es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        // diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        // la función Substring y equals() de Java.

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = read.nextLine();
        if (sentence.substring(0, 1).toUpperCase().equals("A")) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");

        }

    }

}
