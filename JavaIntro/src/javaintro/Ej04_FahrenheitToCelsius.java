/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class Ej04_FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        // Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        System.out.println("-10C = " + convertCtoF(-10) + "F");
        System.out.println("0C = " + convertCtoF(0) + "F");
        System.out.println("10C = " + convertCtoF(10) + "F");
    }

    public static double convertCtoF(double C) {
        return 32 + (9 * C / 5);
    }

}
