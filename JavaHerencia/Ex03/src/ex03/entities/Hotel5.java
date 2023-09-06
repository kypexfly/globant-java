/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public final class Hotel5 extends Hotel4 {

    private int cantSalonesConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalonesConferencia, int cantSuites, int cantLimosinas, Gimnasio gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.precioPorHabitacion = calcularPrecioPorHabitacion();
    }

    @Override
    public double calcularPrecioPorHabitacion() {
        return super.calcularPrecioPorHabitacion()
                + calcularPrecioRestaurante()
                + calcularPrecioGimnasio()
                + calcularPrecioLimosinas();
    }

    public double calcularPrecioLimosinas() {
        return 15 * cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

}
