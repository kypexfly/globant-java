/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.entities;

/**
 *
 * @author rczgr
 */
public class Velero extends Barco {

    protected int numeroMastiles;

    public Velero() {
    }

    public Velero(String matricula, double esloraEnMetros, int anioFabricacion, int numeroMastiles) {
        super(matricula, esloraEnMetros, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }

}
