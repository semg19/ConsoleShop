package com.company;

public abstract class Console implements ConsoleInterface {
    private String name;
    private double cost;

    public String getName() { return name; }

    public void setName(String newName) { name = newName; }

    protected void setCost(Double newCost) {
        if (newCost > 0) {
            cost = newCost;
        } else {
            System.out.println("Price mus be higher than € 0");
        }
    }

    public double getCost() {
        return cost;
    }

}
