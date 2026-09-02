package com.adnan.multithreading.SleepVSWait5.Wait;

public class HDFCBank {
    private int balance;
    public HDFCBank(int balance){
        this.balance=balance;
    }

    public synchronized void withDraw(int WithdrawalAmount) throws InterruptedException {
        while(WithdrawalAmount > balance) wait();
        balance = balance-WithdrawalAmount;
    }
    public synchronized void deposit(int amountToDeposited)  {

        balance+=amountToDeposited;
        notifyAll();
    }

    public synchronized void netBankingWithDraw(int WithdrawalAmount) throws InterruptedException{
        while(WithdrawalAmount > balance){
            wait();
        }
        balance = balance-WithdrawalAmount;
    }
}
