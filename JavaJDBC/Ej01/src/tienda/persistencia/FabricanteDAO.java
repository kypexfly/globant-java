/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author rczgr
 */
public class FabricanteDAO extends DAO {

    public void insertarFabricante(Fabricante fabricante) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "')";
            insertUpdateDeleteDb(sql);
        } finally {
            disconnectDb();
        }
    }
}
