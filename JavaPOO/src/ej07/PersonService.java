package ej07;

import java.util.Scanner;

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

    public Person create() {
        Person person = new Person();
        System.out.println("Enter the person's name:");
        person.setName(scanner.next());
        System.out.println("Enter the person's age:");
        person.setAge(scanner.nextInt());
        System.out.println("Enter the person's gender (MALE, FEMALE OR OTHER):");
        String genderInput = scanner.next().toUpperCase();
        person.setGender(Gender.valueOf(genderInput));
        System.out.println("Enter the person's weight (Kg):");
        person.setWeight(scanner.nextInt());
        System.out.println("Enter the person's height (meters):");
        person.setHeight(scanner.nextDouble());

        return person;
    }

    /**
     * Retorna -1 si el peso es menor al ideal. Retorna 0 si el peso es ideal.
     * Retorna 1 si tiene sobrepeso.
     *
     * @param person
     * @return
     */
    public int calculateIMC(Person person) {
        int imc = (int) (person.getWeight() / (Math.pow(person.getHeight(), 2)));
        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }

    public boolean isAdult(Person person) {
        return person.getAge() >= 18;
    }

    public void getDetails(Person person) {
        System.out.println(person.toString());
    }

}
