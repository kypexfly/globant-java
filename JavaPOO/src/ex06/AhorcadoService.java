/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class AhorcadoService {

    private static final Scanner sc = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Crear juego: Ahorcado");

        System.out.print("Ingrese la palabra: ");
        ahorcado.setPalabra(sc.nextLine().toCharArray());

        System.out.print("Ingrese la cantidad de jugadas máxima: ");
        ahorcado.setMaxNumJugadas(sc.nextInt());

        ahorcado.setnLetrasEncontradas(0);
        return ahorcado;
    }

    public void juego(Ahorcado ahorcado) {
        char letra;

        while ((ahorcado.getMaxNumJugadas() > 0)) {
            System.out.println("Ingrese una letra: ");
            letra = sc.next().toLowerCase().charAt(0);

            ahorcado.longitud();
            ahorcado.encontradas(letra);
            ahorcado.intentos();

            System.out.println("--------------------------");

            if ((ahorcado.getPalabra().length - ahorcado.getnLetrasEncontradas()) == 0) {
                System.out.println("Se han ingreado todas las letras de la palabra.");
                System.out.println("Adivine la palabra!");
                break;
            }
        }

    }

}
