package com.adnan.multithreading.Synchronization4.ClassLock;

public class HDFCBank {
    private static int accBalance;

    public static synchronized void withdraw(int amountToBeWithdrawn){
         System.out.println(
                 Thread.currentThread().getName()+" entered withdraw and current State: "
                 +Thread.currentThread().getState()
         );
         try{
             Thread.sleep(5000);
         }
         catch (InterruptedException e){
             e.printStackTrace();
         }
        accBalance=accBalance-amountToBeWithdrawn;
    }
    public static synchronized void deposit(int amount){
        System.out.println(
                Thread.currentThread().getName()+" entered deposit and current State: "
                +Thread.currentThread().getState()
        );
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        accBalance=accBalance+amount;
    }
    public static void getBalance(){
        System.out.println(accBalance);
    }
}
