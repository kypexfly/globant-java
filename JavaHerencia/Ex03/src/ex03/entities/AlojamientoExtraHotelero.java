/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.entities;

/**
 *
 * @author rczgr
 */
public class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected double superficieEnMetros2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(double superficieEnMetros2, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.superficieEnMetros2 = superficieEnMetros2;
    }

}
