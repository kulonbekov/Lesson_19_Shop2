package com.company.service;

import com.company.enums.ProductCategory;
import com.company.models.Cashier;
import com.company.models.Order;
import com.company.models.Product;
import com.company.models.Receipt;

public interface Operation {
    Receipt getReceipt(Order order);
    Cashier getCashier(String name);


    void getCategory();


    Product[] getProductByCategory(String category);

    ProductCategory[]getCategories();

    void getInfo();


}
