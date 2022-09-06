package com.company.service.impl;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;
import com.company.models.*;
import com.company.service.Operation;

public class OperationalImpl implements Operation {

    Sugar sugar = new Sugar("Сахар",61, Measure.KG,ProductCategory.DAIRY);
    Bread bread = new Bread("Кока-кола",61, Measure.KG,ProductCategory.BAKERY);
    Milk milk = new Milk("Молоко",71,Measure.LI,ProductCategory.DAIRY);
    Water water = new Water("Вода",71,Measure.LI,ProductCategory.DRINKABLES);

    Product[] products = {sugar,milk,bread,water};

    @Override
    public Receipt getReceipt(Order order) {
        return null;
    }

    @Override
    public Cashier getCashier(String name) {
        return null;
    }

    @Override
    public void getCategory() {
        for (ProductCategory item:ProductCategory.values()){
            System.out.println(item.name());
        }
    }

    @Override
    public Product[] getProductByCategory(String category) {
        Product[] result = new Product[10];

            for(int i=0;i<products.length; i++){
                if(products[i].getProductCategory().equals(ProductCategory.valueOf(category))) {
                    result[i] = products[i];
                }

            }


        return result;
    }

    @Override
    public ProductCategory[] getCategories() {
        return new ProductCategory[0];
    }

    @Override
    public void getInfo() {

        /*for (int i=0;i< products.length;i++){
            if(products[i] != null) {
                System.out.println(products[i].getName() + " " + products[i].getCost());
            }
        }*/
    }






}
