/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej06;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class CoffeMakerService {

    Scanner scanner = new Scanner(System.in);

    public void fill(CoffeMaker coffeMaker) {
        coffeMaker.fill();
        System.out.println("Your coffe maker has been filled. Current capacity: " + coffeMaker.getCurrentCapacity());
    }

    public void empty(CoffeMaker coffeMaker) {
        coffeMaker.empty();
        System.out.println("Your coffe maker has been emptied. Current capacity: " + coffeMaker.getCurrentCapacity());

    }

    public void serveCup(CoffeMaker coffeMaker) {
        System.out.print("Enter the amount of coffe to serve: ");
        coffeMaker.serve(scanner.nextInt());
        System.out.println("Current capacity: " + coffeMaker.getCurrentCapacity());
    }

    public void addCoffe(CoffeMaker coffeMaker) {
        System.out.print("Enter the amount to add coffe: ");
        int amount = scanner.nextInt();
        if (coffeMaker.getCurrentCapacity() + amount > coffeMaker.getMaxCapacity()) {
            coffeMaker.fill();
            System.out.println("Coffe maker is full. Can't exceed max capacity.");
            return;
        }
        coffeMaker.add(amount);
        System.out.println("Coffe added to the coffe maker. Current capacity: " + coffeMaker.getCurrentCapacity());

    }

}
