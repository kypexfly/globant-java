/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

import ex04.entities.Estudiante;
import ex04.entities.PersonalDeServicio;
import ex04.entities.Profesor;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Fisica", "Richard", "Feynman", "21309812", "soltero");
        Profesor profesor = new Profesor("Fisica", 1940, 1234, "Ernest", "Rutherford", "0031293", "casado");
        PersonalDeServicio personal = new PersonalDeServicio("Biblioteca", 1950, 4321, "Niels", "Bohr", "61394", "divorciado");

        estudiante.mostrarInformacion();
        System.out.println("---");
        estudiante.setCurso("Telecomunicaciones");
        estudiante.mostrarInformacion();
        System.out.println("---");

        profesor.mostrarInformacion();
        System.out.println("---");
        profesor.setDepartamento("Arquitectura");
        profesor.mostrarInformacion();
        System.out.println("---");

        personal.mostrarInformacion();
        System.out.println("---");

        personal.setSeccionAsignada("Decanato");
        personal.mostrarInformacion();

        System.out.println("---");
        estudiante.setEstadoCivil("casado");
        estudiante.mostrarInformacion();
    }

}
