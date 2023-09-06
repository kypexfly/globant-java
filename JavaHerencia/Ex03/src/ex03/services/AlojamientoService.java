/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.services;

import java.util.ArrayList;
import ex03.entities.Alojamiento;
import ex03.entities.Camping;
import ex03.entities.Hotel;
import ex03.entities.Residencia;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class AlojamientoService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Alojamiento> alojamientos;

    public AlojamientoService(ArrayList<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public void consultarAlojamientos() {
        boolean salir = false;

        String input;

        while (!salir) {
            System.out.println("");
            System.out.println("SERVICIO DE ALOJAMIENTOS");

            System.out.println("Consultar:");
            System.out.println("A. Todos los alojamientos");
            System.out.println("B. Todos los hoteles de más caro a más barato");
            System.out.println("C. Todos los campings con restaurante");
            System.out.println("D. Todas las residencias que tienen descuentos");
            System.out.println("E. Salir");

            System.out.print("Opción: ");
            input = sc.next().toUpperCase();

            switch (input) {
                case "A":
                    mostrarAlojamientos();
                    break;
                case "B":
                    mostrarHotelesPorPrecio();
                    break;
                case "C":
                    mostrarCampingsConRestaurante();
                    break;
                case "D":
                    mostrarResidenciasConDescuento();
                    break;
                case "E":
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Escoja una opción válida");
            }

        }
    }

    public void mostrarAlojamientos() {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
    }

    public void mostrarHotelesPorPrecio() {
        ArrayList<Hotel> hoteles = new ArrayList<>();

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }

        Collections.sort(hoteles, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel h1, Hotel h2) {
                return Double.compare(h2.getPrecioPorHabitacion(), h1.getPrecioPorHabitacion());
            }
        });

        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
    }

    public void mostrarCampingsConRestaurante() {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping && ((Camping) alojamiento).getTieneRestaurante()) {
                System.out.println(alojamiento);
            }
        }
    }

    public void mostrarResidenciasConDescuento() {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia && ((Residencia) alojamiento).getTieneDescGremios()) {
                System.out.println(alojamiento);
            }
        }
    }

}
