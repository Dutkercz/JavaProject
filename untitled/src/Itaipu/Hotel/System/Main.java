package Itaipu.Hotel.System;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Itaipu System");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime startProgramDate = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);

        System.out.println("----- " + dateFormatter.format(startProgramDate) +  "-----");
        System.out.println();
        while (true){
            System.out.println("1 - Hospedagem" +
                    "\n2 - Emitir nota" +
                    "\n3 - Reserva" +
                    "\n4 - Sair");
            int chose = scan.nextInt();
            scan.nextLine();

            if (chose == 1){
                try {
                    System.out.println("**** Hospedagem ****");

                    System.out.print("Nome: ");
                    String name = scan.nextLine().strip();
                    System.out.print("Cidade: ");
                    String city = scan.nextLine().strip();
                    System.out.print("Telefone: ");
                    String phoneNumber = scan.nextLine().strip().replace("-", "");
                    System.out.print("Cpf: ");
                    CPF cpf = new CPF();
                    while (true) {
                        String registerNumber = scan.nextLine();
                        cpf.validarCPF(registerNumber);

                        if (cpf.validarCPF(registerNumber)) {
                            System.out.println("CPF Válido!");
                            cpf.setCpf(registerNumber);
                            break;
                        } else {
                            System.out.println("CPF Inválido!");
                            System.out.println("Digite seu cpf novamente.");
                        }
                    }
                    System.out.print("e-mail: ");
                    String email = scan.nextLine();

                    Guest guest = new Guest(name, city, phoneNumber, cpf, email);
                    System.out.println(guest);
                    System.out.println("========================");

                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida. " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Algo errado não esta certo. " + e.getMessage());
                }
            }
            else if (chose == 2) {
                try {
                    System.out.println("**** EMITIR NOTA ****");
                    System.out.println("Para qual apartamento deseja emitir nota: ");
                    int apto = scan.nextInt();

                } catch (Exception e) {
                    System.out.println("Algo deu muito errado. " + e.getMessage());
                }
            } else if (chose == 3) {
                System.out.println("A fazer");

            } else if (chose == 4) {
                System.out.println("Finalizando o Programa");
                break;
            }
            else {
                System.out.println("=======================");
                System.out.println("    Opção invalida!");
                System.out.println("=======================");
            }

        }
    }
}