package com.adnan.multithreading.JoinVSCountDownLatch9.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method-1 executing");
            }
        });

        Thread t2= new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method-2 executing");
            }
        });
         t1.start();
         t2.start();
         t1.join();
         t2.join();
        System.out.println("Main method");
    }
}

/*
If there are multiple threads running our main thread will not wait for other threads to complete
It goes on and complete its execution before other threads
but if we use .join() on threads then their parent thread here main thread will wait till
child threads complete their work so main thread gets blocked.
 */
