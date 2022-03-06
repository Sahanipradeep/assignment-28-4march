package com.company;

public abstract class BankAccount{
    String customerName;
    double balance;
    String type;
    public void printStatement(){
        System.out.println("Balance:"+balance);
    }
    public void depositAmount(int amount){
        balance=balance+amount;
    }
