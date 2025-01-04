package Exercises.ApplicationFour.ProgramFour;

import Exercises.ApplicationFour.Client.Client;
import Exercises.ApplicationFour.Orders.Order;
import Exercises.ApplicationFour.Orders.OrderItem;
import Exercises.ApplicationFour.Products.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import static Exercises.ApplicationFour.Orders.OrderStatus.PENDING_PAYMENT;

public class AppFour {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat dataBrithday = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("E-mail: ");
        String email = scan.nextLine();
        System.out.print("Birthday: dd/mm/yyyy: ");
        String birthday = scan.nextLine();

        Client client1 = new Client(name, dataBrithday.parse(birthday), email);

        System.out.println(client1);
        System.out.print("Want star a new order:\n" +
                "   1 - Yes\n" +
                "   2 - No\n" +
                "   >> ");
        int cont = scan.nextInt();
        scan.nextLine();
        if (cont == 1){
            Order newOrder = new Order(client1, PENDING_PAYMENT);
            System.out.println("How many itens for this order: ");
            int orderItensQuantity = scan.nextInt();
            scan.nextLine();

            for (int i = 1; i <= orderItensQuantity; i++) {
                System.out.printf("     Enter %d# item data\n" , i);
                System.out.print("Product name: ");
                String productName = scan.nextLine();
                System.out.print("Produtc price: ");
                Double productPrice = scan.nextDouble();
                System.out.print("Product quantity: ");
                Integer productQuantity = scan.nextInt();
                scan.nextLine();

                Product productAux = new Product(productName, productPrice);
                OrderItem item = new OrderItem(productQuantity,productPrice,productAux);

                newOrder.items.add(item);

            }
            System.out.println("Order Resume:");
            System.out.println(newOrder);

        }


    }
}
