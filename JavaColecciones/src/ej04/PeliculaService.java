/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class PeliculaService {

    private Scanner sc;
    private List<Pelicula> peliculas;

    public PeliculaService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Titanic", "James Cameron", 3));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2));
        peliculas.add(new Pelicula("Oppenheimer", "Christopher Nolan", 3));
        peliculas.add(new Pelicula("Star Trek", "Akiva Goldsman", 1));
    }

    public Pelicula crearPelicula() {
        System.out.println("Titulo de la película: ");
        String titulo = sc.next();
        System.out.println("Director de la película: ");
        String director = sc.next();
        System.out.println("Duración de la película (en horas): ");
        int duracion = sc.nextInt();

        return new Pelicula(titulo, director, duracion);
    }

    public void fabricaPeliculas() {

        boolean continuar = true;

        while (continuar) {
            peliculas.add(crearPelicula());
            System.out.println("¿Desea agregar otra película? (s/n)");
            String userResponse = sc.next().toLowerCase();
            if (userResponse.equals("n")) {
                continuar = false;
            }
        }

    }

    public void mostrarPeliculas() {
        System.out.println("**** Películas:");
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }

    public void mostrarPeliculasMasDeUnaHora() {
        System.out.println("**** Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPeliculasPorDuracionMayorAMenor() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });

        System.out.println("**** Listado de películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });

        System.out.println("**** Listado de películas ordenadas por duración (de menor a mayor):");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });

        System.out.println("**** Listado de películas ordenadas por título:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });

        System.out.println("**** Listado de películas ordenadas por director:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

}
