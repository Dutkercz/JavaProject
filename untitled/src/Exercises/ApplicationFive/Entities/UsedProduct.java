package Exercises.ApplicationFive.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacturingDate;

    public UsedProduct(String name, Double price, Date date) {

        super(name, price);
        this.manufacturingDate = date;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "( Manufacturing date: " + manufacturingDate+")";
    }
}
