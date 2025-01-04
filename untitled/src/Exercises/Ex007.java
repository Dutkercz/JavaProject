package Exercises;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Total de minutos esse mes: ");
        int minutos = scan.nextInt();
        double total = 50;

        if (minutos < 100){
            System.out.printf("O valor a ser pago é: R$ %.2f", total);
        } else {
            total += (2*(minutos-100));
            System.out.printf("O valor total da conta é R$ %.2f ", total);
        }
    }
}
