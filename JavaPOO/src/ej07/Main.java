/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej07;

/**
 *
 * @author rczgr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        // Person person = personService.create();

        Person person1 = new Person(
                "Ricardo",
                23,
                Gender.MALE,
                65,
                1.80);

        Person person2 = new Person(
                "Miguel",
                10,
                Gender.MALE,
                30,
                1.40);

        Person person3 = new Person(
                "Emilia",
                40,
                Gender.FEMALE,
                60,
                1.50);

        Person person4 = new Person(
                "Abecedario",
                5,
                Gender.OTHER,
                20,
                0.60);

        Person[] people = {person1, person2, person3, person4};
        int[] peopleIMC = new int[4];
        boolean[] peopleAdult = new boolean[4];

        int index = 0;

        for (Person person : people) {
            personService.getDetails(person);
            int personIMC = personService.calculateIMC(person);
            peopleIMC[index] = personIMC;
            switch (personIMC) {
                case -1:
                    System.out.println("Not ideal weight");
                    break;
                case 0:
                    System.out.println("Ideal weight");
                    break;
                case 1:
                    System.out.println("Overweight");
                    break;
            }

            boolean isPersonAdult = personService.isAdult(person);
            peopleAdult[index] = isPersonAdult;
            System.out.println("Is adult?: "
                    + isPersonAdult);
            System.out.println("----------------------------");
            index++;
        }

        // Show percentages
        System.out.println("******************");
        System.out.println("STATISTICS");
        System.out.println("******************");

        // IMC statistics
        System.out.println("IMC statistics");
        int[] imcCount = {0, 0, 0};

        for (int imc : peopleIMC) {
            switch (imc) {
                case -1:
                    imcCount[0]++;
                    break;
                case 0:
                    imcCount[1]++;
                    break;
                case 1:
                    imcCount[2]++;
                    break;
            }
        }

        System.out.println((float) imcCount[0] / people.length * 100
                + "% Not ideal weight");
        System.out.println((float) imcCount[1] / people.length * 100
                + "% Ideal weight");
        System.out.println((float) imcCount[2] / people.length * 100
                + "% Overweight");

        // Adults statistics
        System.out.println("Adults statistics");

        int adultCount = 0;
        for (boolean isAdult : peopleAdult) {
            if (isAdult) {
                adultCount++;
            }
        };
        System.out.println(
                (float) adultCount / people.length * 100
                + "% Adults");
        System.out.println(
                (float) (people.length - adultCount) / people.length * 100
                + "% Minors");

    }
}
