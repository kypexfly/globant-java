
import entities.Perro;
import entities.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Taipan", "Danés", 2, "Grande");
        Perro perro2 = new Perro("Luna", "Dálmata", 4, "Mediano");

        Persona persona1 = new Persona("Ricardo", "Chu", 23, 12345);
        Persona persona2 = new Persona("Pedro", "Gonzales", 30, 54321);

        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        persona1.mostrarInfoPerro();
        persona2.mostrarInfoPerro();

    }

}
