package com.adnan.multithreading.DeadLock8;

public class Thread1 extends Thread{
    public Object ob1;
    public Object ob2;
    public Thread1(Object ob1, Object ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started trying to acquire lock1");
        try{
            Thread.sleep(1000);
            synchronized (ob1){
                System.out.println(Thread.currentThread().getName()+" acquired lock1");
                System.out.println(Thread.currentThread().getName()+" started trying to acquire lock2");
                synchronized (ob2){
                    System.out.println(Thread.currentThread().getName()+" acquired lock2");
                }

            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
