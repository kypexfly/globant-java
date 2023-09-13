/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02;

import java.util.ArrayList;

/**
 *
 * @author rczgr
 */
public class ArrayEjemplo {

    private String[] array;

    public ArrayEjemplo(int tamano) {
        this.array = new String[tamano];
    }

    public String getElemento(int indice) {
        if (indice >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera del rango.");
        }

        return array[indice];
    }

}
