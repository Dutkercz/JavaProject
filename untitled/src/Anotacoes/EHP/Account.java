package Anotacoes.EHP;

public class Account {
    private String holder;
    private Integer number;
    protected Double balance;

    public Account(){
    }

    public Account(String holder, Integer number, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit (double value){
        balance += value;
    }
    public void withdraw (double value){
        balance -= value;
    }
}
