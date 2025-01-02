package Anotacoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Anotacoes21 {
    public static void main(String[] args) {


        // testando exceptions
        try {
            Scanner scan = new Scanner(System.in);

            String[] vector = scan.nextLine().split(" ");
            int position = scan.nextInt();

            System.out.println("Vetor na na posição " + position + " == " + vector[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e){
            System.out.println("Input error.");
        }
        System.out.println("Fim do programa.");
    }
}
