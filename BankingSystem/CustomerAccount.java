package com.task.BankingSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAccount {
    private String customerName;
    private double accountBalance;

    public CustomerAccount() {
    }

    public CustomerAccount(String customerName, double accountBalance) {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }

    public void Deposit(double amount) {
        accountBalance += amount;

    }

    public void Withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double balanceInquery() {
        return accountBalance;
    }
}

