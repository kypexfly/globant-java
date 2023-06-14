/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra1_ej1;

import actividadExtra1_ej1.Entity.Bicicleta;
import actividadExtra1_ej1.Entity.Automovil;
import actividadExtra1_ej1.Entity.Motocicleta;

/**
 *
 * @author rczgr
 */
public class VehiculoFactory {

    public Vehiculo crearVehiculo(String marca, String modelo, int anio, String tipo) {
        if (tipo.equalsIgnoreCase("automovil")) {
            return new Automovil(marca, modelo, anio, tipo);
        } else if (tipo.equalsIgnoreCase("motocicleta")) {
            return new Motocicleta(marca, modelo, anio, tipo);
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            return new Bicicleta(marca, modelo, anio, tipo);
        } else {
            throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipo);
        }
    }
}
