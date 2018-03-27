package com.company;

public class GameInfo {

    String gameName;
    int yearReleased;

    public GameInfo(String newGameName, int newYearReleased){

        gameName = newGameName;
        yearReleased = newYearReleased;

    }

    public String getGameName(){ return gameName; }
    public int getYearReleased(){ return yearReleased; }

}
