package Exercises.ApplicationThree.Entites;

import java.util.Date;

public class HourContracts {
    private Date date;
    private Double valurPerHour;
    private Integer hours;

    public HourContracts(Date date, Double valurPerHour, Integer hours) {
        this.date = date;
        this.valurPerHour = valurPerHour;
        this.hours = hours;
    }

    public double totalValue (){
        return hours * valurPerHour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValurPerHour() {
        return valurPerHour;
    }

    public void setValurPerHour(Double valurPerHour) {
        this.valurPerHour = valurPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return  "date=" + date +
                ", valurPerHour=" + valurPerHour +
                ", hours=" + hours + "Total: " + totalValue();
    }
}
