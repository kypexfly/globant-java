/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadExtra1_ej2;

import actividadExtra1_ej2.Entity.Figura;
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

        FiguraFactory ff = new FiguraFactory();
        Figura figura = ff.crearFigura();
        System.out.println("Area: " + figura.area());
        System.out.println("Perimetro: " + figura.perimetro());

    }

}
