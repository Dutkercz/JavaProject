package Anotacoes.Map;

import java.util.Objects;

public class ProductMap {
    private String productName;
    private Double productPrice;

    public ProductMap() {
    }

    public ProductMap(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ProductMap that = (ProductMap) o;
        return Objects.equals(productName, that.productName) && Objects.equals(productPrice, that.productPrice);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(productName);
        result = 31 * result + Objects.hashCode(productPrice);
        return result;
    }

    @Override
    public String toString() {
        return "productName :" + productName;
    }
}
