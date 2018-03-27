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

        System.out.print("What type of console do you want? You can take a look at the exclusive games to make a better choice. (P / PP / X / S)");

        if (userInput.hasNextLine()){
            String typeOfConsole = userInput.nextLine();

            theConsole = consoleFactory.makeConsole(typeOfConsole);

            if (theConsole != null){
                showConsole(theConsole);

                System.out.print("Do you want to add a controller? (Y / N)");

                if (userInput.hasNextLine()) {
                    String typeOfController = userInput.nextLine();

                    theController = consoleFactory.buyOption(typeOfController);
                    if (theController != null) {
                        showController(theController);
                    } else System.out.println("Enter a Y or N next time");
                }
            } else System.out.println("Enter a P, PP, X or S next time");
        }


    }

    public static void showConsole(Console anConsole){
        anConsole.displayConsole();
    }

    public static void showController(Controller anController){
        anController.displayController();
    }

}
