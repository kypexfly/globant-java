/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices eq1 = new Raices(1, 2, 1);
        Raices eq2 = new Raices(1, -1, -2);
        Raices eq3 = new Raices(1, -1, -2);

        Raices[] equations = {eq1, eq2, eq3};

        for (Raices eq : equations) {
            System.out.println("**********");
            System.out.println(
                    String.format("%,.0fx^2 + %,.0fx + %,.0f",
                            eq.getA(), eq.getB(), eq.getC())
            );
            eq.calcular();
        }

    }

}
