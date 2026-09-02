package com.adnan.multithreading.SleepVSWait5.Wait;



public class GpayThread extends Thread{
    private HDFCBank bank;
    public GpayThread(HDFCBank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        bank.deposit(10000);
    }
}
