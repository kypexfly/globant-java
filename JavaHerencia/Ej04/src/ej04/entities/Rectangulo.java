/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04.entities;

/**
 *
 * @author rczgr
 */
public class Rectangulo implements CalculosFormas {

    private double ancho;
    private double largo;

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return ancho * largo;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + largo);
    }

}
