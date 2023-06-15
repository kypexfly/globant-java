/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class CursoService {

    Scanner sc = new Scanner(System.in);

    public void loadStudents(Curso curso) {
        String[] students = curso.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student #" + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }
    }

    public Curso createCourse() {
        Curso course = new Curso();

        System.out.print("Enter the course name: ");
        course.setName(sc.nextLine());

        System.out.print("Enter the shift (morning or afternoon): ");
        course.setShift(Shift.valueOf(sc.nextLine().toUpperCase()));

        System.out.print("Enter the number of days per week: ");
        course.setDaysPerWeek(sc.nextInt());

        System.out.print("Enter the number of hours per day: ");
        course.setHoursPerDay(sc.nextInt());

        System.out.print("Enter the price per hour: ");
        course.setPricePerHour(sc.nextInt());

        sc.nextLine();

        loadStudents(course);

        return course;
    }

    public double calculateWeeklyGain(Curso course) {
        return course.getHoursPerDay()
                * course.getPricePerHour()
                * course.getStudents().length
                * course.getDaysPerWeek();
    }

}
