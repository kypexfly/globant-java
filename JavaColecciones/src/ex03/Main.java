/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Libro> libros = new HashSet<>();

        boolean salir = false;
        String userResponse;

        while (!salir) {

            System.out.println("Creando nuevo libro nuevo libro");
            System.out.print("Titulo: ");
            String nombre = sc.next();
            System.out.print("Autor: ");
            String autor = sc.next();
            System.out.println("Número de ejemplares: ");
            int numeroEjemplares = sc.nextInt();
            System.out.println("Número de ejemplares prestados: ");
            int numeroPrestados = sc.nextInt();

            libros.add(new Libro(nombre, autor, numeroEjemplares, numeroPrestados));

            System.out.println("¿Quiere crear otro libro? (s/n)");
            userResponse = sc.next();
            if (userResponse.equalsIgnoreCase("n")) {
                salir = true;
            }
        }

        Libreria libreria = new Libreria(libros);
        libreria.prestamo("Shark");
        
        libreria.mostrarLibros();

    }

}
