/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej02;

import ej02.entities.Electrodomestico;
import ej02.entities.Lavadora;
import ej02.entities.Televisor;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l = new Lavadora();
        l.crearLavadora();

        Televisor t = new Televisor();
        t.crearTelevisor();

        System.out.println("Precio final lavadora: " + l.precioFinal());
        System.out.println("Precio final televisor: " + t.precioFinal());

    }

}
