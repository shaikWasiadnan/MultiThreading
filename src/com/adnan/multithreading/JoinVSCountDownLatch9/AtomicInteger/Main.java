package com.adnan.multithreading.JoinVSCountDownLatch9.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static AtomicInteger count =new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1500;i++){
                    //count++;
                    count.incrementAndGet();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1500;i++){
                    //count++;
                    count.incrementAndGet();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count = "+count);
    }
}

/*
AtomicInteger:
 If we want to achieve thread safety for only Global variables if we use synchronized blocks
 or locks then our program will become slow and we are not doing any heavy work we are only dealing with
 varibles then we can use AtomicInteger class so we get correct result

 If we dont use AtomicInteger class then there is a chance that in a multithreaded environment variable
 gets read by two or more threads at the same time and they get updated at same milli second
 then there is a chance of wrong result.

 Volatile:
Volatile keyword solves Visibility problem means if one thread has modified the value then
it will be directly pushed into main memory so all other threads can see the modified value
but there is a chance that multiple threads can modify the variable at the same time.but when
using AtomicInteger we get access like synchronized keyword but where are not using it.
 */
