package com.company;

import java.util.Hashtable;
import java.util.Iterator;

public class SwitchGames implements GameIterator{

    Hashtable<Integer, GameInfo> bestGames = new Hashtable<Integer, GameInfo>();


    int hashKey = 0;

    public SwitchGames() {

        addGame("Super Mario Odyssey", 2017);
        addGame("The Legend of Zelda: Breath of the Wild", 2017);

    }


    public void addGame(String gameName, int yearReleased){

        GameInfo gameInfo = new GameInfo(gameName, yearReleased);

        bestGames.put(hashKey, gameInfo);

        hashKey++;

    }

    public Iterator createIterator() {
        return bestGames.values().iterator();
    }

}
