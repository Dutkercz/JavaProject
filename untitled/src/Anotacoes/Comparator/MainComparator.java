package Anotacoes.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {

        /// USAREMOS O compareTo

        Product p1 = new Product("Microondas", 450.00);
        Product p2 = new Product("Tv ", 1500.00);
        Product p3 = new Product("Celular", 900.00);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);

        System.out.println(productList);
        System.out.println("===========");
        productList.sort(new MyComparator());
        System.out.println(productList);

        //PODEMOS CRIAR UM CLASSE ANONIMA OU SEJA, DEFINIR A CLASSE DENTRO DA CLASSE PRINCIPAL
        // EX
        //vou adicionar mais um produto

        Product p4 = new Product("Geladeira", 3500.00);

        productList.add(p4);

        /*Comparator<Product> comparator = new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }
        }; << detalhe para o ; depois do colchete -.o.-
        POREM COMO TUDO MUDA DA AGUA PRO VINHO, TEMOS A FUNÇÃO LAMBDA QUE TORNA A EXPRESÃO ACIMA MAIS ENXUTA
        OLHA QUE BACANA!

        Comparator<Product> productComparator = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
        //OLHA QUE BACANA, EM 1 LINHA!
        VAMOS RETIRAR O INICIO E JOGAR O QUE TIVER DEPOIS DO = DENTRO DO SORT, VIDE MAIS ABAIXO*/

        System.out.println("===============");
        // QUANDO PENSA QUE JA RESUMIU, TEM MAIS!!
        System.out.println("Depois de add novo item e usar a classe anonima");
        productList.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));
        System.out.println(productList);

    }
}
