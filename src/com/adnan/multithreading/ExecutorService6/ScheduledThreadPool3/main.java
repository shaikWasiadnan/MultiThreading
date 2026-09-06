package com.adnan.multithreading.ExecutorService6.ScheduledThreadPool3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
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

        ScheduledExecutorService ex1 = Executors.newScheduledThreadPool(3);
        ScheduledExecutorService ex2 = Executors.newScheduledThreadPool(2);
        List<ScheduledFuture<Object>> list = new ArrayList<>();
        for(Customer c : customerList) {
            Task t = new Task(c);
            ScheduledFuture<Object> future = ex1.schedule(t, 1, TimeUnit.MINUTES);
            //ScheduledFuture<Object> future2 = ex2.scheduleAtFixedRate(t,1,5,TimeUnit.MINUTES);
            list.add(future);
        }
        ex1.shutdown();
        for (int i=0;i<list.size();i++){
            ScheduledFuture<Object> ob = list.get(i);
            ob.get();
        }
    }
}

/*
ScheduledThreadPool : It is same like Fixed Thread pool where it takes fixed number of threads
to complete the tasks with one major difference in Fixed Thread pool as soon as Tasks get added to
Blocking queue threads will pickup those Tasks and start running run() method at the same time

Here in Scheduled Thread pool tasks will be added to blocking Queue
But no thread will start running run() method they will wait to complete the delay time which has been given
For example there are 3 threads and 10 tasks to perform and delay time is 5 minute then 3 threads will
wait for 5 minutes even after tasks go added to Queue then first thread will pick the task
then 2nd then 3rd after 1st thread completes its work then again it will wait for 5 minutes then start
picking the tasks.

->ScheduledExecutorService is child interface of ExecutorService and it will also have the submit()
and execute() methods init. but if we use them they will work as normal methods so to achieve
our goal of scheduling and wait time we have to use schedule() method.

As we are using Callable it will return ScheduledFuture<Object> as ScheduledThreadPool is being used
so to get values from both FixedThreadPool or ScheduledThreadPool have a method called as .get()
this is a blocker method which will block the main method till we get the value.


scheduleAtFixedRate():
Here we also have scheduleAtFixedRate(runnable,initial Delay, Delay,TIMEUNITS)
here if we use this method then threads will start with the initial Delay which we gave then to pick
remaining tasks threads will wait initialDelay+Delay time.

scheduleAtFixedRate only takes runnable not callable whereas schedule can take both
 */
