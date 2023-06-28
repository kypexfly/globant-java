/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra2_ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class PeliculaService {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    public void crearPelicula() {
        Pelicula pelicula = new Pelicula();

        System.out.println("Ingrese el título de la película: ");
        pelicula.setTitulo(sc.next());
        System.out.println("Ingrese el género de la película: ");
        pelicula.setGenero(sc.next());
        System.out.println("Ingrese el año de la película: ");
        pelicula.setAnio(sc.nextInt());
        System.out.println("Ingrese la duración de la película: ");
        pelicula.setDuracion(sc.nextInt());

        peliculas.add(pelicula);
    }

    public void listarPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }

    public void buscarPorTitulo() {
        System.out.println("Ingrese el título de la película a buscar: ");
        boolean encontrado = false;
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(sc.nextLine().toLowerCase())) {
                System.out.println("Sí existe:");
                System.out.println(p);
                encontrado = true;
                // termina el bucle si ya encuentra el título
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe :(");
        }
    }

    public void buscarPorGenero() {
        System.out.println("Ingrese el género de la película a buscar: ");
        boolean encontrado = false;
        for (Pelicula p : peliculas) {
            if (p.getGenero().equalsIgnoreCase(sc.next())) {
                System.out.println("Sí existe: ");
                System.out.println(p);
                encontrado = true;
                // termina el bucle si ya encuentra el género
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No existe :(");
        }
    }

}
