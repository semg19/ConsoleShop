package com.company;

public class Controller extends ConsoleDecorator {

    public Controller(Console newConsole) {

        super(newConsole);
    }


    public String getName(){

        return tempConsole.getName() + " and controller";

    }

    public double getCost(){

        System.out.println("Cost of controller: € " + 50.00);

        return tempConsole.getCost() + 50.00;

    }

}
