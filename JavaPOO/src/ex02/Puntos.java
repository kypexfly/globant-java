/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Puntos {

    private Punto p1;
    private Punto p2;
    private static Scanner sc = new Scanner(System.in);

    public Puntos() {
    }

    public Puntos(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public static Puntos crearPuntos() {

        Punto p1 = new Punto();
        Punto p2 = new Punto();

        System.out.println("Punto 1");
        System.out.print("x1: ");
        p1.setX(sc.nextDouble());
        System.out.print("y1: ");
        p1.setY(sc.nextDouble());

        System.out.println("Punto 2");
        System.out.print("x2: ");
        p2.setX(sc.nextDouble());
        System.out.print("y2: ");
        p2.setY(sc.nextDouble());

        Puntos puntos = new Puntos(p1, p2);

        return puntos;
    }

    public double calcularDistancia() {
        double result = Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2);
        return result;
    }

}
