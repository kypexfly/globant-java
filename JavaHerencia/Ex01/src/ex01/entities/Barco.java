/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.entities;

/**
 *
 * @author rczgr
 */
public class Barco {
    // su matrícula, su eslora en metros y año de fabricación.

    protected String matricula;
    protected double esloraEnMetros;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double esloraEnMetros, int anioFabricacion) {
        this.matricula = matricula;
        this.esloraEnMetros = esloraEnMetros;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEsloraEnMetros() {
        return esloraEnMetros;
    }

    public void setEsloraEnMetros(double esloraEnMetros) {
        this.esloraEnMetros = esloraEnMetros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double calcularModulo() {
        return esloraEnMetros * 10;
    }

    public double calcularPrecioAlquiler(int diasOcupado) {
        return diasOcupado * calcularModulo();
    }

}
