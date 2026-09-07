package com.adnan.multithreading.DeadLock8.DL1;

public class Main {


    public static void main(String[] args) {
        Object ob1 = new Object();
        Object ob2 = new Object();
        Thread1 t1 = new Thread1(ob1,ob2);
        Thread2 t2 = new Thread2(ob1,ob2);
        t1.setName("Adnan-Thread");
        t2.setName("wasi-Thread");
        t1.start();
        t2.start();

    }
}
