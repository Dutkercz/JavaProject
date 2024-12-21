package AplicationTwo.ProgramTwo;

import AplicationTwo.MethodsTwo.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account client = new Account();

        double initialDeposit;

        System.out.println("Enter new account data.");
        System.out.print("\t Name: ");
        String titularName = scan.nextLine();
        System.out.print("\t Account number: ");
        int accountNumber = scan.nextInt();
        System.out.println();
        System.out.print("\tYou want to do an initial deposit:\n 1 - Yes.\n 2 - No.\n >> ");
        int option = scan.nextInt();

        if (option == 1){
            System.out.print("Enter you deposit value: ");
            initialDeposit = scan.nextDouble();

            client = new Account(titularName, accountNumber, initialDeposit);
            System.out.println("===============");
            System.out.println("Success");
            System.out.println("===============");
            System.out.println(client);
            System.out.println("===============");
        } else if (option == 2) {
            client = new Account(titularName, accountNumber);
            System.out.println("===============");
            System.out.println("Success");
            System.out.println("===============");
            System.out.println(client);
            System.out.println("===============");
        }

        while (true) {
            System.out.println();
            System.out.println("What you need");
            System.out.print("\t1 - Withdraw. \n\t2 - Deposit.\n\t3 - Balance.\n\t4 - Exit\n\t>> ");

            int optionWhile = scan.nextInt();

            if (optionWhile == 1) {
                System.out.print("Enter withdraw amount: US$ ");
                double withdrawAmount = scan.nextDouble();
                client.withdraw(withdrawAmount);
                System.out.println("New balance account: " + client.getBalanceAccount());

            } else if (optionWhile == 2) {

            } else if (optionWhile == 3) {

            } else if (optionWhile == 4) {
                break;
            }else {
                System.out.println("Invalid choice!");
            }

        }
    }
}
