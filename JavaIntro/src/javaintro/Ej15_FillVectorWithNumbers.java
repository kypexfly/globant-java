/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintro;

/**
 *
 * @author rczgr
 */
public class Ej15_FillVectorWithNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        // muestre por pantalla en orden descendente.

        int[] numbers = new int[100];

        // Guardar números
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Mostrar números
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
