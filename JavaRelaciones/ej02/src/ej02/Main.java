/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej02;

import ej02.entities.Juego;
import ej02.entities.Jugador;
import ej02.entities.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.llenarJuego();
        juego.ronda();
    }
}
