/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03;

import ej03.Operation;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class OperationService {

    Scanner scanner = new Scanner(System.in);

    public Operation createOperation() {
        Operation operation = new Operation();
        System.out.println("Enter number 1: ");
        operation.setNumber1(scanner.nextDouble());
        System.out.println("Enter number 2: ");
        operation.setNumber2(scanner.nextDouble());
        return operation;
    }
    
}
