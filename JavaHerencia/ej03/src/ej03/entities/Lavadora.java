/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03.entities;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public final class Lavadora extends Electrodomestico {

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        System.out.println("CREAR LAVADORA");
        super.crearElectrodomestico();

        System.out.print("Ingrese la carga: ");
        setCarga(sc.nextInt());

    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (getCarga() > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }

}
