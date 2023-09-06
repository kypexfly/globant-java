/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.entities;

/**
 *
 * @author rczgr
 */
public class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anoIncorporacion, int numDespacho, String nombre, String apellidos, String id, String estadoCivil) {
        super(anoIncorporacion, numDespacho, nombre, apellidos, id, estadoCivil);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + this.departamento);
    }

}
