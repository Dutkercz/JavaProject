package Anotacoes.InterfaceFuncional.Predicate;

import java.util.function.Predicate;

public class ProductPredic implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100; // remove os itens que atenderem o requisito
    }
}
