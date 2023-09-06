/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public class Residencia extends AlojamientoExtraHotelero {

    private int cantHabitaciones;
    private boolean tieneDescGremios;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean tieneDescGremios, boolean tieneCampoDeportivo, double superficieEnMetros2, String nombre, String direccion, String localidad, String encargado) {
        super(superficieEnMetros2, nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.tieneDescGremios = tieneDescGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public boolean getTieneDescGremios() {
        return tieneDescGremios;
    }

    @Override
    public String toString() {
        return "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", tieneDescGremios=" + tieneDescGremios + ", tieneCampoDeportivo=" + tieneCampoDeportivo + '}';
    }

}
