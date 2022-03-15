package com.company;
import java.io.*;
public class q2InsufficientFundsException extends Exception {
    private double amount;
    public q2InsufficientFundsException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

}
