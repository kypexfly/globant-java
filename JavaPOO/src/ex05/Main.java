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
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "enero", "febrero", "marzo", "abril",
            "mayo", "junio", "julio", "agosto",
            "septiembre", "noviembre", "octubre", "diciembre"
        };

        String mesSecreto = meses[rn.nextInt(12)];

        System.out.println("Adivina el mes secreto");
        System.out.print("Introduzca el nombre del mes en minúsculas: ");
        String userInput = "";

        boolean esCorrecto = false;
        // System.out.println("RESPUESTA: " + mesSecreto);

        while (!esCorrecto) {
            userInput = sc.next();
            esCorrecto = mesSecreto.equals(userInput);

            if (!esCorrecto) {
                System.out.println("No ha acertado.");
                System.out.print("Intente adivinarlo introduciendo otro mes: ");
            }
        }

        System.out.println("¡Ha acertado!");

    }

}
