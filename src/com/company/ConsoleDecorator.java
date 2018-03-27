package com.company;

public class ConsoleDecorator implements Shop {

    protected Console tempConsole;

    public ConsoleDecorator(Console newConsole){

        tempConsole = newConsole;

    }

    public String getName() {

        return tempConsole.getName();

    }

    public double getCost() {

        return tempConsole.getCost();

    }

}
