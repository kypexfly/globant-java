/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        //  un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        //  está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        //  ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        //  la lista ordenada.

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

        System.out.println("");
        System.out.print("Write a breed to remove: ");
        String breedToRemove = sc.next();

        Iterator<String> it = dogBreeds.iterator();
        boolean isFound = false;
        while (it.hasNext()) {
            if (it.next().equals(breedToRemove)) {
                it.remove();
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println(
                    "Breed not found. Can't remove " + breedToRemove
            );
        }

        Collections.sort(dogBreeds);
        System.out.println(dogBreeds);

        // Show in reverse order
        // Collections.sort(dogBreeds, Collections.reverseOrder());
    }
}
