package AplicationOne;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double somaProduto() {
        return productQuantity*productPrice;
    }

    @Override
    public String toString() {
        return "O produto " + productName +", tem "+productQuantity+" unidades," +
                "no total de R$ "+ somaProduto();
    }
}
