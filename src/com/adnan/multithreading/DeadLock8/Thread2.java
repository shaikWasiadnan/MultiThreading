package com.adnan.multithreading.DeadLock8;

public class Thread2 extends Thread{
    public Object ob1;
    public Object ob2;
    public Thread2(Object ob1, Object ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started trying to acquire lock2");
        try{
            Thread.sleep(1000);
            synchronized (ob2){
                System.out.println(Thread.currentThread().getName()+" acquired lock2");
                System.out.println(Thread.currentThread().getName()+" started trying to acquire lock1");
                synchronized (ob1){
                    System.out.println(Thread.currentThread().getName()+" acquired lock1");
                }

            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

/*
Dead Lock : Dead Lock happens in java when one thread has acquired object 1 and another thread
acquired object 2. and first thread is waiting for object 2 which has acquired by second Thread
and second thread is waiting for object 1 which is acquired by first thread
and they both kee on waiting this is Dead lock

How to Prevent DeadLock?
if we are using synchronized blocks the make sure to acquire lock int the same order in every thread
above we have seen
Thread1 is acquring lock in order Object1 -> Object2
Thread2 is acquring lock in order Object2 -> Object1
This will create a DeadLock
so to prevent we have to make sure always
Thread1 is acquring lock in order Object1 -> Object2
Thread2 is acquring lock in order Object1 -> Object2

if we are using Reentrent lock always use lock.tryLock() method before acquiring lock
.tryLock() method will return true immediatly if lock is available, false if not available
 */
