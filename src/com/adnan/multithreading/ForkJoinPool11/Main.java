package com.adnan.multithreading.ForkJoinPool11;

public class Main {
}

/*
Fork Join Pool: This uses MergeSort algo to solve problem of solving large data

Cyclic Barrier :All threads will wait at specific point after completing their work
CyclicBarrier barrier = new CyclicBarrier();
barrier.await();

Yield:
if we set priority to threads like t1.setPriority(8), t2.setPriority(10), t3.setPriority(5), t4.setPriority(4)

in run() method we use yield() method it just tells JVM to give more priority to highest priority thread
But it is not guaranteed that highest priority thread will execute first.
 */
