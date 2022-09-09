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
    void getListCashier();



    Product[] getProductByCategory(String category);
    Product[] getInfo(Product[] products);

    ProductCategory[]getCategories();


    Product getProductByName(String productName);

    Cashier getCashierByName(String cashier);
}
