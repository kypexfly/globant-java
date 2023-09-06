/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.entities;

/**
 *
 * @author rczgr
 */
public class Persona {

    protected String nombre;
    protected String apellidos;
    protected String id;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Identificación: " + this.id);
        System.out.println("Estado civil: " + this.estadoCivil);
    }

}
