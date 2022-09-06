package com.company.enums;

public enum Measure {
    KG("килограмм"),
    LI("литр"),
    PSC("штук");

    String name;

    Measure(String name) {
        this.name = name;
    }
}
