/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.entities;

/**
 *
 * @author rczgr
 */
public class PersonalDeServicio extends Empleado {

    private String seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccionAsignada, int anoIncorporacion, int numDespacho, String nombre, String apellidos, String id, String estadoCivil) {
        super(anoIncorporacion, numDespacho, nombre, apellidos, id, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sección: " + this.seccionAsignada);
    }

}
