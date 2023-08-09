/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02.entities;

/**
 *
 * @author rczgr
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(Revolver r) {
        System.out.println("");
        System.out.println(nombre + " se apunta con el revolver de agua.");
        if (r.mojar()) {
            System.out.println("¡El revolver de agua tira el agua! " + nombre + " se moja.");
            mojado = true;
            return true;
        } else {
            System.out.println("El revolver de agua no tira el agua. " + nombre + " sigue seco.");
            return false;
        }
    }

    public boolean estaMojado() {
        return mojado;
    }

    public String toString() {
        return nombre + " está " + (mojado ? "mojado" : "seco");
    }
}
