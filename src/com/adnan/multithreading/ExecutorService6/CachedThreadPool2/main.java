package com.adnan.multithreading.ExecutorService6.CachedThreadPool2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) {
        ExecutorService ex1 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newSingleThreadExecutor();

        //Future<Object> future = ex1.submit(callable);
    }
}


/*

CACHED THREAD POOL will create threads whenever required
for example if we have to process 10 customers then if one thread is busy it creates second
if two busy it creates third if 3 busy it creates 4 and so on..

lets say after creating 6 threads one thread became free then it will use that free thread.
there is no limit for thread creation, as threads are created dynamically this is not recommended

Single thread pool : it will only create one thread and will be used everytime

Our run() method cannot return anything if we have a requirement our method which thread will be executing
Should return somethingthen instead of implementing Runnable we can go with implementing

Callable<?> it returns value and throws Exception

in Executor service to create a seperate path of execution/create a thread
we have 2 methods

.execute(runnable) , .submit(runnable) , .submit(callable)

whenever using .submit(callable) then this return a Future<Object> interface

as we will not have idea when a thread execution will start and which thread will run at what time
to get the return value which we will get in Future thats why java created Future interface
 */
