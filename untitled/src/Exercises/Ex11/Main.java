package Exercises.Ex11;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Achive path: ");
        String path = scanner.nextLine();

        List<Product> nameAndPrice = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while (line != null){
                String[] vect = line.split(",");
                double price = Double.parseDouble(vect[1]);
                nameAndPrice.add(new Product(vect[0],price ));




                line = bufferedReader.readLine();
            }

        }catch (FileNotFoundException e){
            System.out.println("Archive not found");
        }catch (IOException e){
            System.out.println("Unexpected error.");
        }

        Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        double averageS = nameAndPrice.stream().map(x -> x.getPrice()).reduce(0.0, (x,y) -> x + y) / nameAndPrice.size();

        System.out.println("Average price " + String.format("%.2f",averageS));
        List<String> productUnderAvgPrice = nameAndPrice.stream().filter(x -> x.getPrice() < averageS)
                .map(x -> x.getName()).sorted(comparator.reversed()).toList();
        //  !usei o - no meu compartor, mas podemos usar o sorted(compartor.reverse) na exp. lambda (inverti)

        productUnderAvgPrice.forEach(System.out::println);


    }
}
