/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author rczgr
 */
public class Curso {

    private String name;
    private int hoursPerDay;
    private int daysPerWeek;
    private Shift shift; //  turno
    private int pricePerHour;
    private String[] students = new String[5];

    public Curso() {
    }

    public Curso(String name, int hoursPerDay, int daysPerWeek, Shift shift, int pricePerHour, String[] student) {
        this.name = name;
        this.hoursPerDay = hoursPerDay;
        this.daysPerWeek = daysPerWeek;
        this.shift = shift;
        this.pricePerHour = pricePerHour;
        this.students = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

}
