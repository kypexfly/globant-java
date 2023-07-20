/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_teorica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author rczgr
 */
public class JavaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();

        nombres.add("Hola");
        System.out.println(nombres.size());
        nombres.remove("Hola");
        System.out.println(nombres.size());

        // Deteccion de errores pag 6
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> arbol = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();

        // Ejercicio colecciones pag 7
        ArrayList<Integer> numerosA = new ArrayList();
        numerosA.add(1);
        numerosA.add(2);
        numerosA.add(3);
        numerosA.add(4);
        numerosA.add(5);

        HashSet<Integer> numerosB = new HashSet();
        numerosB.add(1);
        numerosB.add(2);
        numerosB.add(3);
        numerosB.add(4);
        numerosB.add(5);

        HashMap<Integer, String> numerosC = new HashMap();
        numerosC.put(0, "10");
        numerosC.put(1, "20");
        numerosC.put(2, "30");
        numerosC.put(3, "40");
        numerosC.put(4, "50");

        // Eliminar elementos pag 8
        numerosA.remove(1);
        numerosB.remove(1);
        numerosC.remove(0);

        // Detección de errores pag 10
        ArrayList<String> personas2 = new ArrayList();
        String n1 = "Albus";
        String n2 = "Severus";
        personas2.add(n1);
        personas2.add( n2);

    }

}
