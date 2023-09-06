/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected double precioPorHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public double calcularPrecioPorHabitacion() {
        return 50 + 1 * cantHabitaciones;
    }

    public double getPrecioPorHabitacion() {
        return precioPorHabitacion;
    }

}
