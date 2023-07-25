/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        // Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
        //los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
        //introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
        //programa mostrará por pantalla el número de valores que se han leído, su suma y su
        //media (promedio).

        ArrayList<Integer> numeros = new ArrayList<>();
        boolean salir = false;

        System.out.println("Ingrese números enteros. Para salir ingrese -99.");
        while (!salir) {
            int input = sc.nextInt();

            if (input == -99) {
                salir = true;
            } else {
                numeros.add(input);
            }
        }

        System.out.println(numeros);

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (double) suma / numeros.size());

    }

}
