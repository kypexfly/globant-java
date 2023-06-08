/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej06;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoffeMaker coffeMaker = new CoffeMaker(100, 50);
        System.out.println(coffeMaker.toString());;

        CoffeMakerService coffeMakerService = new CoffeMakerService();

        coffeMakerService.fill(coffeMaker);
        coffeMakerService.empty(coffeMaker);
        coffeMakerService.addCoffe(coffeMaker);
        coffeMakerService.serveCup(coffeMaker);

    }

}
