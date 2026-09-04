package com.adnan.multithreading.ExecutorService6.FixedThreadPool1;

public class Customer {
    private String customerName;
    private String policyNumber;
    private double premiumPrice;

    public Customer(String customerName, String policyNumber, double premiumPrice) {
        this.customerName = customerName;
        this.policyNumber = policyNumber;
        this.premiumPrice = premiumPrice;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPremiumPrice() {
        return premiumPrice;
    }
}
