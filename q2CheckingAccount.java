package com.company;

public class q2CheckingAccount {
    private double balance;
    private int accountNumber;

    public void deposit(double depositAmt){
        if (depositAmt<0){
            throw new IllegalArgumentException();
        }
        else{balance+=depositAmt;
        }
    }
    public void withdraw(double withdrawAmt) throws q2InsufficientFundsException {
        if (withdrawAmt<=0){
            throw new IllegalArgumentException();
        }
        if(balance>=withdrawAmt) {
            balance -= withdrawAmt;

            System.out.println("The balance after withdraw is: $" + balance);
        }
        else{
            double overdraftAmt=withdrawAmt-balance;

            throw new q2InsufficientFundsException(overdraftAmt);
        }
    }
    public void getBalance(){
        System.out.println("The balance in the account is $"+balance);
    }
    public void getNumber(){
        System.out.println("The account number is "+accountNumber);
    }
}
