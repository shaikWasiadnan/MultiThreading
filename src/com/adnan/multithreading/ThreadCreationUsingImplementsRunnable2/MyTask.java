package com.adnan.multithreading.ThreadCreationUsingImplementsRunnable2;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World");
        System.out.println("Hello World");

    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t1 = new Thread(task,"Worker-1");

        Thread t2 = new Thread(task,"Worker-2");
        t1.start();
        t2.start();

    }
}

/*
 Recommended way of Thread creation
 in both is using implements Runnable because in java a class can extend only one parent
  class so it is difficult if a class is already extending another class then we cannot
   extend Thread class but class can implements any number of classes. here the myTask class
   object is not a Thread Obect .Runnable is a Functional interface with one abstract run() method
    which will contains the logic thread has to execute When t1.start() is called, the JVM starts a
  new thread. That new thread eventually invokes Thread.run(), and Thread.run() delegates to the
   Runnable object's run() method.

Whenever we are implementing Runnable interface from a class that class is "NOT A THREAD OBJECT" it is
only to dictate work to Threads.
If we want to change name of Threads while thread creation we can pass the name along with the task object.
 */
