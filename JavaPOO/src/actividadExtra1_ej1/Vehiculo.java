/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package actividadExtra1_ej1;

/**
 *
 * @author rczgr
 */
public interface Vehiculo {

    void moverse(int segundos);

    void frenar();

    String getMarca();

    String getModelo();

    int getAnio();

    String getTipo();

    int getDesplazamiento();

}
