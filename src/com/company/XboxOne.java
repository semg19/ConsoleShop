package com.company;

public class XboxOne extends Console {
    public XboxOne() {
        setName("Xbox One");
    }

    public double getCost() {
        System.out.println("Cost of console: " + 300.00);
        return 300.00;
    }
}
