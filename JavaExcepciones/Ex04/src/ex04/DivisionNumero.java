/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

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

        System.out.print("Número A: ");
        int a = Integer.parseInt(sc.next());
        System.out.print("Número B: ");
        int b = Integer.parseInt(sc.next());

        System.out.println("La división de A y B es: ");
        double resultado = (double) a / b;

        System.out.println(resultado);

    }

}
