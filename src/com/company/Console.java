package com.company;

public abstract class Console implements ConsoleInterface {
    private String name;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

}
