package com.dsin360.iplanalytics.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Match {

  @Id
  private long id;
  private String city;
  private LocalDate date;
  private String playerOfMatch;
  private String venue;
  private String team1;
  private String team2;
  private String tossWinner;
  private String tossDecision;
  private String winner;
  private String result;
  private String resultMargin;
  private String firstUmpire;
  private String secondUmpire;

  @ManyToOne
  @JoinColumn(referencedColumnName = "teamName")
  private Team teamDetails;

  
  public Team getTeamDetails() {
    return teamDetails;
  }
  public void setTeamDetails(Team teamDetails) {
    this.teamDetails = teamDetails;
  }
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }
  public String getPlayerOfMatch() {
    return playerOfMatch;
  }
  public void setPlayerOfMatch(String playerOfMatch) {
    this.playerOfMatch = playerOfMatch;
  }
  public String getVenue() {
    return venue;
  }
  public void setVenue(String venue) {
    this.venue = venue;
  }
  public String getTeam1() {
    return team1;
  }
  public void setTeam1(String team1) {
    this.team1 = team1;
  }
  public String getTeam2() {
    return team2;
  }
  public void setTeam2(String team2) {
    this.team2 = team2;
  }
  public String getTossWinner() {
    return tossWinner;
  }
  public void setTossWinner(String tossWinner) {
    this.tossWinner = tossWinner;
  }
  public String getTossDecision() {
    return tossDecision;
  }
  public void setTossDecision(String tossDecision) {
    this.tossDecision = tossDecision;
  }
  public String getWinner() {
    return winner;
  }
  public void setWinner(String winner) {
    this.winner = winner;
  }
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }
  public String getResultMargin() {
    return resultMargin;
  }
  public void setResultMargin(String resultMargin) {
    this.resultMargin = resultMargin;
  }
  public String getFirstUmpire() {
    return firstUmpire;
  }
  public void setFirstUmpire(String firstUmpire) {
    this.firstUmpire = firstUmpire;
  }
  public String getSecondUmpire() {
    return secondUmpire;
  }
  public void setSecondUmpire(String secondUmpire) {
    this.secondUmpire = secondUmpire;
  }

  
}
