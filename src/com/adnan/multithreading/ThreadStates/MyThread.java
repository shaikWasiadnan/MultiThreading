package com.adnan.multithreading.ThreadStates;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        //RUNNING
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello world..");
    } //DEAD

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Worker-1"); // NEW
        t1.start(); // Runnable
    }
}
/*
Thread States :
NEW : Whenever we create a thread object it comes under NEW STATE

RUNNABLE: lets say there as 1000 threads which we are starting by .start() method
But our OS Cannot start all 1000 Threads at onetime so whenever we do .start() on thread object
ALL those 1000 threads will go inside "RUNNABLE" pool where they will wait for their turn

RUNNING : Whenever OS gives them a chance .start() method will internally call .run() method
which is already being overriden. then as Thread enters run() method its STATE CHANGES
TO RUNNING

DEAD : Once Thread completes its execution inside the run method it exist the run() method
then Thread state is DEAD
 */
