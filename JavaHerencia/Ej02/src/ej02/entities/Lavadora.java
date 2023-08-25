/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02.entities;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

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

    public Lavadora crearLavadora() {
        Lavadora lavadora = new Lavadora();

        System.out.println("Ingrese la carga: ");
        lavadora.setCarga(sc.nextInt());

        return lavadora;
    }

    public void precioFinal() {
        
    }

}
