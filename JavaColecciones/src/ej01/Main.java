/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    public static void main(String[] args) {
//        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//        salir, se mostrará todos los perros guardados en el ArrayList.

        Scanner sc = new Scanner(System.in);
        
        List<String> dogBreeds = new ArrayList();

        boolean exit = false;

        while (!exit) {
            System.out.print("Add a dog breed: ");
            dogBreeds.add(sc.next());

            System.out.println("Continue with new breed? (y/n): ");
            if (sc.next().toLowerCase().equals("n")) {
                exit = true;
                System.out.println("Dog breeds: " + dogBreeds);
            }
        }

    }

}
