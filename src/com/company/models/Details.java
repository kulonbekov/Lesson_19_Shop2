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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Details{" +
                "product = " + product.getName() +
                " cost = " + product.getCost()+
                ", amount = " + amount +
                ", discount = " + discount +
                '}';
    }
}
