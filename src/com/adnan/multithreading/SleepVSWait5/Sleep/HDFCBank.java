package com.adnan.multithreading.SleepVSWait5.Sleep;

public class HDFCBank {
    private int balance;
    public HDFCBank(int balance){
        this.balance=balance;
    }

    public synchronized void withDraw(int WithdrawalAmount) throws InterruptedException {
        Thread.sleep(7000);
        balance = balance-WithdrawalAmount;
    }
    public synchronized void deposit(int amountToDeposited) throws InterruptedException {
        Thread.sleep(7000);
        balance+=amountToDeposited;
    }
}
