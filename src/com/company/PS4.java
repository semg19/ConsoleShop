package com.company;

public class PS4 extends Console {
    public PS4() {
        setName("PS4");
    }

    public double getCost() {
        System.out.println("Cost of console: € " + 300.00);
        return 300.00;
    }
}
