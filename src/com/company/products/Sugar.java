package com.company.products;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;
import com.company.models.Product;

public class Sugar extends Product {
    public Sugar(String name, double cost, Measure measure, ProductCategory productCategory) {
        super(name, cost, measure,productCategory);
    }

}
