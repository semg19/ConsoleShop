package com.company;

import java.util.Scanner;

public class ConsoleTesting {

    public static void main(String[] args){

        ConsoleFactory consoleFactory = new ConsoleFactory();

        Console theConsole = null;

        Controller theController = null;

        Scanner userInput = new Scanner(System.in);

        PS4Games ps4Games = new PS4Games();
        XboxOneGames xboxOneGames = new XboxOneGames();
        SwitchGames switchGames = new SwitchGames();

        AllGames testGame = new AllGames(ps4Games, xboxOneGames, switchGames);

        testGame.showTheGames();

        System.out.print("What type of console do you want? You can take a look at the exclusive games to make the best choice. (p / pp / x / s)");

        if (userInput.hasNextLine()) {
            String typeOfConsole = userInput.nextLine();

            String optionType = "n";

            System.out.println("Do you want to add a controller? (y / n)");
            if (userInput.hasNextLine()) {
                optionType = userInput.nextLine();
                if (optionType.equals("y")) {
                    optionType = "y";
                }
            }

            theConsole = consoleFactory.makeConsole(typeOfConsole, optionType);

            if (theConsole == null) {
                System.out.print("Enter a p, pp, x or s next time");
            } else {
                System.out.println(theConsole.getName() + " is added to your shopping basket");
                System.out.println("The total price is: € " + theConsole.getCost());
                System.out.println("Your order is successfully processed");
            }
        }

    }

}
