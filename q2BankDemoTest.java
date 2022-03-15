package com.company;

import java.util.Scanner;

public class q2BankDemoTest {
    public static void main(String[] arg) throws q2InsufficientFundsException {
    q2CheckingAccount account= new q2CheckingAccount();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter deposit amount: ");
    double deposit= input.nextDouble();
    try {
        account.deposit(deposit);
    }
    catch(IllegalArgumentException e){
        System.out.println("Negative deposit!");
        return;
    }
    System.out.println("Enter withdrawal amount: ");
    double withdraw= input.nextDouble();
    try{
        account.withdraw(withdraw);
    }
    catch (q2InsufficientFundsException e){
        System.out.println("Sorry, but your account is short by: $ "+e.getAmount());
    }catch(IllegalArgumentException e){
        System.out.println("Negative withdrawal!");
    }
}}
