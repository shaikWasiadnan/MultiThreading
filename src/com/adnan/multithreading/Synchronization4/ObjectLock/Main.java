package com.adnan.multithreading.Synchronization4.ObjectLock;

public class Main {
    public static void main(String[] args) {
        HDFCBank adnanAcc = new HDFCBank(8000);

        ATMWithdraw t1 = new ATMWithdraw(adnanAcc);
        t1.setName("ATMThread");
        GpayDeposit t2 = new GpayDeposit(adnanAcc);
        t2.setName("GpayThread");
        t1.start();
        t2.start();
    }
}

/*
Synchronization : In java synchronization controls the access to the Critical Section
Critical section is a part of program where shared data or resources accessed
in multithreaded environment only one thread can access the critical section at one time while
other threads need to wait.
We have to use Synchronized keyword in methods so when two threads want to access resource with
Same object then "Object lock" will be used and one thread has to wait till other completes.

When two Threads wants to access a shared reource with same object then OBject lock will be used.

Example1 : Thread t1 is accessing Synchronized method m1() using object a, Then
          Thread t2 using object a cannot access synchronized method m2().

Example2 : Thread t1 is accessing Synchronized method m1() using object a, Then
          Thread t2 using object B can access synchronized method m2() AT THE SAME TIME.
 */
