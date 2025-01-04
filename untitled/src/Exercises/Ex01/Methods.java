package Exercises.Ex01;

public class Methods {
    private String name;
    private double grossSalary;
    private double tax = 1000;

    public Methods(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }


    public double netSalary(){
        return getGrossSalary()-tax;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void increaseSalary(double percentageIncreaseSalary) {
        setGrossSalary( getGrossSalary() * ( 1 + ( percentageIncreaseSalary / 100 )));
    }

    @Override
    public String toString() {
        return "Employee: " + getName() +
                "\nGross Salary: " + String.format("%.2f",grossSalary) +
                "\nNet salary: " + String.format("%.2f",netSalary()) ;
    }



}
