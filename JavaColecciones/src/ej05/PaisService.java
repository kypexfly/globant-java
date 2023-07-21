/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class PaisService {

    private HashSet<String> paises;
    private Scanner sc;

    public PaisService() {
        this.paises = new HashSet(Arrays.asList("Ecuador", "Venezuela", "Colombia", "Peru", "Brazil", "Argentina", "Uruguay"));
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPaises() {

        boolean continuar = true;
        while (continuar) {

            System.out.println("Nombre del pais: ");
            paises.add(sc.next());

            System.out.println("¿Continuar con otro país? (s/n)");
            String input = sc.next();

            if (input.toLowerCase().equals("n")) {
                continuar = false;
            }
        }

    }

    public void mostrarPaises() {
        System.out.println("MOSTRAR PAISES");

        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenados() {

        ArrayList<String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);

        System.out.println("MOSTRAR PAISES ORDENADOS");
        for (String pais : listaPaises) {
            System.out.println(pais);
        }
    }

    public void eliminarPais() {
        System.out.println("Ingrese el país a eliminar: ");
        String input = sc.next();

        if (paises.contains(input)) {
            paises.remove(input);
            mostrarPaises();
        } else {
            System.out.println("El país " + input + " no se encuentra.");
        }

    }

    @Override
    public String toString() {
        return "PaisService{" + "paises=" + paises + '}';
    }

}
