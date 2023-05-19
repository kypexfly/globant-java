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
public class Ej01_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        // dos. El programa deberá después mostrar el resultado de la suma
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        int a = read.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int b = read.nextInt();
        System.out.println("La suma de a y b es: " + suma(a, b));

    }

    public static int suma(int a, int b) {
        return a + b;
    }

}
