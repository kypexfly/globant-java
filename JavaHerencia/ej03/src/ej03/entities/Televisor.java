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
public class Televisor extends Electrodomestico {

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    private int resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        System.out.println("CREAR TELEVISOR");

        super.crearElectrodomestico();

        System.out.print("Ingrese la resolución del TV: ");
        setResolucion(sc.nextInt());
        System.out.print("¿Tiene sintonizador TDT? (s/n): ");
        String input = sc.next();
        if (input.toLowerCase() == "s") {
            setSintonizadorTDT(true);
        } else {
            setSintonizadorTDT(false);
        }
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (getResolucion() > 40) {
            precioFinal *= 1.3;
        }

        if (isSintonizadorTDT()) {
            precioFinal += 500;
        }

        return precioFinal;
    }

}
