package Anotacoes.EHP;

public class BusinessAccount extends Account {
    public static final double loanTax = 10.00;

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(String holder, Integer number, Double balance, Double loanLimit) {
        super(holder, number, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double loanValue){
        if (loanValue <= loanLimit){
            loanValue -= loanTax;
            deposit(loanValue);
        }
        else {
            System.out.println("Exceeds loan limit");
        }
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value);
        balance -= 2.00;
    }
}
