/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.util.Arrays;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso = cs.createCourse();

        System.out.println("Students: " + Arrays.toString(curso.getStudents()));

        System.out.println("Weekly gain: " + cs.calculateWeeklyGain(curso));

    }

}
