package com.company;

public class ConsoleFactory {
    public Console makeConsole(String newConsoleType){
        Console newConsole = null;

        if (newConsoleType.equals("P")){
            return new PS4();
        } else
        if (newConsoleType.equals("X")){
            return new XboxOne();
        } else
        if (newConsoleType.equals("S")){
            return new Switch();
        } else
        if (newConsoleType.equals("PP")){
            return new PS4Pro();
        } else return null;
    }

    public Controller buyOption(String optionType) {
        if (optionType.equals("Y")) {
            // Ik roep nu PS4 aan, maar dit moet het type console zijn dit in makeConsole is gekozen
            Shop controllerConsole = new Controller(new PS4());

            System.out.println("Products: " + controllerConsole.getName());

            System.out.println("Price: " + controllerConsole.getCost());
            return new Controller(new PS4());
        } else
        if (optionType.equals("N")) {
            // Hier roep ik wederom PS4 aan terwijl dit ook een andere console kan zijn
            Shop basicConsole = new PS4();

            System.out.println("Products: " + basicConsole.getName());

            System.out.println("Price: " + basicConsole.getCost());
            // Return gekozen console geen null
            return null;
        } else return null;
    }
}
