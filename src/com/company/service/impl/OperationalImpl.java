package com.company.service.impl;

import com.company.enums.Measure;
import com.company.enums.ProductCategory;
import com.company.models.*;
import com.company.service.Operation;

public class OperationalImpl implements Operation {

    Sugar sugar = new Sugar("Сахар",61, Measure.KG,ProductCategory.DAIRY);
    Sugar kola = new Sugar("Кока-кола",61, Measure.KG,ProductCategory.DRINKABLES);
    Milk milk = new Milk("Молоко",71,Measure.LI,ProductCategory.DAIRY);
    Milk water = new Milk("Вода",71,Measure.LI,ProductCategory.DRINKABLES);

    Product[] products = {sugar,milk,kola,water};

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


}
