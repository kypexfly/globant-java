/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person person = ps.createPerson();

        System.out.println("Less than 30?: " + ps.lessThan(person, 30));
        ps.showAge(person);
        ps.showPerson(person);

    }

}
