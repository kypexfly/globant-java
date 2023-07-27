/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class AlumnoService {

    private List<Alumno> alumnos;
    private Scanner sc;

    public AlumnoService() {
        this.alumnos = new ArrayList();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno crearAlumno() {

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = sc.next();

        System.out.println("Ingrese las 3 notas del alumno");
        List<Integer> notas = new ArrayList();

        while (notas.size() < 3) {
            System.out.print("Nota " + (notas.size() + 1) + ": ");
            notas.add(sc.nextInt());
        }

        return new Alumno(nombre, notas);

    }

    public void fabricaAlumnos() {

        boolean salir = false;

        do {
            alumnos.add(crearAlumno());
            System.out.println("¿Quiere crear otro alumno? (s/n)");
            String userResponse = sc.next();
            if (userResponse.toLowerCase().equals("n")) {
                salir = true;
            }
        } while (!salir);

    }

    public Alumno obtenerAlumnoPorNombre(String nombre) {

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(nombre)) {
                return alumnos.get(i);
            }
        }

        return null;
    }

    public double notaFinal(Alumno a) {
        List<Integer> notas = a.getNotas();

        if (notas.isEmpty()) {
            System.out.println("El alumno no tiene notas");
            return 0;
        }

        double notaTotal = 0;
        for (int nota : notas) {
            notaTotal += nota;
        }

        return notaTotal / notas.size();
    }

    public void mostrarNotaFinal() {
        System.out.println(
                "Ingrese el nombre del alumno que quiere calcular su nota: "
        );
        Alumno alumno = obtenerAlumnoPorNombre(sc.next());

        if (alumno == null) {
            System.out.println("Alumno no encontrado.");
            return;
        }

        double notaFinal = notaFinal(alumno);

        System.out.println("Nota final: " + notaFinal);
    }

    public void listarAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    

}
