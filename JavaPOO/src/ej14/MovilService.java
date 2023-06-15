/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class MovilService {

    Scanner sc = new Scanner(System.in);

    public void ingresarCodigo(Movil movil) {
        int[] codigo = movil.getCodigo();

        for (int i = 0; i < codigo.length; i++) {
            System.out.print("Code Number " + (i + 1) + ": ");
            codigo[i] = sc.nextInt();
        }
    }

    public Movil cargarCelular() {
        Movil movil = new Movil();

        System.out.print("Ingrese la marca: ");
        movil.setMarca(sc.nextLine());

        System.out.print("Ingrese el precio: ");
        movil.setPrecio(sc.nextDouble());

        sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        movil.setModelo(sc.nextLine());

        System.out.print("Ingrese la cantidad de memoria RAM: ");
        movil.setMemoriaRam(sc.nextInt());

        System.out.print("Ingrese el almacenamiento: ");
        movil.setAlmacenamiento(sc.nextInt());

        return movil;

    }
}
