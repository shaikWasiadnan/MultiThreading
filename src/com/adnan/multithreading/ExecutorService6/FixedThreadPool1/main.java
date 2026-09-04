package com.adnan.multithreading.ExecutorService6.FixedThreadPool1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Adnan","P01",1000.00);
        Customer c2 = new Customer("Wasi","P02",1000.00);
        Customer c3 = new Customer("Shaik","P03",1000.00);
        Customer c4 = new Customer("Abrar","P04",1000.00);
        Customer c5 = new Customer("Idrees","P05",1000.00);
        Customer c6 = new Customer("Juned","P06",1000.00);
        Customer c7 = new Customer("Khavi","P07",1000.00);
        Customer c8 = new Customer("Shadap","P08",1000.00);
        Customer c9 = new Customer("Sameer","P09",1000.00);
        Customer c10 = new Customer("Ismail","P10",1000.00);

        List<Customer> customerList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for(Customer c : customerList){
            SendingEmail email = new SendingEmail(c);
            ex.execute(email);
        }
    }
}
/*
The main disadvantage of Thread was it cannot be reused again after completing run() method

This problem was solved by Executor Service which was introduced in Java 1.5 which creates Thread pool
so we can reuse the same thread again and again
1)There are 4 types of thread one is FixedThreadPool which will take fixed number and creates a pool of those many threads
so those threads will be reused again and again till work gets completed

so for example if i have to process 1M customer policies at one time if iam using single thread
then it may take 10 hrs. But if iam using lets say 8 threads it may be completed in 3 hrs

and all tasks are customer list in this case will be shifted to Queue so they will be processed in
FIFO manner at first first three three threads will take first three records then if any thread
completes its work it will take 4th record then next thread 5th record etc..
 */
