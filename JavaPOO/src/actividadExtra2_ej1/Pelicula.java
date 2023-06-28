/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra2_ej1;

/**
 *
 * @author rczgr
 */
public class Pelicula {

    private String titulo;
    private String genero;
    private int anio;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + '}';
    }

}
