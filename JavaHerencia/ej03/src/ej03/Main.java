/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej03;

import ej03.entities.Electrodomestico;
import ej03.entities.Lavadora;
import ej03.entities.Televisor;
import ej03.services.ElectrodomesticoService;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(
                Arrays.asList(
                        new Lavadora(70, 1500, "azul", 'A', 30),
                        new Lavadora(20, 800, "rojo", 'B', 80),
                        new Televisor(42, true, 400, "negro", 'C', 40),
                        new Televisor(27, false, 400, "gris", 'D', 20)
                )
        );

        ElectrodomesticoService es = new ElectrodomesticoService(electrodomesticos);
        es.mostrarPrecios();

    }

}
