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
public class Ej02_ReadAndWriteYourName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable 
        // y lo muestre por pantalla.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = read.nextLine();
        System.out.println("Your name is: " + name);
        
    }
    
}
