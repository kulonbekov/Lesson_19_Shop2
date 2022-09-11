package com.company;


import com.company.models.*;
import com.company.service.Operation;
import com.company.service.impl.OperationalImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation operation = new OperationalImpl();
        byte answer = 0;
        Double doubleSum = 0.0;
        System.out.println("Добро пожаловать");
        int count = 0;
        Details[] details = new Details[10];

        while(answer!=1) {
            System.out.println();
            System.out.println("Выберите категорию продуктов: ");
            operation.getCategory();

            String category = sc.next();

            Product[] products = operation.getProductByCategory(category);

            operation.getInfo(products);

            System.out.println("\n"+"Выберите продукт");

            String productName = sc.next();

            Product product = operation.getProductByName(productName);

            System.out.println("\n" + "Количество");

            int amount = sc.nextInt();

            System.out.println("\n" + "Скидка (процент)");

            int discount = sc.nextInt();

            Details detail = new Details(product, amount, discount);

            details[count] = detail;

            System.out.println("\n" + "Продолжить 1 - нет, 0 - да");

            answer = sc.nextByte();
            count++;
            doubleSum = doubleSum + ((amount * product.getCost()) - ((product.getCost() * discount)/100));
        }

        System.out.println("\n" + "Наименование товаров: ");
        for(Details item: details){
            if(item!=null)
                System.out.println(item);
        }
        System.out.println("\n" + "Кассиры: ");
        operation.getListCashier();

        System.out.println("\n" + "Введите имя кассира: ");
        String cashier = sc.next();
        Cashier res = operation.getCashierByName(cashier);

        Order order = new Order();
        order.setDetails(details);
        order.setCashier(res);

        Receipt receipt = operation.getReceipt(order);

        operation.getInfo(receipt, receipt.getReceiptDetails());

    }
}