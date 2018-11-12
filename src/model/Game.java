package model;

import java.util.Calendar;

public class Game {
    private FootballClub team1;
    private FootballClub team2;
    private int score;
    private Judge judge;
    private Calendar date;

    public Game(FootballClub team1, FootballClub team2, int score, Judge judge, Calendar date) {
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
        this.judge = judge;
        this.date = date;
    }

    public FootballClub getTeam1() {
        return team1;
    }

    public void setTeam1(FootballClub team1) {
        this.team1 = team1;
    }

    public FootballClub getTeam2() {
        return team2;
    }

    public void setTeam2(FootballClub team2) {
        this.team2 = team2;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Judge getJudge() {
        return judge;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
