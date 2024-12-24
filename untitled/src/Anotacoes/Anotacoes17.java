package Anotacoes;

import java.util.Arrays;
import java.util.Scanner;

public class Anotacoes17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a propiedade da matriz");
        int num = scanner.nextInt();
        int [][] vect = new int[num][num];
        int contNegativeNumbers = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Dite um numero para a posição: " + i +" x " + j);
                vect[i][j] = scanner.nextInt();
                if (vect[i][j] < 0){
                    contNegativeNumbers +=1;
                }
            }
        }

        System.out.println("Diagonal principal");
        for (int i = 0; i < vect.length; i++) {
                System.out.println(vect[i][i] + " ");
        }

        System.out.println("Negative Numbers: "+ contNegativeNumbers);
    }
}
