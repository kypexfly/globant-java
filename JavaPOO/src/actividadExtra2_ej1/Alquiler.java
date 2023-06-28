/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra2_ej1;

import java.time.LocalDate;

/**
 *
 * @author rczgr
 */
public class Alquiler {

    private String tituloPelicula;
    // Se recomienda usar LocalDate en vez de Date para las fechas
    // Date está deprecado (obsoleto)
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String peliculaT, LocalDate fechaInicio, LocalDate fechaFin) {
        this.tituloPelicula = peliculaT;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = AlquilerService.calcularPrecioAlquiler(fechaInicio, fechaFin);
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "peliculaT=" + tituloPelicula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + '}';
    }

}
