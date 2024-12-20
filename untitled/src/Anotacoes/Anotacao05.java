package Anotacoes;

import java.util.Scanner;

public class Anotacao05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a hora:");
        var hora = scanner.nextInt();

        if (hora > 12 && hora < 18){
            System.out.println("Boa tarde");
        }else if (hora <= 12) {
            System.out.println("Bom dia");
        }else if (hora >= 18) {
            System.out.println("Boa noite");
        }
    }
}
