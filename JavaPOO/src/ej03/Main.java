/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej03;

import ej03.OperationService;
import ej03.Operation;

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
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        OperationService operationService = new OperationService();
        Operation operation = operationService.createOperation();

        System.out.println("Sum: " + operation.sum());
        System.out.println("Subtract: " + operation.subtract());
        System.out.println("Multiply: " + operation.multiply());
        System.out.println("Divide: " + operation.divide());

    }

}
