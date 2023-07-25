/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class ProductoService {

    private Scanner sc;
    private HashMap<String, Double> productos;

    public ProductoService() {
        this.productos = new HashMap<>();
        productos.put("Computadora", 1000.0);
        productos.put("Impresora", 300.0);
        productos.put("Monitor", 400.0);

        this.sc = new Scanner(System.in).useDelimiter("\n");

    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(
                    "Producto: " + entry.getKey()
                    + " \t Precio: $" + entry.getValue()
            );
        }
    }

    public void agregarProducto(String nombre, Double precio) {
        if (productos.containsKey(nombre)) {
            System.out.println("No se puedo agregar, el producto ya existe.");
        } else {
            productos.put(nombre, precio);
            System.out.println("Producto agregado --> " + nombre + " $" + precio);
        }

    }

    public void modificarPrecio(String nombre, Double precio) {
        if (productos.containsKey(nombre)) {
            System.out.println(
                    nombre
                    + " cambió de precio de: $" + productos.get(nombre)
                    + "a $" + precio
            );
            productos.put(nombre, precio);
        } else {
            System.out.println(
                    "No se encontró el producto. "
                    + "No se puedo modificar el precio."
            );
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println(nombre + " ha sido eliminado exitosamente.");
        } else {
            System.out.println(nombre + " no se ha encontrado. No se pudo eliminar.");
        }
    }

    public void menu() {

        boolean salir = false;
        int option;

        while (!salir) {
            System.out.println("");
            System.out.println("**** MENU DE PRODUCTOS ****");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Agregar un nuevo");
            System.out.println("3. Modificar el precio de un producto");
            System.out.println("4. Eliminar un producto");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elija una opción:");

            option = sc.nextInt();
            String nombre;
            double precio;

            switch (option) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    System.out.println("Nombre del producto: ");
                    nombre = sc.next();
                    System.out.println("Precio del producto: ");
                    precio = sc.nextDouble();
                    agregarProducto(nombre, precio);
                    break;
                case 3:
                    System.out.println("Modificar precio del producto: ");
                    System.out.println("Nombre del producto a modificar: ");
                    nombre = sc.next();
                    System.out.println("Nuevo precio del producto: ");
                    precio = sc.nextDouble();
                    modificarPrecio(nombre, precio);
                    break;
                case 4:
                    System.out.println("Eliminar un producto: ");
                    System.out.println("Nombre del producto a eliminar:");
                    nombre = sc.next();
                    eliminarProducto(nombre);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Elija una opción válida...");
                    break;
            }
        }

    }

}
