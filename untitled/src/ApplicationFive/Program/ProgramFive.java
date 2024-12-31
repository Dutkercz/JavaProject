package ApplicationFive.Program;

import ApplicationFive.Entities.Product;
import ApplicationFive.Entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProgramFive {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        System.out.println("Enter number of products: ");
        int numberOfProducts = scan.nextInt();
        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.println("\nProduct #" + i + " data\n");
            System.out.println("Product classification:" +
                    "\n   1 - Common" +
                    "\n   2 - Used" +
                    "\n   3 - Imported");
            int choice = scan.nextInt();
            scan.nextLine();
            System.out.println("Product name: ");
            String name = scan.nextLine();
            System.out.println("Product price: ");
            double productPrice = scan.nextDouble();
            scan.nextLine();
            if (choice == 1){
                productList.add(new Product(name, productPrice));
            } else if (choice == 2) {
                System.out.println("Manufacture date: ");
                String date = scan.nextLine();
                productList.add(new UsedProduct( name, productPrice, sdf.parse(date)));
            }

        }
    }
}
