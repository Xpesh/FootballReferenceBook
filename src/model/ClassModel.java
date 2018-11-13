package model;

import java.util.ArrayList;

public class ClassModel implements Model {
    private ArrayList<Country> countries;
    private ArrayList<FootballClub> footballClubs;
    private ArrayList<Game> games;
    private ArrayList<Judge> judges;
    private ArrayList<Player> players;
    private ArrayList<Transfer> transfers;

    public ClassModel(ArrayList<Country> countries, ArrayList<FootballClub> footballClubs, ArrayList<Game> games,
                      ArrayList<Judge> judges, ArrayList<Player> players, ArrayList<Transfer> transfers) {
        this.countries = countries;
        this.footballClubs = footballClubs;
        this.games = games;
        this.judges = judges;
        this.players = players;
        this.transfers = transfers;
    }

    @Override
    public Country getCountry(String name) {
        for(Country country : countries){
            if(country.getName().equals(name)){
                return country;
            }
        }
        return null;//todo exep
    }


    @Override
    public Country getCountry(int id) {
        return countries.get(id);
    }

    @Override
    public FootballClub getFootballClub(String name) {
        for(FootballClub footballClub : footballClubs){
            if(footballClub.getName().equals(name)){
                return footballClub;
            }
        }
        return null;//todo exep
    }

    @Override
    public FootballClub getFootballClub(int id) {
        return footballClubs.get(id);
    }

    @Override
    public Game getGame(int id) {
        return games.get(id);
    }

    @Override
    public Judge getJudge(int id) {
        return judges.get(id);
    }

    @Override
    public Judge getJudge(String firstName, String secondName) {
        for(Judge judge : judges){
            if(judge.getFirstName().equals(firstName) && judge.getSecondName().equals(secondName)){
                return judge;
            }
        }
        return null;//todo exep
    }

    @Override
    public Player getPlayer(String firstName, String secondName) {
        for(Player player : players){
            if(player.getFirstName().equals(firstName) && player.getSecondName().equals(secondName)){
                return player;
            }
        }
        return null;//todo exep
    }

    @Override
    public Player getPlayer(int id) {
        return players.get(id);
    }

    @Override
    public Transfer getTransfer(int id) {
        return transfers.get(id);
    }
}
