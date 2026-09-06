package com.adnan.multithreading.Lock7.ReentrentLock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        BookTicket ticket = new BookTicket();

        Thread t1 = new Thread(()-> ticket.bookTicket());
        Thread t2 = new Thread(()-> ticket.bookTicket());
        Thread t3 = new Thread(()-> ticket.bookTicket());
        t1.start();
        t2.start();
        t3.start();

    }
}
/*
The main disadvantages of Synchronized methods or blocks are
1)Thread Starvation : There is a chance a thread is waiting for long time may not get a chance to enter
the block and it keeps on Waiting
2)We dont have flexibility to lock in one method and unlock in another method
As soon as thread reaches synchronized/method/block it acquires lock and as soon as it reaches
the last line of that method it will relaese the lock

Lock: Here we can eliminate these two disadvantages using Lock interface and its implementation
class ReentrentLock. where we can give fairness to the threads so the thread which is waiting
for long time will get the chance first
2)we can acquire lock in one method and release in another
 */
