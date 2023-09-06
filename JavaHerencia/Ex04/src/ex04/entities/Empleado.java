/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.entities;

/**
 *
 * @author rczgr
 */
public class Empleado extends Persona {

    protected int anoIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anoIncorporacion, int numDespacho, String nombre, String apellidos, String id, String estadoCivil) {
        super(nombre, apellidos, id, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Año de incorporación: " + this.anoIncorporacion);
        System.out.println("Número de despacho: " + this.numDespacho);
    }

}
