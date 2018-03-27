package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class XboxOneGames implements GameIterator{

    GameInfo[] bestGames;

    int arrayValue = 0;

    public XboxOneGames() {

        bestGames = new GameInfo[2];

        addGame("Halo Wars 2", 2017);
        addGame("PlayerUnknown's Battlegrounds", 2017);

    }

    public void addGame(String gameName, int yearReleased){

        GameInfo game = new GameInfo(gameName, yearReleased);

        bestGames[arrayValue] = game;

        arrayValue++;

    }

    public Iterator createIterator() {
        return Arrays.asList(bestGames).iterator();
    }

}
