package ApplicationFour.Orders;

import ApplicationFour.Products.Product;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return price * quantity;

    }

    @Override
    public String toString() {
        return  product.getProductName() +", US$: "+ getPrice() +" Quantity: " + getQuantity() + "units ,"+
                " Subtotal: US$" + String.format("%.2f" ,subTotal());
    }
}
