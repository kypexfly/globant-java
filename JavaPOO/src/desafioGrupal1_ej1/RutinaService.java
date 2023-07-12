/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioGrupal1_ej1;

import java.util.ArrayList;
import desafioGrupal1_ej1.Rutina;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class RutinaService {

    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    {
        rutinas.add(new Rutina(1, "Cardio", 100, "Fácil", "Aumentar de peso"));
    }

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearRutina() {
        Rutina rutina = new Rutina();

        System.out.println("Ingrese el ID: ");
        rutina.setId(sc.nextInt());
        System.out.println("Ingrese el nombre: ");
        rutina.setNombre(sc.next());
        System.out.println("Ingrese el duracion: ");
        rutina.setDuracion(sc.nextInt());
        System.out.println("Ingrese el nivel de dificultad: ");
        rutina.setNivelDificultad(sc.next());
        System.out.println("Ingrese la descripción: ");
        rutina.setDescripcion(sc.next());
    }

    public void obtenerRutinas() {
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
                break;
            }
        }
        System.out.println("Rutina con el id " + id + " no encontrado.");
    }

    public void eliminarRutina(int id) {
        for (int i = 0; i < rutinas.size(); i++) {
            Rutina rutina = rutinas.get(i);
            if (rutina.getId() == id) {
                rutinas.remove(i);
                break;
            }
        }
        System.out.println("No se puede eliminar. Rutina con el id " + id + " no encontrado.");

    }
}
