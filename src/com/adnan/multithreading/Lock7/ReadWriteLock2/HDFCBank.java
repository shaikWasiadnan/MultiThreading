package com.adnan.multithreading.Lock7.ReadWriteLock2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFCBank {
    private double balance = 1000;
    ReadWriteLock lock = new ReentrantReadWriteLock(true);
    public void googlePayTransaction(){
        lock.writeLock().lock();
        System.out.println("GPAY");
        lock.writeLock().unlock();
    }
    public void readBalanceFromGpay(){
        lock.readLock().lock();
        System.out.println("reading balance from gpay");
        lock.readLock().unlock();
    }
    public void readBalanceFromPaytm(){
        lock.readLock().lock();
        System.out.println("reading balance from paytm");
        lock.readLock().unlock();
    }


    public static void main(String[] args) {
        HDFCBank bank = new HDFCBank();
        Thread t1 = new Thread(()->bank.googlePayTransaction());
        Thread t2= new Thread(()->bank.readBalanceFromGpay());
        t1.start();
        t2.start();
    }
}
/*
ReadWriteLock:

READ + READ - > Allowed
Read + Write ->Not Allowed
Write + Read ->Not Allowed
Write + Write ->Not Allowed

ReadWriteLock is an interface which has an implementation class of ReentrentReadWriteLock
which provides functionality to define exactly what operation is going to happen
and which lock to get for this lock

If one READ Operation is happening then any number of read operations are allowed because data will not change
But if two different operations are happening then one operation will acquire lock
another has to wait.

But cant we make all Write methods synchronized and all read methods non-synchronized to achieve this?
No,if we make all read methods non-synchronized then at the time when write operation is happening
then if some thread comes and reads the data then data will be inaccurate

volatile : we use volatile keyword infront of the variables if two threads are working on same variable at same time
then one may do a+=5; at the same time another may do a+=10 initially a=5; then there is a chance of data
inaccuracy as both threads modifying one data at the same time so we make variable volatile
so if any changes happen this variable value directly gets into Main memory so other thread can easily get the
modified value

Volatile vs Transient:
Transient keyword we use during serialization if we want some data not be part of serialization and
not to transfer that data over the internet we make those variables transient so they never being
shared.
 */
