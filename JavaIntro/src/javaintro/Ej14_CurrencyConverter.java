/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ej14_CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
         */

        Scanner scanner = new Scanner(System.in);
        double euro;
        String target;

        System.out.print("Enter the amount to convert: €");
        euro = scanner.nextDouble();
        System.out.print("Enter the currency target (pound, dollar or yen): ");
        target = scanner.next().toLowerCase();

        euroConverter(euro, target);

    }

    public static void euroConverter(double euro, String target) {
        double[] convertionVector = {0.86, 1.28611, 129.852};

        switch (target) {
            case "pound":
                System.out.println(euro + "€ = " + convertionVector[0] * euro + "$ (DOLLARS)");
                break;
            case "dollar":
                System.out.println(euro + "€ = " + convertionVector[1] * euro + "£ (POUNDS)");
                break;
            case "yen":
                System.out.println(euro + "€ = " + convertionVector[2] * euro + "¥ (YENS)");
                break;
            default:
                System.out.println("INVALID TARGET: Please enter \"pound\", \"dollar\" or \"yen\" ");
        }
    }

}
