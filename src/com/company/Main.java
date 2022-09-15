package com.company;


import com.company.models.*;
import com.company.service.Operation;
import com.company.service.impl.OperationalImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation operation = new OperationalImpl();
        byte answer = 0;
        Double doubleSum = 0.0;
        System.out.println("Добро пожаловать");
        int count = 0;
        int amount = 0;
        int discount = 0;
        String productName;
        Details[] details = new Details[10];

        while(answer!=1) {
            System.out.println();
            System.out.println("Выберите категорию продуктов: ");

            operation.getCategory();

            String category = sc.next();
            try {
                Product[] products = operation.getProductByCategory(category);
                operation.getInfo(products);
            }catch (IllegalArgumentException i) {
                System.out.println("Ошибка! Выберите правильную категорию продуктов");
                continue;
            }
            System.out.println("\n"+"Выберите продукт");

            productName = sc.next();

            Product product = operation.getProductByName(productName);

            System.out.println("\n" + "Количество");
            try {
                amount = sc.nextInt();
            }catch (InputMismatchException i){
                System.out.println("Ошибка! Введите числовые данные");
                continue;
            }


            System.out.println("\n" + "Скидка (процент)");
            try{
                discount = sc.nextInt();
            }catch (InputMismatchException i){
                System.out.println("Ошибка! Введите числовые данные");
                continue;
            }


            Details detail = new Details(product, amount, discount);

            details[count] = detail;
            try {
                doubleSum = doubleSum + ((amount * product.getCost()) - ((product.getCost() * discount)/100));
            }catch (NullPointerException n){
                System.out.println("Ошибка! Названия продукта не совпадает");
                continue;
            }


            System.out.println("\n" + "Продолжить 1 - нет, 0 - да");

            answer = sc.nextByte();
            count++;

        }

        System.out.println("\n" + "Наименование товаров:");
        try {
            for(Details item: details){
                if(item!=null)
                    System.out.println(item);
            }
        }catch (NullPointerException n){
            System.out.println("Ошибка! Названия продукта не совпадает");
        }

        System.out.println("\n" + "Кассиры: ");
        operation.getListCashier();

        System.out.println("\n" + "Введите имя кассира: ");
        String cashier = sc.next();
        Cashier res = operation.getCashierByName(cashier);

        Order order = new Order();
        order.setDetails(details);
        order.setCashier(res);
        try {
            Receipt receipt = operation.getReceipt(order);
            operation.getInfo(receipt, receipt.getReceiptDetails());
        }catch (NullPointerException n) {
            throw new NullPointerException("Ошибка! Введенные вами данные не правильные");
        }






    }
}