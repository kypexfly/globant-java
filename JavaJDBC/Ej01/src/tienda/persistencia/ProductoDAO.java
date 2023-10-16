/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

/**
 *
 * @author rczgr
 */
public class ProductoDAO extends DAO {

    public List<Producto> obtenerTodosLosProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            queryDb(sql);

            List<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt("codigo"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(resultado.getDouble("precio"));
                producto.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                productos.add(producto);
            }
            return productos;
        } finally {
            disconnectDb();
        }
    }
}
