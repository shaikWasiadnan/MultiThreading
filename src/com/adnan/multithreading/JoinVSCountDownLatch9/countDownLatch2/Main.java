package com.adnan.multithreading.JoinVSCountDownLatch9.countDownLatch2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(8);
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for(int i=1;i<=8;i++){
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Implementing run method");
                    latch.countDown();
                }
            });

        }
        latch.await();
        System.out.println("Main method");
    }
}

/*
If we are using simple Threads then we can directly call .join() on Threads to make their parent
wait.
But if we are using Thread pool then we cant call .join() on any specific thread because we will
not have reference to any specific Thread.
Then CountDownLatch comes into Picture to make main thread wait till all thread completes their work
CountDownLatch is a class in its constructor we can define the number which is basically
the number of tasks which we are going to submit in BlockingQueue.

Whenever we do latch.coutDown() inside run it decreases count by 1 everytime so when all 8 threads completes
till then to make main thread wait we use latch.await() after it become 0 main thread will come into Action
 */
