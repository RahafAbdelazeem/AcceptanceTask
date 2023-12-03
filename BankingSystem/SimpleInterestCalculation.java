package com.task.BankingSystem;

public class SimpleInterestCalculation  implements  InterestCalculation{
    private static final double INTEREST_RATE = 0.3;
    @Override
    public double calculateInterest(double balance) {
        return balance * INTEREST_RATE;

    }
}
