package Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Var n:");
        int n = scan.nextInt();

        double [] vector = new double[n];
        double soma = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = scan.nextDouble();
            soma += vector[i];

        }
        double media = soma/vector.length;
        System.out.println("Média = "+ media);

    }
}
