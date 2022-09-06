package com.company.models;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;

public class Bread extends Product{
    public Bread(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure,productCategory);
    }
}
