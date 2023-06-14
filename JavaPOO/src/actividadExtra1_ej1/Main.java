/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadExtra1_ej1;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoFactory vf = new VehiculoFactory();
        Vehiculo auto = vf.crearVehiculo("Ford", "F150", 1, "automovil");
        Vehiculo moto = vf.crearVehiculo("Suzuki", "Steppa", 2, "motocicleta");
        Vehiculo bici = vf.crearVehiculo("Montana", "BMX", 5, "bicicleta");

        System.out.println("MOVERSE *********");

        auto.moverse(5);
        moto.moverse(10);
        bici.moverse(60);

        System.out.println("Auto: " + auto.getDesplazamiento() + " metros");
        System.out.println("Moto: " + moto.getDesplazamiento() + " metros");
        System.out.println("Bici: " + bici.getDesplazamiento() + " metros");

        // 5 minutos
        auto.moverse(295);
        moto.moverse(290);
        bici.moverse(240);

        System.out.println("MOVERSE 5 MIN");
        System.out.println("FRENAR *********");

        auto.frenar();
        moto.frenar();
        bici.frenar();

        System.out.println("Auto: " + auto.getDesplazamiento() + " metros");
        System.out.println("Moto: " + moto.getDesplazamiento() + " metros");
        System.out.println("Bici: " + bici.getDesplazamiento() + " metros");

    }

}
