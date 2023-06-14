/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra1_ej1.Entity;

import actividadExtra1_ej1.Vehiculo;

/**
 *
 * @author rczgr
 */
public class Automovil implements Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int desplazamiento = 0;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public void moverse(int segundos) {
        desplazamiento += 3 * segundos;
    }

    public void frenar() {
        desplazamiento += 2;
    }
}
