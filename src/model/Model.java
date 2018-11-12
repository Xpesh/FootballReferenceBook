package model;

public interface Model {
    Country getCountry(String name);
    Country getCountry(int id);
    FootballClub getFootballClub(String name);
    FootballClub getFootballClub(int id);
    Game getGame(int id);
    Judge getJudge(int id);
    Judge getJudge(String firstName, String secondName);
    Player getPlayer(String firstName, String secondName);
    Player getPlayer(int id);
    Transfer getTransfer(int id);
}
