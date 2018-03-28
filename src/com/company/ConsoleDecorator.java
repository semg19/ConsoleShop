package com.company;

abstract class ConsoleDecorator extends Console implements ConsoleInterface {

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
