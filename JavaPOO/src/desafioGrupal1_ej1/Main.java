/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioGrupal1_ej1;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

        cs.obtenerClientes();
        cs.eliminarCliente(1);
        cs.obtenerClientes();

        rs.obtenerRutinas();
        rs.eliminarRutina(1);
        rs.obtenerRutinas();

    }

}
