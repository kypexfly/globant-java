/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.entities;

/**
 *
 * @author rczgr
 */
public class YateLujo extends Barco {
    // Potencia en CV y número de camarotes para yates de lujo.

    protected double potenciaCV;
    protected int numeroCamarotes;

    public YateLujo(double potenciaCV, int numeroCamarotes) {
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateLujo(String matricula, double esloraEnMetros, int anioFabricacion, double potenciaCV, int numeroCamarotes) {
        super(matricula, esloraEnMetros, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numeroCamarotes;
    }

}
