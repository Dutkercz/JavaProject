package Exercises.Ex09;

public class NaturalPerson extends Person{
    private Double healthCareExpenses;

    public NaturalPerson() {
        super();
    }


    public NaturalPerson(String name, Double annualIncome, Double healthCareExpenses) {
        super(name, annualIncome);
        this.healthCareExpenses = healthCareExpenses;
    }

    public Double getHealthCareExpenses() {
        return healthCareExpenses;
    }

    public void setHealthCareExpenses(Double healthCareExpenses) {
        this.healthCareExpenses = healthCareExpenses;
    }

    @Override
    public Double totalTribute() {
        double totalTribute = 0.0;
        if (annualIncome < 20000.00){
            totalTribute = annualIncome * 0.15;
        }
        else {
            totalTribute = annualIncome * 0.25;
        }

        if (healthCareExpenses > 0){
            double varAux = healthCareExpenses / 2;
            totalTribute -= varAux;
        }
        return totalTribute;
    }



}
