/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej04;

import ej04.entities.Circulo;
import ej04.entities.Rectangulo;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo c = new Circulo(10);
        System.out.println("Área del círculo: " + c.calcularArea());
        System.out.println("Perímetro del círculo: " + c.calcularPerimetro());

        Rectangulo r = new Rectangulo(10, 5);
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Perímetro del rectángulo: " + r.calcularPerimetro());

    }

}
