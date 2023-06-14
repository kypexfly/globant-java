/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra1_ej2;

import actividadExtra1_ej2.Entity.Figura;
import actividadExtra1_ej2.Entity.Circulo;
import actividadExtra1_ej2.Entity.Cuadrado;
import actividadExtra1_ej2.Entity.Hexagono;
import actividadExtra1_ej2.Entity.Rectangulo;
import actividadExtra1_ej2.Entity.Rombo;
import actividadExtra1_ej2.Entity.Triangulo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class FiguraFactory {

    Scanner sc = new Scanner(System.in);

    public Figura crearFigura() {

        System.out.println("CREAR FIGURA *******");
        System.out.println("Elija una: " + Arrays.toString(FiguraTipo.values()));

        FiguraTipo tipo = FiguraTipo.valueOf(sc.nextLine());

        if (tipo.toString().equalsIgnoreCase("Circulo")) {
            Circulo figura = new Circulo();
            System.out.print("Radio: ");
            figura.setRadio(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Cuadrado")) {
            Cuadrado figura = new Cuadrado();
            System.out.print("Lado: ");
            figura.setLado(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Hexagono")) {
            Hexagono figura = new Hexagono();
            System.out.print("Apotema: ");
            figura.setLado(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Pentagono")) {
            Cuadrado figura = new Cuadrado();
            System.out.print("Apotema: ");
            figura.setLado(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Rectangulo")) {
            Rectangulo figura = new Rectangulo();
            System.out.print("Largo: ");
            figura.setLargo(sc.nextDouble());
            System.out.print("Ancho: ");
            figura.setAncho(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Rombo")) {
            Rombo figura = new Rombo();
            System.out.print("Diagonal Mayor: ");
            figura.setDiagonalMayor(sc.nextDouble());
            System.out.print("Diagonal Menor: ");
            figura.setDiagonalMenor(sc.nextDouble());
            System.out.print("Lado: ");
            figura.setLado(sc.nextDouble());
            return figura;
        } else if (tipo.toString().equalsIgnoreCase("Triangulo")) {
            Triangulo figura = new Triangulo();
            System.out.print("Base: ");
            figura.setBase(sc.nextDouble());
            System.out.print("Altura: ");
            figura.setAltura(sc.nextDouble());
            return figura;
        } else {
            throw new IllegalArgumentException("Tipo de figura desconocido: " + tipo);
        }

    }

}
