package model;

import java.util.ArrayList;

public class FootballClub {
    private String name;
    private String league;
    private double budget;
    private Country country;
    private ArrayList<Player> players;

    public FootballClub(String name, String league, double budget, Country country, ArrayList<Player> players) {
        this.name = name;
        this.league = league;
        this.budget = budget;
        this.country = country;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
