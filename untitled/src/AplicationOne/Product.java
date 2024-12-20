package AplicationOne;

public class Product {
    public String productName;
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

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double sumProduct() {
        return productQuantity*productPrice;
    }

    public void increaseProduct(int items){
        setProductQuantity(getProductQuantity() + items);
        sumProduct();

    }
    public void decreaseProduto(int itens){
        setProductQuantity(getProductQuantity() - itens);
        sumProduct();

    }


    @Override
    public String toString() {
        return "\tProduct:" + productName +"\n\tQuantity: "+productQuantity+
                "\n\tUnits: " + productQuantity +
                "\n\tTotal: US$ "+ sumProduct();
    }
}
