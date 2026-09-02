package com.adnan.multithreading.SleepVSWait5.Sleep;

public class main {
    public static void main(String[] args) {
        HDFCBank adnanAcc = new HDFCBank(10000);
        ATMThread t1 = new ATMThread(adnanAcc);
        t1.setName("Worker-1");
        GpayThread t2= new GpayThread(adnanAcc);
        t2.setName("Worker-2");
        t1.start();
        t2.start();
    }
}

/*
SLEEP()
SLEEP is a static method present in THREAD CLASS where we can make a thread sleep for given milliseconds
sleep() method will "NOT release the lock" (object lock) means whenever we reach sleep() method
in synchronized method then thread will go to sleep state and hold the lock till sleep time is completed
and then start the execution of the program if resources are not busy

we can write/use sleep() in both synchronized and non synchronized blocks


 */
