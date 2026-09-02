package com.adnan.multithreading.Synchronization4.ObjectLock;

public class HDFCBank {
    private int accBalance;
    public HDFCBank(int accBalance){
        this.accBalance=accBalance;
    }
     public synchronized void withdraw(int amountToBeWithdrawn){
         System.out.println(
                 Thread.currentThread().getName()+" entered withdraw and current State: "
                 +Thread.currentThread().getState()
         );
         try{
             Thread.sleep(10000);
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
        accBalance=accBalance-amountToBeWithdrawn;
    }
    public synchronized void deposit(int amount){
        System.out.println(
                Thread.currentThread().getName()+" entered deposit and current State: "
                +Thread.currentThread().getState()
        );
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        accBalance=accBalance+amount;
    }
    public void getBalance(){
        System.out.println(this.accBalance);
    }
}
