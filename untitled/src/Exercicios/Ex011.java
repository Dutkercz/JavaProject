package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you will enter:");
        int numbersQuantity = scan.nextInt();

        int [] vect = new int[numbersQuantity];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter %dº number > ", i+1);
            vect[i] = scan.nextInt();
        }

        System.out.println("Negative Numbers: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0){
                System.out.print(vect[i] + " ");
            }
        }
    }
}
