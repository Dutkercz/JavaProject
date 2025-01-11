package Anotacoes.InterfaceFuncional.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        System.out.println(list); //antes do filtro com predicado

        /* list.removeIf(new ProductPredic()); << usa um classe com uma interface implementada de Predicate.

        list.removeIf(Product::removeProductPredicate);  aqui usa uma referencia para o metodo contido em Product
                                                         sem nescessidade de instanciar um objeto porque é Static
        list.removeIf(Product::removeProductPredicateNoStatic);

        Predicate<Product> predicate = product -> product.getPrice() >= 100;  */

        list.removeIf(p -> p.getPrice() >= 100);

        System.out.println(list); //depois do filtro com predicado

        for (Product p : list){
            System.out.println(p);
        }

        




    }
}
