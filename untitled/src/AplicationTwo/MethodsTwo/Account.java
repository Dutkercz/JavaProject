package AplicationTwo.MethodsTwo;

public class Account {

    public static final double tax = 5.00;

    private String titularName;
    private int accountNumber;
    private double depositAccout;
    private double balanceAccount;


    //Constructors
    public Account(String titularName, int accountNumber, double initialDeposit) {
        this.titularName = titularName;
        this.accountNumber = accountNumber;
        this.balanceAccount = initialDeposit;
    }

    public Account(String titularName, int accountNumber) {
        this.titularName = titularName;
        this.accountNumber = accountNumber;

    }

    public Account() {

    }

    //Getter and Setters


    public double getBalanceAccount() {
        return balanceAccount;
    }

    public String getTitularName() {
        return titularName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getDepositAccout() {
        return depositAccout;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    //Methods
    public void withdraw (double value) {
        balanceAccount -= value - tax;
    }

    @Override
    public String toString() {
        return "Titular name: " + titularName +
                "\nAccount number: " + accountNumber +
                "\nBalance: US$ " + balanceAccount;
    }
}
