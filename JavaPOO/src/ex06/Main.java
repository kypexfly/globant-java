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
        // FIX: El numero de letras encontradas y faltantes no se encuentra
        // correctamente implementado.

        AhorcadoService as = new AhorcadoService();
        Ahorcado ahorcado = as.crearJuego();
        as.juego(ahorcado);
    }

}
