/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra1_ej2.Entity;

/**
 *
 * @author rczgr
 */
public class Pentagono implements Figura {

    private double apotema;
    private double lado;
    private static final int vertices = 5;

    public Pentagono() {
    }

    public Pentagono(double apotema, double lado) {
        this.apotema = apotema;
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return vertices * lado * apotema / 2;
    }

    public double perimetro() {
        return vertices * lado;
    }
}
