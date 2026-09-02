package com.adnan.multithreading.SleepVSWait5.Wait;


public class main {
    public static void main(String[] args) {
        HDFCBank adnanAcc = new HDFCBank(3000);
        HDFCBank wasiAcc = new HDFCBank(3000);
        ATMThread t1 = new ATMThread(adnanAcc);
        t1.setName("worker-1");
        GpayThread t2= new GpayThread(adnanAcc);
        t2.setName("worker-2");
        NetBankingThread t3=new NetBankingThread(wasiAcc);
        t3.setName("worker-3");
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
WAIT()

WAIT()method is present in Object class not in Thread as sleep()
wait() method will release the Object lock as soon as it reaches wait() statement
so other thread waiting for lock will get the object lock and the first thred will stay in
wait state .
if other thread does all its work and then call notify() or notifyAll() then the "THREADS WHICH
ARE WAITING WITH THE SAME OBJECT WILL BE NOTIFIED" not all the waiting threads which belongs to different
objects.
Once they are notified they will resume their execution.

notify() vs notifyAll()
notify()  : for example there is object call as adnanAcc on which we have two threads waiting
then Object lock will be gone to third thread which will execute and call notify()
then only "ONE THREAD WHICH IS WAITING ON SAME OBJECT WILL BE NOTIFIED"
which Thread it will notify depends on OS. while other thread still waits.

notifyAll(): for example there is object call as adnanAcc on which we have two threads waiting
then Object lock will be gone to third thread which will execute and call notifyAll()
then "All the THREADS WHICH ARE WAITING ON SAME OBJECT WILL BE NOTIFIED"
THE WAITING THREADS WILL EXECUTE ONE BY ONE.

BY USING wait(),notify(), notifyAll() we achieve Inter THREAD COMMUNICATION.

wait() can only be used inside synchronized block why?
Because meaning of wait() is to give up the lock to the another thread which is in Runnable pool ready to
convert to RUNNING STATE.
but if we dont use synchronized keyword then at first place we will not even acquire the lock
then how can we release the lock ? thats the reason always use wait() inside synchronized block
 */
