package com.company.service;

import com.company.enums.ProductCategory;
import com.company.models.*;


public interface Operation {
    Receipt getReceipt(Order order);
    Cashier getCashier(String name);


    void getCategory();
    void getListCashier();



    Product[] getProductByCategory(String category);
    Product[] getInfo(Product[] products);




    Product getProductByName(String productName);

    Cashier getCashierByName(String cashier);
}
