package Exercises.ApplicationTen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramTen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        User userAux = new User();


        System.out.println("Instructor Alex");
        System.out.println();

        System.out.print("How many students for course A: ");
        int courseA = scan.nextInt();
        userAux.scanList(courseA);

        System.out.print("How many students for course B: ");
        int courseB = scan.nextInt();
        userAux.scanList(courseB);

        System.out.print("How many students for course C: ");
        int courseC = scan.nextInt();
        userAux.scanList(courseC);

        System.out.println(userAux);


    }
}
