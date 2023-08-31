package ex01.services;

import ex01.entities.Perro;
import ex01.entities.Persona;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rczgr
 */
public class ServicioAdopcion {

    private ArrayList<Perro> perrosDisponibles;
    private ArrayList<Persona> personasAdoptantes;

    public ServicioAdopcion(ArrayList<Perro> perrosDisponibles) {
        this.perrosDisponibles = perrosDisponibles;
        this.personasAdoptantes = new ArrayList<>();
    }

    public ArrayList<Perro> obtenerPerrosDisponibles() {
        return perrosDisponibles;
    }

    public void adoptarPerro(Persona persona, Perro perro) {
        if (!perrosDisponibles.contains(perro)) {
            System.out.println("El perro ya está adoptado");
            return;
        }

        if (personasAdoptantes.stream().anyMatch(p -> p.getPerro() == perro)) {
            System.out.println("El perro ya fue adoptado por otra persona");
            return;
        }

        perrosDisponibles.remove(perro);
        persona.setPerro(perro);
        personasAdoptantes.add(persona);
    }

    public ArrayList<Persona> obtenerPersonasAdoptantes() {
        return personasAdoptantes;
    }
}
