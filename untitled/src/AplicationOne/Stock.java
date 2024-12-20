package AplicationOne;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Product product1 = new Product(("Nome"+scan.nextLine()), scan.nextDouble(), scan.nextInt() );

        System.out.println(product1);
        System.out.println();

        Product product2 = new Product("Arroz", 6.99,9);
        System.out.println(product2);
        System.out.println();



    }
}
