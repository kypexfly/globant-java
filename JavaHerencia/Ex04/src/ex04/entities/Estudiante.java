/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.entities;

/**
 *
 * @author rczgr
 */
public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellidos, String id, String estadoCivil) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + this.curso);
    }

}
