package com.company;

import java.util.Iterator;

public class AllGames {

    private GameIterator iterps4Games;
    private GameIterator iterxboxGames;
    private GameIterator iterswitchGames;

    public AllGames(GameIterator newGamesPS4, GameIterator newGamesXbox, GameIterator newGamesSwitch) {

        iterps4Games = newGamesPS4;
        iterxboxGames = newGamesXbox;
        iterswitchGames = newGamesSwitch;

    }

    public void showTheGames(){
        Iterator PS4Games = iterps4Games.createIterator();
        Iterator XboxOneGames = iterxboxGames.createIterator();
        Iterator SwitchGames = iterswitchGames.createIterator();

        System.out.println("PS4 (p / pp)\n");
        printTheGames(PS4Games);

        System.out.println("Xbox One (x)\n");
        printTheGames(XboxOneGames);

        System.out.println("Switch (s)\n");
        printTheGames(SwitchGames);
    }

    public void printTheGames(Iterator iterator){

        while(iterator.hasNext()){

            GameInfo gameInfo = (GameInfo) iterator.next();

            System.out.println(gameInfo.getGameName());
            System.out.println(gameInfo.getYearReleased() + "\n");

        }

    }

}
