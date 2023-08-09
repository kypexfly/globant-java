/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02.entities;

import java.util.Random;

/**
 *
 * @author rczgr
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6);
        posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        } else {
            siguienteChorro();
            return false;
        }
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6;
    }

    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}
