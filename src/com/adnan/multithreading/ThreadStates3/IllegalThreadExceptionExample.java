package com.adnan.multithreading.ThreadStates3;

public class IllegalThreadExceptionExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello world...");
    }

    public static void main(String[] args) {
        IllegalThreadExceptionExample example = new IllegalThreadExceptionExample();
        Thread t1 = new Thread(example,"worker-1");
        Thread t2 = new Thread(example,"worker-2");
        t1.start();
        t1.start();
        t2.start();
    }
}

/*
Question is Can we reuse same THREAD ?
Ans: NO, ONE THREAD Cannot be reused again because when for the first time t1.start()
is called start() method of Thread class is called inside which we have "Thread Status"
global variable at first it is being set to 0 once first time thread reaches we have a logic
to check if(threadStatus!=0) throw new IllegalThreadException
at first time it is 0 then a new path of execution means a new thread will be created and Thread status
value will be updated to 5 then after thread running run() method it becomes dead.
Then next time same thread tries to call start() method  IllegalThreadException will be thrown
because of Thread status==5 not 0.
 */
