package com.adnan.multithreading.ExecutorService6.ScheduledThreadPool3;

import java.util.concurrent.Callable;

public class Task implements Callable<Object>{
    private Customer c;
    public Task(Customer c){
        this.c = c;
    }
    @Override
    public Object call() throws Exception {
        return sendEmail(c);
    }
    private Customer sendEmail(Customer c){
        StringBuffer st = new StringBuffer();
        st.append("Hi: "+c.getCustomerName()+" your policy with policy number: "+c.getPolicyNumber());
        st.append("is going to expire in 1 month amount to be paid: "+c.getPremiumPrice());
        System.out.println(st);
        //Code to trigger mail using JAVA MAIL API
        return c;
    }
}
