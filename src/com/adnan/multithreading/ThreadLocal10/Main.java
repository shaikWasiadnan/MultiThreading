package com.adnan.multithreading.ThreadLocal10;

public class Main {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(10);
                display();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(50);
                display1();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    private static void display(){
        System.out.println("THREAD1 VALUE IS: "+threadLocal.get());
    }

    private static void display1(){
        threadLocal.set(threadLocal.get()+10);
        System.out.println("THREAD2 VALUE IS: "+threadLocal.get());
    }
}
/*

If we want to variable only specific to the respective thread and from run() method if we call
any number of threads the varible should be same then we go with ThreadLocal<?> class

if we use local variable inside run() method then it belongs to only that method
If we use Global variable then all threads can access it and that variable doesn't become
Thread specific.
 */
