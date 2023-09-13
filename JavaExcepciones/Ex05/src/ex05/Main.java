/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rn = new Random();

        boolean adivinado = false;
        int intentos = 0;
        int valorAleatorio = rn.nextInt(500) + 1;
        int input;

        while (!adivinado) {
            System.out.println("INTENTO #" + (intentos + 1));
            System.out.print("Adivine el número entre 1 y 500: ");

            try {
                input = Integer.parseInt(sc.next());

                if (valorAleatorio == input) {
                    System.out.println("¡Has adivinado correctamente!");
                    System.out.println("Total intentos: " + (intentos + 1));
                    adivinado = true;
                }

                if (valorAleatorio > input) {
                    System.out.println("El número a adivinar es mayor que " + input);
                } else {
                    System.out.println("El número a adivinar es menor que " + input);

                }

            } catch (Exception e) {
                System.out.println("Introduzca un valor válido...");
            } finally {
                ++intentos;
            }
        }

        System.out.println("---END---");

    }

}
