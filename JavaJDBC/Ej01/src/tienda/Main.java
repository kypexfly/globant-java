/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.entidades.Fabricante;
import tienda.services.FabricanteService;
import tienda.services.ProductoService;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;

        ProductoService productoServicio = new ProductoService();
        FabricanteService fabricanteServicio = new FabricanteService();

        while (continuar) {
            System.out.println("1. Lista el nombre de todos los productos");
            System.out.println("2. Lista los nombres y los precios de todos los productos");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("4. Buscar y listar todos los Portátiles");
            System.out.println("5. Listar el nombre y el precio del producto más barato");
            System.out.println("6. Ingresar un producto a la base de datos");
            System.out.println("7. Ingresar un fabricante a la base de datos");
            System.out.println("8. Editar un producto");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        List<Producto> productos = productoServicio.obtenerTodosLosProductos();
                        for (Producto producto : productos) {
                            System.out.println(producto.getNombre());
                        }
                        break;
                    case 2:
                        // Llamar al método correspondiente
                        break;
                    case 3:
                        // Llamar al método correspondiente
                        break;
                    case 4:
                        // Llamar al método correspondiente
                        break;
                    case 5:
                        // Llamar al método correspondiente
                        break;
                    case 6:
                        // Llamar al método correspondiente
                        break;
                    case 7:
                        System.out.println("Ingrese el nombre del fabricante:");
                        String nombreFabricante = scanner.next();
                        Fabricante fabricante = new Fabricante();
                        fabricante.setNombre(nombreFabricante);
                        fabricanteServicio.insertarFabricante(fabricante);
                        System.out.println("Fabricante ingresado exitosamente.");
                        break;
                    case 8:
                        // Llamar al método correspondiente
                        break;
                    case 9:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción invalida. Por favor, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }

        scanner.close();
    }

}
