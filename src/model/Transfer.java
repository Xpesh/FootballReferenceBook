package model;

import java.util.Calendar;

public class Transfer {
    private FootballClub club1;
    private FootballClub club2;
    private double cost;
    private Player player;
    private Calendar date;

    public Transfer(FootballClub club1, FootballClub club2, double cost, Player player, Calendar date) {
        this.club1 = club1;
        this.club2 = club2;
        this.cost = cost;
        this.player = player;
        this.date = date;
    }

    public FootballClub getClub1() {
        return club1;
    }

    public void setClub1(FootballClub club1) {
        this.club1 = club1;
    }

    public FootballClub getClub2() {
        return club2;
    }

    public void setClub2(FootballClub club2) {
        this.club2 = club2;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
