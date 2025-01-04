package Exercises.ApplicationSeven.Application;

import Exercises.ApplicationSeven.Entities.AccountSeven;
import Exercises.ApplicationSeven.Exceptions.DomainExceptionSeven;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try {
            System.out.println("**** Enter account data ****");
            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Account Holder: ");
            String accountHolder = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double accountInitialBalance = scanner.nextDouble();
            System.out.print("Account withdraw limit: ");
            double accountWithdrawLimit = scanner.nextDouble();

            AccountSeven accountSeven = new AccountSeven(accountNumber, accountHolder,
                    accountInitialBalance, accountWithdrawLimit);
            System.out.println(accountSeven.getHolder() + " U$ " + accountSeven.getBalance());

            System.out.print("How much do you want to withdraw: U$ ");
            double withdrawAmmount = scanner.nextDouble();

            accountSeven.withdraw(withdrawAmmount);

            System.out.println("New Balance: U$ " + accountSeven.getBalance());

        }catch (InputMismatchException e){
            System.out.println("Invalid character for this field.");
        }
        catch (DomainExceptionSeven e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error. :( ");
        }
    }
}
