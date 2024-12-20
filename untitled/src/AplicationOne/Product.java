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

    public double somaProduto() {
        return productQuantity*productPrice;
    }

    public void increaseProduto(int items){
        setProductQuantity(getProductQuantity() + items);
        somaProduto();

    }
    public void decreaseProduto(int itens){
        setProductQuantity(getProductQuantity() - itens);
        somaProduto();

    }


    @Override
    public String toString() {
        return "\tProduct:" + productName +"\n\tQuantity: "+productQuantity+
                "\n\tUnits: " + productQuantity +
                "\n\tTotal: US$ "+ somaProduto();
    }
}
