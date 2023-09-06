/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public class Hotel4 extends Hotel {

    protected Gimnasio gimnasio; // make this as a class
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioPorHabitacion = calcularPrecioPorHabitacion();
    }

    @Override
    public double calcularPrecioPorHabitacion() {
        return super.calcularPrecioPorHabitacion()
                + calcularPrecioRestaurante()
                + calcularPrecioGimnasio();
    }

    public double calcularPrecioRestaurante() {

        if (capacidadRestaurante < 30) {
            return 10;
        } else if (capacidadRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }

    }

    public double calcularPrecioGimnasio() {

        String tipoGimnasio = gimnasio.getTipo().toString();

        if (tipoGimnasio.equalsIgnoreCase("A")) {
            return 50;
        } else {
            return 30;
        }

    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

}
