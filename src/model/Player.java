package model;

public class Player extends Person{
    private FootballClub footballClub;
    private int position;
    private double cost;

    public Player(String firstName, String secondName, String nationality, int age, FootballClub footballClub, int position, double cost) {
        super(firstName, secondName, nationality, age);
        this.footballClub = footballClub;
        this.position = position;
        this.cost = cost;
    }

    public FootballClub getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(FootballClub footballClub) {
        this.footballClub = footballClub;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
