package Exercicios.ApplicationSeven.Entities;

import Exercicios.ApplicationSeven.Exceptions.DomainExceptionSeven;

public class AccountSeven {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public AccountSeven() {
    }

    public AccountSeven(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    //Methods
    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        if(amount > balance){
            throw new DomainExceptionSeven("Error! Withdraw exceeds account balance.");
        }
        if (amount > withdrawLimit){
            throw new DomainExceptionSeven("Error! Withdraw amount exceeds the withdraw limit.");
        }
        balance -= amount;
    }

}
