/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra1_ej2.Entity;

/**
 *
 * @author rczgr
 */
public class Rombo implements Figura {

    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo() {
    }

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return diagonalMayor * diagonalMenor / 2;
    }

    public double perimetro() {
        return 4 * lado;
    }
}
