package com.company.products;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;
import com.company.models.Product;

public class Water extends Product {
    public Water(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure,productCategory);
    }
}