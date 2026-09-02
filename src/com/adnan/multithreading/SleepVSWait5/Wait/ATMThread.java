package com.adnan.multithreading.SleepVSWait5.Wait;



public class ATMThread extends Thread{
    private HDFCBank bank;
    public ATMThread(HDFCBank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        try {
            bank.withDraw(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
