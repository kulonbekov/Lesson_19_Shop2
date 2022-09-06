package com.company.models;

public class Details {

    private Product product;
    private int amount;
    private double discount;

    public Details(Product product, int amount, double discount) {
        this.product = product;
        this.amount = amount;
        this.discount = discount;
    }
}
