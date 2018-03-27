package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class PS4Games implements GameIterator{

    ArrayList<GameInfo> bestGames;

    public PS4Games() {

        bestGames = new ArrayList<GameInfo>();

        addGame("That’s You!", 2017);
        addGame("Knowledge is Power", 2017);

    }

    public void addGame(String gameName, int yearReleased){

        GameInfo gameInfo = new GameInfo(gameName, yearReleased);

        bestGames.add(gameInfo);

    }

    public Iterator createIterator() {
        return bestGames.iterator();
    }

}
