package com.adnan.multithreading.Synchronization4.ObjectLock;

public class GpayDeposit extends Thread{
    private HDFCBank bank;
    public GpayDeposit(HDFCBank bank){
        this.bank=bank;
    }
    @Override
    public void run(){
        bank.deposit(7000);
    }
}
