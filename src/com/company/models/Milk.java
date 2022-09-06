package com.company.models;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;

public class Milk extends  Product{
    public Milk(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure, productCategory);
    }
}
