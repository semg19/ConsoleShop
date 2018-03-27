package com.company;

public abstract class Console implements Shop {
    private String name;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

    public void displayConsole() {
        System.out.println(getName() + " is the console you want to buy.");
    }

}
