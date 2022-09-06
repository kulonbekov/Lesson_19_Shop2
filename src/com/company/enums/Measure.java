package com.company.enums;

public enum Measure {
    KG("килограмм"),
    LI("литр"),
    SHT("штук");

    String name;

    Measure(String name) {
        this.name = name;
    }
}
