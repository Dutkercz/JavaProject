package Anotacoes.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramMap {
    public static void main(String[] args) {

        Map<ProductMap, Double> map = new HashMap<>();

        ProductMap p1 = new ProductMap("Tv", 900.00);
        ProductMap p2 = new ProductMap("Celular", 850.00);
        ProductMap p3 = new ProductMap("Micro", 350.00); //cria um produto com seu valor em R$
        ProductMap p4 = new ProductMap("Tablet" , 380.90);
        map.put(p1, 1000.00); //aqui adicionamos o produto e sua quantidade (o produto ja tem o seu valor inserido)
        map.put(p2, 2000.00);
        map.put(p3, 3400.00);

        ProductMap ps = new ProductMap("Tv", 900.00);// cria um novo objeto "igual" ao p1
        //map.put(ps, 200.0); // porem se adicionarmos esse objeto, ele reescrevera o p1, pois a chave (TV, 900.0) é igual
                                // dentro da Map list.
        System.out.println(p1.hashCode()); //perceba que são objetos diferentes, olhe os hashcodes
        System.out.println(ps.hashCode()); // mas adicionando o ps (map.put(ps)) o que importa para o Maplist é a chave
                                                                                // ("TV", 900) < chave


        System.out.println( map.keySet() +" = " +map.values());

        System.out.println("Comtem PS key? " + map.containsKey(ps));

        ProductService service = new ProductService();

        List<ProductMap> productMaps = new ArrayList<>();

        productMaps.add(p1);
        productMaps.add(p2);
        productMaps.add(p3);
        productMaps.add(p4);


        double sum = service.filteredSum(productMaps, x -> x.getProductPrice() > 100.0);

        System.out.println("Soma" + sum);

    }
}
