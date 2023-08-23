/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import java.util.Random;
import entities.Espectador;

/**
 *
 * @author rczgr
 */
public class EspectadorService {

    private static final String[] NOMBRES = {"Ana", "Juan", "Pedro", "María", "Luis", "Lucía", "Carlos", "Berta"};
    private static final Random RANDOM = new Random();

    // Generar espectadores
    public static ArrayList<Espectador> generarEspectadores(int numEspectadores) {
        ArrayList<Espectador> espectadores = new ArrayList<>();
        for (int i = 0; i < numEspectadores; i++) {
            String nombre = NOMBRES[RANDOM.nextInt(NOMBRES.length)];
            int edad = 5 + RANDOM.nextInt(60);
            double dinero = 10 + RANDOM.nextDouble() * 40;
            espectadores.add(new Espectador(nombre, edad, dinero));
        }
        return espectadores;
    }
}
