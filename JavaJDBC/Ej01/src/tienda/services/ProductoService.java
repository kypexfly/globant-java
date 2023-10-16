/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.services;

import java.util.Collection;
import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author rczgr
 */
public class ProductoService {

    private ProductoDAO productoDao = new ProductoDAO();

    public List<Producto> obtenerTodosLosProductos() throws Exception {
        return productoDao.obtenerTodosLosProductos();
    }

}
