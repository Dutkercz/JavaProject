package Exercises.ApplicationFive.Entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
        this.price = totalPrice();
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice (){
        return price += customsFee;
    }


    @Override
    public String priceTag() {
        return super.priceTag() +"( Customs fee: US$ "+ customsFee ;
    }
}
