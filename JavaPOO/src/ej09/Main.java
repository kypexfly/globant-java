/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej09;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica mat = new Matematica();
        mat.setA(Math.random() * 10);
        mat.setB(Math.random() * 10);

        System.out.println("a: " + mat.getA()
                + "\nb: " + mat.getB());

        System.out.println("Valor mayor: " + mat.devolverMayor());
        System.out.println("Mayor elevado al menor: " + mat.calcularPotencia());
        System.out.println("Raiz cuadrada del menor: " + mat.calcularRaiz());

    }

}
