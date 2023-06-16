/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day (number): ");
        int day = sc.nextInt();
        System.out.print("Enter the month (number): ");
        int month = sc.nextInt();
        System.out.print("Enter the year (number): ");
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(date, currentDate);
        int yearsDiff = period.getYears();

        System.out.println("Year difference: " + yearsDiff);

    }

//    public static void usingOldDate(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the day (number): ");
//        int day = sc.nextInt();
//        System.out.print("Enter the month (number): ");
//        int month = sc.nextInt() - 1;
//        System.out.print("Enter the year (number): ");
//        int year = sc.nextInt() - 1900;
//
//        Date date = new Date(year, month, day);
//        Date currentDate = new Date();
//
//        long timeDiff = Math.abs(currentDate.getTime() - date.getTime());
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(timeDiff);
//        int yearsDiff = calendar.get(Calendar.YEAR) - 1970;
//
//        System.out.println("Year difference: " + yearsDiff);
//
//    }

}
