/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

import java.util.ArrayList;
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

        // Crear lista de cantantesFamosos
        ArrayList<CantanteFamoso> cantantesFamosos = new ArrayList<>();
        cantantesFamosos.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        cantantesFamosos.add(new CantanteFamoso("AC/DC", "Back In Black"));
        cantantesFamosos.add(new CantanteFamoso("Pink Floyd", "The Dark Side Of The Moon"));
        cantantesFamosos.add(new CantanteFamoso("Fleetwood Mac", "Rumours"));
        cantantesFamosos.add(new CantanteFamoso("Led Zeppelin", "Led Zeppelin IV"));

        // Mostrar cantantes y su disco con mas venta
        for (CantanteFamoso cf : cantantesFamosos) {
            System.out.println(cf);
        }

        // Crear un menu en un bucle
        boolean salir = false;
        int opcion;
        String nombre;
        String disco;
        while (!salir) {
            System.out.println("");
            System.out.println("**** MENU DE OPCIONES ****");
            System.out.println("1. Agregar un cantante más");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Elijar la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del cantante: ");
                    nombre = sc.next();
                    System.out.println("Ingrese el disco mas vendido: ");
                    disco = sc.next();
                    cantantesFamosos.add(new CantanteFamoso(nombre, disco));
                    break;
                case 2:
                    for (CantanteFamoso cf : cantantesFamosos) {
                        System.out.println(cf);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese nombre del cantante a eliminar:");
                    nombre = sc.next();
                    boolean encontrado = false;
                    for (int i = 0; i < cantantesFamosos.size(); i++) {
                        if (cantantesFamosos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            encontrado = true;
                            cantantesFamosos.remove(i);
                            System.out.println("Cantante eliminado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Cantante no encontrado.");
                    }
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Elija una opción válida.");
                    break;
            }

        }

    }

}
