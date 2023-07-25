/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rczgr
 */
public class PostalService {

    private HashMap<Integer, String> postales;

    public PostalService(HashMap postales) {
        this.postales = postales;
    }

    public HashMap getPostales() {
        return postales;
    }

    public void mostrarPostales() {
        for (Map.Entry<Integer, String> entry : postales.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void agregarPostal(Integer codigo, String ciudad) {
        postales.put(codigo, ciudad);
        System.out.println(
                "Postal " + codigo + " " + ciudad
                + " ha sido agregado exitosamente.");
    }

    public void eliminarPorCiudad(String ciudad) {

        Integer claveAEliminar = null;
        for (Map.Entry<Integer, String> entry : postales.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(ciudad)) {
                claveAEliminar = entry.getKey();
            }
        }

        if (claveAEliminar != null) {
            postales.remove(claveAEliminar);
            System.out.println(ciudad + " se ha eliminado exitosamente.");
        } else {
            System.out.println("No se pudo eliminar, ciudad no encontrada.");
        }

    }

    public void buscarPorCodigo(Integer codigo) {
        if (postales.containsKey(codigo)) {
            System.out.println("Ciudad: " + postales.get(codigo));
        } else {
            System.out.println("No se ha encontrado la ciudad.");
        }
    }

}
