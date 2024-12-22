package Exercicios;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int num = 0;


        while (true) {
            System.out.println("Digite numeros para somar:");
            num = scan.nextInt();
            if (num != 0) {
                soma += num;
            }
            else {break;}
        }
        System.out.println(soma);
        scan.close();
    }
}
