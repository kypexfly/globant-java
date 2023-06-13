/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej08;

/**
 *
 * @author rczgr
 */
public class Cadena {

    private String s;
    private int length;

    public Cadena() {
    }

    public Cadena(String sentence) {
        this.s = sentence;
        this.length = sentence.length();
    }

    public String getSentence() {
        return s;
    }

    public void setSentence(String s) {
        this.s = s;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void mostrarVocales() {
        int countVocals = 0;
        char[] chars = s.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (ch == 'a'
                    || ch == 'e'
                    || ch == 'i'
                    || ch == 'o'
                    || ch == 'u') {
                countVocals++;
            }
        }
        System.out.println("Cantidad de vocales: " + countVocals);
    }

    public void invertirFrase() {
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i]);
            }
        }
    }

    public void vecesRepetido(char letter) {
        char[] chars = s.toCharArray();
        int countRepeated = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                countRepeated++;
            }
        }
        System.out.println("El carácter '" + letter
                + "' se repite " + countRepeated + " veces.");

    }

    // 0 is equal length, 1 is greater and -1 is lesser
    public int compararLongitud(String sentence) {
        if (this.s.length() > sentence.length()) {
            return 1;
        };

        if (this.s.length() < sentence.length()) {
            return -1;
        };

        return 0;

    }

    public void unirFrases(String sentence) {
        System.out.println(this.s + " " + sentence);
    }

    public void reemplazar(char letter) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = letter;
            }
            if (i != chars.length - 1) {
                System.out.print(chars[i]);
            } else {
                System.out.println(chars[i]);
            }
        }

    }

    public boolean contiene(char letter) {
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (ch == letter) {
                return true;
            }
        }

        return false;
    }

}
