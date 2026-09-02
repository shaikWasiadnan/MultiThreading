package com.adnan.multithreading.Synchronization4.ClassLock;

public class GpayDeposit extends Thread{
    @Override
    public void run(){
        HDFCBank.deposit(7000);
    }
}
