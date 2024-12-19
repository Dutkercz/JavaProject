package Anotacoes;

import java.util.Scanner;

public class Anotacoes07 {
    public static void main(String[] args) {

        //Estrutura de repetição FOR.
        // ex. for (inicio ; condição ; incremento)

        Scanner scan = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite quantos numeros quer ler");
        var totalDeNumeros = scan.nextInt();

        for (int i = 0; i < totalDeNumeros ; i++) {
            System.out.println("Qual numero quer somar: ");
            int x = scan.nextInt();
            soma += x;
        }
        System.out.println(soma);
    }
}
