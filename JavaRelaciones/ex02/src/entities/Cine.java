/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author rczgr
 */
public class Cine {
    // De Cine nos interesa conocer la película que se está reproduciendo, la
    // sala con los espectadores y el precio de la entrada.

    private Pelicula peliculaActual;
    private String[][] sala;
    private double precio;

    public Cine(Pelicula peliculaActual, String[][] sala, double precio) {
        this.peliculaActual = peliculaActual;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeliculaActual() {
        return peliculaActual;
    }

    public void setPeliculaActual(Pelicula peliculaActual) {
        this.peliculaActual = peliculaActual;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
