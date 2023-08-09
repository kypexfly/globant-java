/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02.entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList<Jugador>();
        revolver = new Revolver();
    }

    public void llenarJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = sc.nextInt();
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        revolver.llenarRevolver();
    }

    public void ronda() {
        int indiceJugadorActual = 0;
        boolean alguienMojado = false;
        while (!alguienMojado) {
            Jugador jugadorActual = jugadores.get(indiceJugadorActual);
            alguienMojado = jugadorActual.disparo(revolver);
            if (!alguienMojado) {
                System.out.println(jugadorActual + " pasa el revolver de agua al siguiente jugador.");
                indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
            }
        }
        System.out.println(jugadores.get(indiceJugadorActual) + " es el jugador que se mojó.");
    }
}
