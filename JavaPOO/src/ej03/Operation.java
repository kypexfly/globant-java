/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej03;

/**
 *
 * @author rczgr
 */
public class Operation {

    private double number1;
    private double number2;

    public Operation() {
    }

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double sum() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    //   Revisar: ¿Por qué debe dar error multiplicar por 0?
    public double multiply() {
        if (number2 == 0) {
            System.out.println("Error: Multiplicación por 0.");
            return 0;
        }
        return number1 * number2;
    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: División por 0.");
            return 0;
        }
        return number1 / number2;
    }

}
