/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Indique que se mostrará por pantalla cuando se ejecute cada clase:
        // * Clase Uno, Dos y Tres.

        // RESPUESTAS:
        // Clase Uno:
        // Valor final del try: 44
        // Valor final del finally: 45
        // Valor antes del return: 46
        // 46
        // Clase Dos:
        // Valor final del catch: 43
        // Valor final del finally: 44
        // Valor antes del return: 45
        // 45
        // Clase Tres:
        // Valor final del finally:2
        
        // Excepcion en metodo ( ) 
        // java.lang.NumberFormatException: For input string: "W"
        // at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // at java.lang.Integer.parseInt(Integer.java:580)
        // at java.lang.Integer.parseInt(Integer.java:615)
        // at ex08.Tres.metodo(Tres.java:21)
        // at ex08.Tres.main(Tres.java:34)
    }

}
