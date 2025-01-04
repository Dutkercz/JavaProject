package Exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto numeros voce vai digitar: ");
        int quantidadeDeNumeros = scan.nextInt();

        int[] vect = new int[quantidadeDeNumeros];
        int soma = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº numero " , i+1);
            vect[i] = scan.nextInt();
            soma += i;
        }
        System.out.println(Arrays.toString(vect));
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + soma / vect.length);

    }
}
