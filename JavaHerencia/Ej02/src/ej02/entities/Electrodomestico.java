/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej02.entities;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author rczgr
 */
public class Electrodomestico {

    protected double precio;
    protected String color; // disponibles: blanco, negro, rojo, azul y gris 
    protected Character consumoEnergetico; // letras entre A y F
    protected int peso;

    private static final Set<String> COLORES_DISPONIBLES
            = new HashSet<>(Arrays.asList(
                    "blanco",
                    "negro",
                    "rojo",
                    "azul",
                    "gris")
            );

    public Electrodomestico() {
    }

    private static final Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico(
            double precio,
            String color,
            char consumoEnergetico,
            int peso
    ) {
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private final void comprobarConsumoEnergetico(Character letra) {
        if ((letra.compareTo('A') > 0 && letra.compareTo('F') < 0)) {
            consumoEnergetico = letra;
        } else {
            System.out.println("Letra de consumo energético incorrecto.");
            System.out.println("Se asignará F por defecto.");
            consumoEnergetico = 'F';
        }
    }

    private final void comprobarColor(String color) {
        if (COLORES_DISPONIBLES.contains(color.toLowerCase())) {
            this.color = color;
        } else {
            System.out.println("Color no disponible.");
            System.out.println("Se asignará blanco por defecto.");
            this.color = "blanco";
        }
    }

    private final Electrodomestico crearElectrodomestico() {
        Electrodomestico e = new Electrodomestico();

        System.out.print("Ingrese el color: ");
        e.comprobarColor(sc.next());
        System.out.print("Ingrese el consumo energetico: ");
        e.comprobarConsumoEnergetico(sc.next().charAt(0));
        System.out.print("Ingrese el peso: ");
        e.setPeso(sc.nextInt());

        // Precio base
        e.setPrecio(1000);

        return e;

    }

    private void precioFinal() {
        
    }

}
