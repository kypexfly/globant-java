/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej09;

/**
 *
 * @author rczgr
 */
public class Matematica {

    private double a;
    private double b;

    public Matematica() {
    }

    public Matematica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double devolverMayor() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public double calcularPotencia() {
        double roundA = Math.round(a);
        double roundB = Math.round(b);

        if (devolverMayor() == a) {
            return Math.pow(roundA, roundB);
        } else {
            return Math.pow(roundB, roundA);
        }

    }

    public double calcularRaiz() {
        double absA = Math.abs(a);
        double absB = Math.abs(b);

        if (devolverMayor() == a) {
            return Math.sqrt(absB);
        } else {
            return Math.sqrt(absA);
        }

    }

}
