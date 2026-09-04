package com.adnan.multithreading.ExecutorService6.FixedThreadPool1;

public class SendingEmail implements Runnable{
    private Customer c;
    public SendingEmail(Customer c){
        this.c = c;
    }
    @Override
    public void run() {
        sendEmail(c);
    }
    public void sendEmail(Customer c){
        StringBuffer st = new StringBuffer();
        st.append("Hi: "+c.getCustomerName()+" your policy with policy number: "+c.getPolicyNumber());
        st.append("is going to expire in 1 month amount to be paid: "+c.getPremiumPrice());
        System.out.println(st);
        //Code to trigger mail using JAVA MAIL API
    }
}
