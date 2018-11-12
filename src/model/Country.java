package model;

import java.util.ArrayList;

public class Country {
    private String name;
    private String president;
    private String capital;
    private ArrayList<FootballClub> footballClubs;

    public Country(String name, String president, String capital, ArrayList<FootballClub> footballClubs) {
        this.name = name;
        this.president = president;
        this.capital = capital;
        this.footballClubs = footballClubs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<FootballClub> getFootballClubs() {
        return footballClubs;
    }

    public void setFootballClubs(ArrayList<FootballClub> footballClubs) {
        this.footballClubs = footballClubs;
    }
}
