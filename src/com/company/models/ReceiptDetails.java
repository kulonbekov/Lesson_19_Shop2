package com.company.models;

public class ReceiptDetails {

    private String name;
    private double sum;

    public ReceiptDetails(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }

    public ReceiptDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return
                "названия = " + name +
                ", сумма = " + sum
                ;
    }
}
