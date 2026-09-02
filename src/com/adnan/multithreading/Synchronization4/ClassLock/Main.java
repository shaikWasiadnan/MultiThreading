package com.adnan.multithreading.Synchronization4.ClassLock;


public class Main {
    public static void main(String[] args) {
        ATMWithdraw t1 = new ATMWithdraw();
        t1.setName("ATM Thread");
        GpayDeposit t2 = new GpayDeposit();
        t2.setName("Gpay Thread");
        t1.start();
        t2.start();
    }
}

/*
Synchronization : In java synchronization controls the access to the Critical Section
Critical section is a part of program where shared data or resources accessed
in multithreaded environment only one thread can access the critical section at one time while
other threads need to wait.
We have to use Synchronized keyword in methods so when two threads want to access resource means static
resources then CLASS Lock will be applied on Threads means while one thread is accessing static
resource other thread will monitor/wait for first one to complete

The other thread becomes BLOCKED while waiting to acquire the same lock. When the first thread releases
the lock, the waiting thread can acquire it and proceed.

When two Threads wants to access a shared static resource and if we have synchronized keyword applied
then class lock will be applied.
 */
