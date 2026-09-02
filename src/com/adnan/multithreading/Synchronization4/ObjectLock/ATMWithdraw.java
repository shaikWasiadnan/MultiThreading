package com.adnan.multithreading.Synchronization4.ObjectLock;

public class ATMWithdraw extends Thread{
    private HDFCBank bank;
    public ATMWithdraw(HDFCBank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        bank.withdraw(4000);
    }
}
