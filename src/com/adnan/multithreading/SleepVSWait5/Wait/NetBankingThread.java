package com.adnan.multithreading.SleepVSWait5.Wait;


public class NetBankingThread extends Thread{
    private HDFCBank bank;
    public NetBankingThread(HDFCBank bank){
        this.bank = bank;
    }
    @Override
    public void run(){
        try {
            bank.netBankingWithDraw(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
