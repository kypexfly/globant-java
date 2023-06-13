/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();
        System.out.println("Ingrese la frase: ");
        cadena.setSentence(scanner.nextLine());
        cadena.mostrarVocales();
        cadena.invertirFrase();
        cadena.vecesRepetido('a');
        cadena.compararLongitud("a");
        cadena.unirFrases("uniendo esto");
        cadena.reemplazar('x');
        cadena.contiene('a');

    }

}
