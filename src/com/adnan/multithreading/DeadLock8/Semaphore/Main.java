package com.adnan.multithreading.DeadLock8.Semaphore;

public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            Thread1 t1 = new Thread1(i);
            t1.start();
        }
    }
}

/*
If we are using normal synchronized blocks or methods
then if lets say 10 threads operating on 10 different objects can easily
access the shared resource/critical section without any issue because they are using
different objects.so object lock will be also different

But if we have condition that only lets say 3 threads or 2 threads should access critical section/shared resource
at one time even if multiple threads lets say 10 operating on 10 different objects
then we cannot control this with synchronized blocks
Here we have to use Semaphore to control this.
 */
