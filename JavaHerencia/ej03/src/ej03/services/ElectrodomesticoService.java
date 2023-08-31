/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03.services;

import java.util.ArrayList;
import ej03.entities.Electrodomestico;
import ej03.entities.Lavadora;
import ej03.entities.Televisor;

/**
 *
 * @author rczgr
 */
public class ElectrodomesticoService {

    private ArrayList<Electrodomestico> electrodomesticos;

    public ElectrodomesticoService(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public void mostrarPrecios() {
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            precioTotalElectrodomesticos += electrodomestico.precioFinal();

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            }

        }

        System.out.println("El precio total de los electrodomesticos es: $" + precioTotalElectrodomesticos);
        System.out.println("El precio total de las lavadoras es: $" + precioTotalLavadoras);
        System.out.println("El precio total de los televisores es: $" + precioTotalTelevisores);

    }

}
