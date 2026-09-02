package com.adnan.multithreading.SleepVSWait5.Sleep;

public class GpayThread extends Thread{
    private HDFCBank bank;
    public GpayThread(HDFCBank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        try{
            bank.deposit(10000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
