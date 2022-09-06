package com.company;

import com.company.enums.ProductCategory;
import com.company.models.Product;
import com.company.service.Operation;
import com.company.service.impl.OperationalImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation operation = new OperationalImpl();


        System.out.println("Добро пожаловать");
        System.out.println("Выберите категорию продуктов");
        operation.getCategory();
        String category = sc.next();
        Product[] products = operation.getProductByCategory(category);
        operation.getInfo(products);

    }
}