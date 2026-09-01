package com.adnan.multithreading.ThreadCreationUsingExtendsThread;

public class MyTask extends Thread{
    @Override
    public void run(){
        System.out.println("Executing Thread");
        System.out.println("Executing Thread");
    }
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
/*
What is Thread : Thread is a seperate executing path of execution in the same program.
Whenever we create a class that extends Thread class then that class object will act as the thread object
abd can be started using .start() method.
Why do we override run() method ?
Because if we dont override run() method then default run() method present in Thread Class will be executed
But the main work of run() method is to tell thread exactly what work thread has to do.and run() method in
Thread class dont have actual logic.

start() : After calling start() method JVM will create a seperate thread and call run() method internally.
why dont we call run() directly like t1.run() ?
if we call run() directly then no seperate thread will be created and whatever logic has been written in
overriden run() method will be executed by main Thread only.



 */
