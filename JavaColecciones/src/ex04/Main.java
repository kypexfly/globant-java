/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
        // pd: se agregan de manera automática para no tener que ingresarlos manualmente
        HashMap<Integer, String> postales = new HashMap();
        postales.put(62413, "Annapolis");
        postales.put(62347, "Adams");
        postales.put(62611, "Arenzville");
        postales.put(62612, "Ashland");
        postales.put(62246, "Ayers");
        postales.put(42715, "Breeding");
        postales.put(74931, "Bunch");
        postales.put(73014, "Calumet");
        postales.put(73022, "Concho");
        postales.put(74048, "Coodys Bluff");

        PostalService ps = new PostalService(postales);

        Integer codigo;
        String ciudad;

        // Muestra por pantalla los datos introducidos
        ps.mostrarPostales();

        // Pide un código postal y muestra la ciudad asociada 
        // si existe sino avisa al usuario.
        System.out.println("Ingrese el codigo postal a buscar:");
        codigo = sc.nextInt();
        ps.buscarPorCodigo(codigo);

        // Muestra por pantalla los datos
        ps.mostrarPostales();

        // Agregar una ciudad con su código postal correspondiente más al HashMap.
        System.out.println("*** Añadir un nuevo codigo postal");
        System.out.println("Ingrese un codigo postal:");
        codigo = sc.nextInt();
        System.out.println("Ingrese la ciudad asociada:");
        ciudad = sc.next();
        ps.agregarPostal(codigo, ciudad);

        // Elimina 3 ciudades existentes dentro del HashMap, 
        // que pida el usuario.
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la ciudad a eliminar:");
            ciudad = sc.next();
            ps.eliminarPorCiudad(ciudad);
        }

        // Muestra por pantalla los datos
        ps.mostrarPostales();

    }

}
