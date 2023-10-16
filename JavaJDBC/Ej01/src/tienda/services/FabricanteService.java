/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.services;

import tienda.persistencia.FabricanteDAO;
import tienda.entidades.Fabricante;

/**
 *
 * @author rczgr
 */
public class FabricanteService {

    private FabricanteDAO fabricanteDao = new FabricanteDAO();

    public void insertarFabricante(Fabricante fabricante) throws Exception {
        fabricanteDao.insertarFabricante(fabricante);
    }
}
