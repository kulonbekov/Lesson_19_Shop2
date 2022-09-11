package com.company.enums;

public enum ProductCategory {

    BAKERY("Хлебобулочные изделия"),
    DRINKABLES("Напитки"),
    DAIRY("Молочные");

    String name;


    ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
