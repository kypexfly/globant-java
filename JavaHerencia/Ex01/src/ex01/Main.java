/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import ex01.entities.Barco;
import ex01.entities.Alquiler;
import ex01.entities.BarcoMotor;
import ex01.entities.Velero;
import ex01.entities.YateLujo;
import java.time.LocalDate;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco barcoNormal = new Barco("ADS123", 50.5, 2003);
        Velero velero = new Velero("DMX212", 100.0, 2010, 3);
        BarcoMotor barcoMotor = new BarcoMotor("DEF456", 15.0, 2010, 200);
        YateLujo yateLujo = new YateLujo("GHI789", 20.0, 2015, 300, 4);

        Alquiler alquilerBarco = new Alquiler(
                "Pedro",
                "12345678A",
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 8),
                1, barcoNormal
        );

        Alquiler alquilerVelero = new Alquiler(
                "Juan",
                "12345678B",
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 8),
                1, velero
        );

        Alquiler alquilerBarcoMotor = new Alquiler(
                "Pedro",
                "87654321C",
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 8),
                2, barcoMotor
        );

        Alquiler alquilerYateLujo = new Alquiler(
                "Maria",
                "11111111D",
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 8),
                3,
                yateLujo);

        System.out.println("Precio alquiler velero: " + alquilerVelero.calcularPrecioAlquiler());
        System.out.println("Precio alquiler barco a motor: " + alquilerBarcoMotor.calcularPrecioAlquiler());
        System.out.println("Precio alquiler yate de lujo: " + alquilerYateLujo.calcularPrecioAlquiler());
    }

}
