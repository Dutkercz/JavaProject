package Exercises;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        //Posição de X
        // Q1: X < 0 && Y > 0
        // Q2: X > 0 && Y > 0
        // Q3: X < 0 && Y < 0
        // Q4: X > 0 && Y < 0
        // Origem: X == 0 && Y == 0

        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();

        if (X == 0 && Y ==0){
            System.out.println("Origem");
        }
        else if (X < 0 && Y > 0) {
            System.out.println("Q1");
        }
        else if (X > 0 && Y > 0) {
             System.out.println("Q2");
        }
        else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
