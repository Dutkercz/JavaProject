package Exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gasolina = 0;
        int alcool = 0;
        var diesel = 0;
        var escolha = 0;

        System.out.println("Pesquisa de preferencia:");
        System.out.println("Qual seu combustivel preferido:\n" +
                " 1 - Gasolina\n" +
                " 2 - Alcool\n" +
                " 3 - Diesel\n" +
                " 4 - Sair");

        while (true){
            System.out.print("Adicionar voto - Ou 4 para sair: ");
            escolha = scan.nextInt();
            if (escolha == 1){
                gasolina += 1;
            } else if (escolha == 2) {
                alcool += 1;
            } else if (escolha == 3) {
                diesel += 1;
            } else if (escolha == 4) {
                System.out.println();
                System.out.println("Muito Obrigado");
                System.out.printf("Total de votos:\n Gasolina: %d\n Alcool: %d\n " +
                        "Diesel: %d", gasolina, alcool, diesel );
                break;
            }else {
                System.out.println("Opção inválida.");
            }
        }
        System.out.println();

        var senha = 2002;
        var inputSenha = 0;

        while (senha != inputSenha){
            System.out.println("Digite sua senha: ");
            inputSenha = scan.nextInt();
            String msg = (inputSenha != senha) ? "Senha incorreta.\n" : "Senha correta. Acesso liberado\n";
            System.out.println(msg);
        }
    }
}
