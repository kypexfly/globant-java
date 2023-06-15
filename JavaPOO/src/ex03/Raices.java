/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author rczgr
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Raiz: "
                    + (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));

            System.out.println("Raiz 2: "
                    + (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        } else {
            System.out.println("No hay raices");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("Raiz: "
                    + (-b / (2 * a)));
        } else {
            System.out.println("No hay raices");
        }
    }

    public void calcular() {
        if (getDiscriminante() > 0) {
            obtenerRaices();
        } else {
            obtenerRaiz();

        }
    }
}
