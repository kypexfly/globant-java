/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author rczgr
 */
public class Libreria {

    private HashSet<Libro> libros;

    public Libreria() {
        this.libros = new HashSet();
    }

    public Libreria(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public boolean prestamo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getNumeroEjemplares() > 0) {
                libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
                libro.setNumeroPrestados(libro.getNumeroPrestados() + 1);
                return true;
            }
        }
        return false;
    }

    public boolean devolucion(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getNumeroPrestados() > 0) {
                libro.setNumeroEjemplares(libro.getNumeroEjemplares() + 1);
                libro.setNumeroPrestados(libro.getNumeroPrestados() - 1);
                return true;
            }
        }
        return false;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    @Override
    public String toString() {
        return "Libreria{" + "libros=" + libros + '}';
    }

}
