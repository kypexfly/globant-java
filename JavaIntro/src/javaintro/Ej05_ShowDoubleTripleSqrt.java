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
public class Ej05_ShowDoubleTripleSqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y 
        // muestre por pantalla el doble, el triple y la raíz cuadrada de
        // ese número. Nota: investigar la función Math.sqrt().

        Scanner read = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = read.nextInt();
        System.out.println("Double: " + number * 2);
        System.out.println("Triple: " + number * 3);
        System.out.println("Square root: " + Math.sqrt(number));
    }

}
