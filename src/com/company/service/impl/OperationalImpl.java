package com.company.service.impl;

import com.company.enums.*;
import com.company.models.*;
import com.company.products.*;
import com.company.service.Operation;
import com.sun.org.apache.xpath.internal.operations.Or;


public class OperationalImpl implements Operation {

    Sugar sugar = new Sugar("Сахар",60, Measure.KG,ProductCategory.DAIRY);
    Bread bread = new Bread("Лепешка",61, Measure.PSC,ProductCategory.BAKERY);
    Milk milk = new Milk("Молоко",70,Measure.LI,ProductCategory.DAIRY);
    Water water = new Water("Вода",71,Measure.LI,ProductCategory.DRINKABLES);

    Product[] products = {sugar,milk,bread,water};

    Cashier cashiers1 = new Cashier("Кассир_1", "cashier11", (byte)25 ,11);
    Cashier cashiers2 = new Cashier("Кассир_2", "cashier22", (byte)22 ,12);

    Cashier[] cashiers = {cashiers1,cashiers2};



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
    public Product getProductByName(String productName) {
        for (Product item:products){
            if(productName.equals(item.getName())){
                return item;
            }
        }
        return null;
    }
    @Override
    public  Product[] getInfo(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName() + " " + products[i].getCost());
            }
        }
        return null;
    }

    @Override
    public Cashier getCashierByName(String cashier) {
        for(Cashier item:cashiers){
            if(item.getName().equals((cashier))){
                return item;
            }
        }
        return null;
    }
    @Override
    public void getListCashier() {
        for (int i = 0; i < cashiers.length; i++) {
            System.out.println(cashiers[i].getName());
        }

    }
    @Override
    public Receipt getReceipt(Order order) {
        Details[] details = order.getDetails();
        for (int i = 0; i < 10; i++) {
            System.out.println(details[i].getProduct().getName());
            double cost = details[i].getProduct().getCost();
            double discount = details[i].getDiscount();
            double amount = details[i].getAmount();
            double res = (cost * amount)- (((cost * amount)*discount)/100);
            System.out.println(res);

        }

        return null;
    }
}


/*Details[] details = order.getDetails();
        for (int i = 0; i < 10; i++) {
            details[i].setProduct(details);
            System.out.println(details[i].getProduct().getName());
            double cost = details[i].getProduct().getCost();
            double discount = details[i].getDiscount();
            double amount = details[i].getAmount();
            double res = (cost * amount)- (((cost * amount)*discount)/100);
            System.out.println(res);

        }*/