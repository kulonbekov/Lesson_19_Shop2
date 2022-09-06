package com.company.enums;

public enum ProductCategory {

    //BAKERY("хлебобулочные изделия"),
    //VEGETABLES ("овощи"),
    //FRUIT("фрукты"),
    DRINKABLES("напитки"),
    DAIRY("молочные");

    String name;


    ProductCategory(String name) {
        this.name = name;
    }
}
