package com.company.models;

public class ReceiptDetails {

    private Order[] order;
    private double sum;

    public ReceiptDetails(Order[] order, double sum) {
        this.order = order;
        this.sum = sum;
    }

    public ReceiptDetails() {
    }

    public Order[] getOrder() {
        return order;
    }

    public void setOrder(Order[] order) {
        this.order = order;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
