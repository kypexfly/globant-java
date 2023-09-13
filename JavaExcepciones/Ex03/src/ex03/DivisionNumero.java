/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.print("Número A: ");
            int a = Integer.parseInt(sc.next());
            System.out.print("Número B: ");
            int b = Integer.parseInt(sc.next());

            System.out.println("La división de A y B es: ");
            double resultado = a / b;

            System.out.println(resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error InputMismatchException: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Error NumberFormatException: no se puede parsear a un entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error ArithmeticException: no se puede dividir para cero");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e);
        } finally {
            System.out.println("---END---");
        }

    }

}
