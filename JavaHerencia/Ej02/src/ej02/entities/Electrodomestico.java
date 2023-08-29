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
        this.precio = 100;
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

    private void comprobarConsumoEnergetico(Character letra) {
        if ((letra.compareTo('A') > 0 && letra.compareTo('F') < 0)) {
            consumoEnergetico = letra;
        } else {
            System.out.println("Letra de consumo energético incorrecto.");
            System.out.println("Se asignará F por defecto.");
            consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        if (COLORES_DISPONIBLES.contains(color.toLowerCase())) {
            this.color = color;
        } else {
            System.out.println("Color no disponible.");
            System.out.println("Se asignará blanco por defecto.");
            this.color = "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e = new Electrodomestico();

        System.out.print("Ingrese el color: ");
        e.comprobarColor(sc.next());
        System.out.print("Ingrese el consumo energetico: ");
        e.comprobarConsumoEnergetico(sc.next().charAt(0));
        System.out.print("Ingrese el peso: ");
        e.setPeso(sc.nextInt());

        // Precio base
        e.setPrecio(1000);
        precioFinal(e);

        return e;

    }

    private void precioFinal(Electrodomestico e) {
        switch (e.consumoEnergetico) {
            case 'A':
                e.precio += 1000;
                break;
            case 'B':
                e.precio += 800;
                break;
            case 'C':
                e.precio += 600;
                break;
            case 'D':
                e.precio += 500;
                break;
            case 'E':
                e.precio += 300;
                break;
            case 'F':
                e.precio += 100;
                break;
            default:
                throw new AssertionError();
        }

        if (e.peso > 80) {
            e.precio += 1000;
        } else if (e.peso > 50) {
            e.precio += 800;
        } else if (e.peso > 20) {
            e.precio += 500;
        } else if (e.peso > 1) {
            e.precio += 100;
        } else {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
