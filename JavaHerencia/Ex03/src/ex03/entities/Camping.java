/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public class Camping extends AlojamientoExtraHotelero {

    private int capacidadMaximaCarpas;
    private int cantBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantBanios, boolean tieneRestaurante, double superficieEnMetros2, String nombre, String direccion, String localidad, String encargado) {
        super(superficieEnMetros2, nombre, direccion, localidad, encargado);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantBanios = cantBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public boolean getTieneRestaurante() {
        return tieneRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaximaCarpas=" + capacidadMaximaCarpas + ", cantBanios=" + cantBanios + ", tieneRestaurante=" + tieneRestaurante + '}';
    }

}
