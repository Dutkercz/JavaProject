package Exercises.Ex09;

public class LegalPerson extends Person{
    private Integer employeeTotalNumber;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer employeeTotalNumber) {
        super(name, annualIncome);
        this.employeeTotalNumber = employeeTotalNumber;
    }

    public Integer getEmployeeTotalNumber() {
        return employeeTotalNumber;
    }

    public void setEmployeeTotalNumber(Integer employeeTotalNumber) {
        this.employeeTotalNumber = employeeTotalNumber;
    }

    @Override
    public Double totalTribute() {
        double totalTribute = 0.0;

        if (employeeTotalNumber > 10){
            totalTribute = annualIncome * 0.14;
        }else {
            totalTribute = annualIncome * 0.16;
        }
        return totalTribute;
    }
}
