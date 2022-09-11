package com.company.service.impl;

import com.company.enums.*;
import com.company.models.*;
import com.company.products.*;
import com.company.service.Operation;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Arrays;


public class OperationalImpl implements Operation {

    Sugar sugar = new Sugar("Сахар",60, Measure.KG,ProductCategory.DAIRY);
    Bread bread = new Bread("Лепешка",61, Measure.PSC,ProductCategory.BAKERY);
    Milk milk = new Milk("Молоко",70,Measure.LI,ProductCategory.DAIRY);
    Water water = new Water("Вода",71,Measure.LI,ProductCategory.DRINKABLES);

    Product[] products = {sugar,milk,bread,water};

    Cashier cashiers1 = new Cashier("Алена", "cashier11", (byte)25 ,11);
    Cashier cashiers2 = new Cashier("Саша", "cashier22", (byte)22 ,12);

    Cashier[] cashiers = {cashiers1,cashiers2};



    /*@Override
    public Cashier getCashier(String name) {
        return null;
    }*/
    @Override
    public void getCategory() {
        int count = 1;
        for (ProductCategory item:ProductCategory.values()){
            System.out.println(count + ". " + item + "  (" + item.getName() + ") ");
            count++;
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
        System.out.println("\n" + "Наименование товаров: " + "\n");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(i+1 + "." + products[i].getName() + " "+ "(стомость:" + products[i].getCost()+ " сом)");
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
            System.out.println(i+1 + ". " + cashiers[i].getName());
        }

    }
    @Override
    public Receipt getReceipt(Order order) {
        Receipt receipt=new Receipt();
        Details[] details=order.getDetails();

        double totalSum=0;
        double totalDiscount=0;

        ReceiptDetails[] receiptDetails=new ReceiptDetails[10];

        for (int i=0; i<details.length;i++){
            if(details[i]!=null){

                Product product=details[i].getProduct();

                double cost=product.getCost()*details[i].getAmount();
                double discount=(cost*details[i].getDiscount())/100;
                totalSum=totalSum+(cost-discount);
                totalDiscount=totalDiscount+discount;

                receiptDetails[i]=new ReceiptDetails(product.getName(),cost-discount);
            }
        }


        receipt.setName(order.getCashier().getName());
        receipt.setTotalDiscount(totalDiscount);
        receipt.setReceiptDetails(receiptDetails);
        receipt.setTotalSum(totalSum);

        return receipt;
    }
    @Override
    public Receipt[] getInfo(Receipt receipts, ReceiptDetails[] receiptDetails) {
        System.out.println("\n" + "           GLOBUS         ");
        System.out.println("Касса: 1   " + "Смена: 4   " + "Чек: 55   " + "Имя кассира: " + receipts.getName());
        System.out.println("Наименование товаров: ");
        for (ReceiptDetails item:receiptDetails){
            if (item != null) {
                System.out.println(item);
            }
        }
        System.out.println("Итого без скидки:  =" + (receipts.getTotalSum() + receipts.getTotalDiscount()));
        System.out.println("Скидка: =" + receipts.getTotalDiscount());
        System.out.println("ИТОГ: =" + receipts.getTotalSum());




        return null;
    }
}


