package ApplicationOne.App;

import ApplicationOne.MethodsOne.Product;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Product product1 = new Product();

        System.out.print("Enter product data.");
        System.out.println();

        System.out.print("\tProduct name: ");
        product1.setProductName(scan.nextLine());

        System.out.print("\tPrice: ");
        product1.setProductPrice(scan.nextDouble());

        System.out.print("\tQuantity: ");
        product1.setProductQuantity(scan.nextInt());
        System.out.println();

        System.out.println("PRODUCT ADDED!");

        while (true) {
            System.out.print("What you need:\n" +
                    " 1 - Remove itens\n" +
                    " 2 - Add itens \n" +
                    " 3 - Check Stock\n" +
                    " 4 - Exit\n" +
                    " >> ");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("How many items do you want to remove: ");
                var itemsToRemove = scan.nextInt();

                if (product1.getProductQuantity() < itemsToRemove) {
                    System.out.println();
                    System.out.println("Empty / insufficient  stock!");
                    System.out.println();
                } else {
                    product1.decreaseProduto(itemsToRemove);
                    System.out.println();
                    System.out.println(product1);
                    System.out.println();
                }

            } else if (choice == 2) {
                System.out.println("How many items you want add: ");
                var itemsToAdd = scan.nextInt();

                product1.increaseProduto(itemsToAdd);
                //product1.somaProduto();
                System.out.println();
                System.out.println("Stock updated");
                System.out.println(product1);
                System.out.println();

            }
            else if (choice == 3) {System.out.println("Check stock: "+product1);}

            else if (choice == 4) {
                scan.close();
                break;

            }
            else {
                System.out.println();
                System.out.println("Invalid option.");
                System.out.println();
            }

        }
    }
}
