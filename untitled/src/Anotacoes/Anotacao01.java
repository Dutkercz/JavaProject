package Anotacoes;

import java.util.Locale;
import java.util.Scanner;

public class Anotacao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US); //muda o padrão pra US, por exemplo a "," vira "."

        System.out.println("Hello World");
        double x = 10.3254;


        System.out.printf("%.2f%n", x);
        System.out.print("Digite sua idade: ");
        int valor = scanner.nextInt();
        System.out.println(valor);




    }
}
