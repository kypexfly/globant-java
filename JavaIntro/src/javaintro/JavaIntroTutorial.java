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
public class JavaIntroTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TUTORIAL INTRO JAVA

        // 1. Crear un proyecto de Java y definir al menos 6 
        // variables en tu IDE de distintos tipos de datos.
        // 2. ¿Recuerdas las variables que creaste en el 
        // ejercicio anterior? Ahora deberás asignarles un valor.
        int entero = 500;
        double decimal = 0.5;
        String cadena = "Hola";
        char caracter = 'v';
        boolean esVerdadero = true;

        // DETECCIÓN DE ERRORES
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;

        // 3. Define variables donde puedas alojar los resultados 
        // y prueba usar dos operadores de cada tipo.
        int suma = 5 + 5;
        int division = 10 / 2;
        boolean bandera2 = suma > division;
        suma++;

        // Define una variable que aloje tu nombre y otra que 
        // guarde tu edad. Imprime ambas variables por pantalla.
        String nombre = "Ricardo";
        int edad = 23;
        System.out.println("Nombre: " + nombre + " Edad: " + edad);

        // LECTURA O ENTRADA EN JAVA
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre2 = read.nextLine();
        System.out.println("Tu nombre es: " + nombre2);

        // 5. Define una variable de tipo boolean, double y char. 
        // Guarda información en ellas a través del Scanner.
        System.out.print("Ingrese una variable booleana: ");
        boolean resBool = read.hasNext();
        System.out.print("Ingrese una variable double: ");
        double resDouble = read.nextDouble();
        System.out.print("Ingrese una variable char: ");
        char resChar = read.next().charAt(0);

        // if else
        if (true) {
            System.out.println("true");
        }
        if (!false) {
            System.out.println("!false");
        }

        // switch case
        switch (nombre) {
            case "Ricardo":
                System.out.println("Bienvenido Ricardo");
                break;
            case "ricardo":
                System.out.println("Bienvenido ricardo");
                break;
            default:
                System.out.println("No eres Ricardo o ricardo");
        }

        // 8. Escriba un programa que valida nota entre 0 y 10, sino que vuelta 
        int nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = read.nextInt();
        }

        /* 10. Realizar un programa que lea 4 números (comprendidos entre 
        1 y 20) e imprima el número ingresado seguido de tantos asteriscos 
        como indique su valor. Por ejemplo:
        
        5 *****
        3 ***
        11 ***********
        2 ** 
         */
        int numEx;
        System.out.println("Ingrese 4 números comprendidos entre 1 a 20:");
        for (int i = 0; i < 4; i++) {
            do {
                numEx = read.nextInt();
                if (numEx < 1 || numEx > 10) {
                    System.out.println("Fuera de rango, repita: ");
                }
            } while (numEx < 1 || numEx > 10);

            System.out.print(numEx + " ");

            for (int j = 0; j < numEx; j++) {
                if (j == numEx-1) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }

    }

}
