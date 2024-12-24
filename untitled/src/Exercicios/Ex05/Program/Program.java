package Exercicios.Ex05.Program;

import Exercicios.Ex05.Methods.Methods;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos estudantes deseja registrar:");
        int numeroDeEstudantes = scan.nextInt();

        Methods[] cadastroDeEstudante = new Methods[10];

        for (int i = 0; i < numeroDeEstudantes; i++) {
            scan.nextLine();
            System.out.print("Nome do estudante: ");
            String nome= scan.nextLine();
            System.out.print("e-mail: ");
            String email = scan.nextLine();
            System.out.print("Qual apto deseja ocupar? ");
            int aptoEscolhido = scan.nextInt();
            cadastroDeEstudante[aptoEscolhido] = new Methods(nome, email, aptoEscolhido);
        }
        for (int i = 0; i < cadastroDeEstudante.length; i++) {
            if (cadastroDeEstudante[i] != null) {
                System.out.println(cadastroDeEstudante[i]);
            }else {
                System.out.println();
                System.out.println("Apto " + i + " vazio");
            }

        }
    }
}
