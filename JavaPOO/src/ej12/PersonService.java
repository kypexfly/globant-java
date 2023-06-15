package ej12;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rczgr
 */
public class PersonService {

    Scanner scanner = new Scanner(System.in);

    public Person createPerson() {
        Person person = new Person();
        System.out.println("Enter the name of the person: ");
        person.setName(scanner.next());

        System.out.println("Enter the birthdate of the person: ");
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        System.out.print("Day: ");
        int day = scanner.nextInt();

        person.setBirthdate(LocalDate.of(year, month, day));

        return person;

    }

    public int calculateAge(Person person) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(person.getBirthdate(), currentDate);

        return age.getYears();
    }

    public void showAge(Person person) {
        System.out.println("Age: " + calculateAge(person));
    }

    public boolean lessThan(Person person, int age) {
        return calculateAge(person) < age;
    }

    public void showPerson(Person person) {
        System.out.println(person.toString());
    }

}
