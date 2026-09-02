package com.adnan.multithreading.Synchronization4.ClassLock;


public class ATMWithdraw extends Thread{

    @Override
    public void run(){
        HDFCBank.withdraw(4000);
    }
}
