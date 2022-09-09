package com.company;

import com.company.enums.ProductCategory;
import com.company.models.*;
import com.company.service.Operation;
import com.company.service.impl.OperationalImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation operation = new OperationalImpl();
        byte answer =0;

        System.out.println("Добро пожаловать");
        int count = 0;
        Details[] details = new Details[10];

        while(answer!=1) {
            System.out.println("Выберите категорию продуктов");
            operation.getCategory();
            String category = sc.next();
            Product[] products = operation.getProductByCategory(category);
            operation.getInfo(products);
            System.out.println("Выберите продукт");
            String productName = sc.next();
            Product product = operation.getProductByName(productName);
            System.out.println("Выберите количество");
            int amount = sc.nextInt();
            System.out.println("Выберите скидку");
            int discount = sc.nextInt();
            Details detail = new Details(product, amount, discount);

            details[count] = detail;

            System.out.println("Продолжить 1 - нет, 0 - да");

            answer = sc.nextByte();
            count++;
        }

        for(Details item: details){
            if(item!=null)
                System.out.println(item);
        }


        /*for(Cashier item:cashiers){
            if(item!=null)
                System.out.println(item);
        }*/

        System.out.println("Выберите кассира");
        String cashier = sc.next();
        Cashier res = operation.getCashierByName(cashier);


        Order order = new Order();
        order.setDetails(details);
        order.setCashier(res);

    }
}