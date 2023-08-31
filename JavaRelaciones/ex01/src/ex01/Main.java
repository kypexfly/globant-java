/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import ex01.entities.Perro;
import ex01.entities.Persona;
import ex01.services.ServicioAdopcion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Fido", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Toby", "Chihuahua", 1, "Pequeño");

        ArrayList<Perro> perrosDisponibles = new ArrayList<>();
        perrosDisponibles.add(perro1);
        perrosDisponibles.add(perro2);

        ServicioAdopcion servicioAdopcion = new ServicioAdopcion(perrosDisponibles);

        Persona persona1 = new Persona("Juan", "García", 25, 12345678);
        Persona persona2 = new Persona("María", "Martínez", 30, 23456789);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Perros disponibles para adoptar:");
        servicioAdopcion.obtenerPerrosDisponibles().forEach(perro -> System.out.println(perro.getNombre()));

        System.out.print("Persona 1, ¿qué perro quieres adoptar? (ingresa el id del perro): ");
        try {
            Long idPerro1 = scanner.nextLong();
            Perro perroAdoptado1 = servicioAdopcion.obtenerPerrosDisponibles().stream().filter(p -> p.getNombre().equals(idPerro1)).findFirst().orElse(null);
            if (perroAdoptado1 == null) {
                System.out.println("El perro no está disponible para adoptar");
            } else {
                servicioAdopcion.adoptarPerro(persona1, perroAdoptado1);
                System.out.println("Perro adoptado por persona 1: " + perroAdoptado1.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Persona 2, ¿qué perro quieres adoptar? (ingresa el id del perro): ");
        try {
            Long idPerro2 = scanner.nextLong();
            Perro perroAdoptado2 = servicioAdopcion.obtenerPerrosDisponibles().stream().filter(p -> p.getNombre().equals(idPerro2)).findFirst().orElse(null);
            if (perroAdoptado2 == null) {
                System.out.println("El perro no está disponible para adoptar");
            } else {
                servicioAdopcion.adoptarPerro(persona2, perroAdoptado2);
                System.out.println("Perro adoptado por persona 2: " + perroAdoptado2.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Personas que adoptaron perros:");
        servicioAdopcion.obtenerPersonasAdoptantes().forEach(persona -> System.out.println(persona.getNombre() + " adoptó a " + persona.getPerro().getNombre()));
    }
}
