/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Ej12_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().
         */
        Scanner scanner = new Scanner(System.in);

        int countCorrect = 0, countIncorrect = 0;
        boolean exit = false;

        
        String userInput, firstChar, lastChar;
        int inputLength;

        while (!exit) {
            System.out.println("Send a message for a RS232 device:");
            userInput = scanner.nextLine();
            inputLength = userInput.length();
            firstChar = userInput.substring(0, 1);
            lastChar = userInput.substring(inputLength - 1);

            if (userInput.equals("&&&&&")) {
                exit = true;
                break;
            }

            if (inputLength > 5) {
                System.out.println("* ERROR: Input max length is 5");
                // this shouldn't be count as incorrect, as it exceed 5 chars
                continue;
            }

            if (firstChar.equals("X") && lastChar.equals("O")) {
                countCorrect++;
                System.out.println("* INFO: Correct format");
            } else {
                countIncorrect++;
                System.out.println("* INFO: Incorrect format");

            }
        }

        System.out.println("* RESULT: Correct inputs: " + countCorrect);
        System.out.println("* RESULT: Incorrect inputs: " + countIncorrect);

    }

}
