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
public class Ej11_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        Menu(number1, number2);

    }

    public static void Menu(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("SUMA: " + a + " + " + b + " = ");
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.print("RESTA: " + a + " - " + b + " = ");
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.print("MULTIPLICACIÓN: " + a + " * " + b + " = ");
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.print("DIVISIÓN: " + a + " / " + b + " = ");
                    System.out.println((double) a / b);
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)?: ");
                    char answer = scanner.next().charAt(0);
                    if (answer == 's' || answer == 'S') {
                        exit = true;
                    }
                    break;
            }

            System.out.println(""); // blank space
        }

    }

}
