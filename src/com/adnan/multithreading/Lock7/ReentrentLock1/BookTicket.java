package com.adnan.multithreading.Lock7.ReentrentLock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookTicket {
    Lock lock = new ReentrantLock(true);
    public void bookTicket(){
        lock.lock();
        seeAvailableTickets();
        System.out.println("Booking Ticket");

    }
    public void seeAvailableTickets(){

        System.out.println("Checking all tickets");
        lock.unlock();
    }
}
