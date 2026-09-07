package com.adnan.multithreading.DeadLock8.Semaphore;

import java.util.concurrent.Semaphore;

public class Thread1 extends Thread{
    private int idx = 0;
    public Thread1(int idx){
        this.idx = idx;
    }
    Semaphore semaphore = new Semaphore(2);
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " Trying to acquire lock");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+ " Acquired lock");
            System.out.println(Thread.currentThread().getName()+ " Doing some work");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
