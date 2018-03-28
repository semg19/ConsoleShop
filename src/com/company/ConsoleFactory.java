package com.company;

public class ConsoleFactory {

    public Console makeConsole(String newConsoleType, String optionType){
        Console newConsole = null;

        optionType = optionType.toLowerCase();

        switch (newConsoleType) {
            case "p":
                if (optionType.equals("y")) {
                    return new Controller(new PS4());
                }
                System.out.println(optionType);
                return new PS4();
            case "x":
                if (optionType.equals("y")) {
                    return new Controller(new XboxOne());
                }
                return new XboxOne();
            case "s":
                if (optionType.equals("y")) {
                    return new Controller(new Switch());
                }
                return new Switch();
            case "pp":
                if (optionType.equals("y")) {
                    return new Controller(new PS4Pro());
                }
                return new PS4Pro();
            default:
                return null;
        }
    }
}
