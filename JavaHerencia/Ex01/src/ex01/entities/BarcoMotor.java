/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.entities;

/**
 *
 * @author rczgr
 */
public class BarcoMotor extends Barco {

    protected double potenciaCV;

    public BarcoMotor(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(String matricula, double esloraEnMetros, int anioFabricacion, double potenciaCV) {
        super(matricula, esloraEnMetros, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

}
