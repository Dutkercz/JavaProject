package AplicationOne.MethodsOne;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

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

    public int setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
        return productQuantity;
    }

    public double somaProduto() {
        return productQuantity*productPrice;
    }
    public int increaseProduto(int itens){
        int aux = setProductQuantity(getProductQuantity() + itens);
        somaProduto();
        return aux;
    }
    public int decreaseProduto(int itens){
        int aux = setProductQuantity(getProductQuantity() - itens);
        somaProduto();
        return aux;
    }


    @Override
    public String toString() {
        return "O produto " + productName +", tem "+productQuantity+" unidades," +
                "no total de R$ "+ somaProduto();
    }
}
