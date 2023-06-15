/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rczgr
 */
public class Ahorcado {

    private char[] palabra;
    private int nLetrasEncontradas;
    private List<Character> letrasEncontradas = new ArrayList<Character>();
    private int maxNumJugadas;

    public Ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getnLetrasEncontradas() {
        return nLetrasEncontradas;
    }

    public void setnLetrasEncontradas(int nLetrasEncontradas) {
        this.nLetrasEncontradas = nLetrasEncontradas;
    }

    public List<Character> getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(List<Character> letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaxNumJugadas() {
        return maxNumJugadas;
    }

    public void setMaxNumJugadas(int maxNumJugadas) {
        this.maxNumJugadas = maxNumJugadas;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean estaPresente = false;
        boolean seEncontroAnteriormente = false;

        for (char ch : palabra) {
            estaPresente = letra == ch;
        }

        for (Character ch : letrasEncontradas) {
            if (ch.charValue() == letra) {
                seEncontroAnteriormente = true;
            }
        }

        if (!seEncontroAnteriormente && estaPresente) {
            letrasEncontradas.add(letra);
        }

        if (estaPresente) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }

        return seEncontroAnteriormente;
    }

    public boolean encontradas(char letra) {

        boolean seEncontroAnteriormente = buscar(letra);
        for (char ch : palabra) {
            if (ch == letra && !seEncontroAnteriormente) {
                nLetrasEncontradas++;
            }
        }

        System.out.println(String.format(
                "Número de letras (encontradas, faltantes): (%d,%d)",
                nLetrasEncontradas, palabra.length - nLetrasEncontradas)
        );

        maxNumJugadas--;

        return seEncontroAnteriormente;

    }

    public void intentos() {
        if (maxNumJugadas > 0) {
            System.out.println("Mensaje: Número de oportunidades restantes: " + maxNumJugadas);
        } else {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
    }

}
