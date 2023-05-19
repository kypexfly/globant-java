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
public class Ej08_Enter8Chars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        // usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        // pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        // Nota: investigar la función Lenght() en Java.

        Scanner read = new Scanner(System.in);

        System.out.println("Enter a word or sentence of 8 characters:");
        String input = read.nextLine();
        if (input.length() == 8) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }

    }

}
