/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado el método metodoA de la clase A, indique:
        // a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        // b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        // class A {
        // public void metodoA() {
        //  sentencia_a1
        //  sentencia_a2
        //  try {
        //      sentencia_a3
        //      sentencia_a4
        //  } catch (MioException e){
        //      sentencia_a6
        //  }
        //  sentencia_a5
        //}

        // RESPUESTAS:
        // a) a1, a2, a3 (aquí ocurre la excepción), a6 (entra en el catch), a5
        // b) a1, a2, a3, a4, a5
    }

}
