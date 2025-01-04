package Exercises.Ex04.Program;

import Exercises.Ex04.Pessoa.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Pogram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("How many persons will be registered");
        System.out.print(">> ");
        int numberOfPersons = scan.nextInt();

        Pessoa [] persons = new Pessoa[numberOfPersons];
        double averageEight = 0;
        int ageUnder16 = 0;
        ArrayList<String> persongsBelow16 = new ArrayList<>();


        for (int i = 0; i < persons.length; i++) {
            scan.nextLine();
            System.out.print("Enter name data: ");
            String name = scan.nextLine();
            System.out.print("Enter age data: ");
            int age = scan.nextInt();
            System.out.print("Enter eighth data: ");
            double eighth = scan.nextDouble();
            System.out.println("Data recorded.");
            System.out.println();
            persons[i] = new Pessoa(name, age, eighth);
            averageEight += persons[i].getHeight();

            if (persons[i].getAge() < 16 ){
                ageUnder16 += 1;
                persongsBelow16.add(persons[i].getName());
            }
        }

        ageUnder16 = (100/persons.length) * ageUnder16;
        averageEight /= persons.length;
        System.out.println("People data:\n" + Arrays.toString(persons));
        System.out.println("Average eighth: " + averageEight);
        System.out.println("Percentage of people under 16 year old: " + ageUnder16 + "%");
        System.out.println("And his names: " + persongsBelow16);


    }
}
