package Anotacoes.Map;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public Double filteredSum(List<ProductMap> list , Predicate<ProductMap> criteria){
        double sum = 0;
        for (ProductMap c : list){
            if (criteria.test(c)){
                sum += c.getProductPrice();
            }
        }
        return sum;
    }
}
