package Exercicios;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero <= 0 ){
            System.out.println("NÃO NEGATIVO");
        } else{
            System.out.println("NEGATIVO");
        }
    }
}
