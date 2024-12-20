package Anotacoes;

import java.util.Scanner;

public class Anotacao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        var idade = scan.nextInt();
        System.out.println("Sexo: ");
        char sexo = scan.next().toUpperCase().charAt(0);

        System.out.printf("Seu nome é %s, você tem %d e seu sexo é %s", nome, idade, sexo);
        System.out.println();

        int x;
        String s1;
        String s2;
        String s3;

        x = scan.nextInt();
        scan.nextLine(); //limpa o buffer, evitando que a proxima variavel, receba apenas um "ENTER VAZIO"
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
