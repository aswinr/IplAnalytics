package com.dsin360.iplanalytics.model;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Team implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String teamName;
  private long totalMatches;
  private long totalWins;

  @JsonIgnore
  @OneToMany(fetch=FetchType.EAGER)
  @JoinColumn(name="team1",referencedColumnName = "teamName")
  private Set<Match> inningsOne;

  @JsonIgnore
  @OneToMany(fetch=FetchType.EAGER)
  @JoinColumn(name="team2",referencedColumnName = "teamName")
  private Set<Match> inningsTwo;

  @Transient
  private Set<Match> allMatches;


  public Set<Match> getAllMatches(){
    Set<Match> result = new HashSet<>(inningsOne);
        result.addAll(inningsTwo);
        result= result.stream().sorted(Comparator.comparing(Match::getDate, Comparator.nullsLast(Comparator.reverseOrder()))).limit(3).collect(Collectors.toSet());
        return result;
  }



  public Set<Match> getInningsOne() {
    return inningsOne;
  }

  public void setInningsOne(Set<Match> inningsOne) {
    this.inningsOne = inningsOne;
  }

  public Set<Match> getInningsTwo() {
    return inningsTwo;
  }

  public void setInningsTwo(Set<Match> inningsTwo) {
    this.inningsTwo = inningsTwo;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public long getTotalMatches() {
    return totalMatches;
  }

  public void setTotalMatches(long totalMatches) {
    this.totalMatches = totalMatches;
  }

  public long getTotalWins() {
    return totalWins;
  }

  public void setTotalWins(long totalWins) {
    this.totalWins = totalWins;
  }

  public Team(String teamName, long totalMatches) {
    this.teamName = teamName;
    this.totalMatches = totalMatches;
  }

  public Team(long id, String teamName, long totalMatches, long totalWins) {
    this.id = id;
    this.teamName = teamName;
    this.totalMatches = totalMatches;
    this.totalWins = totalWins;
  }

  public Team() {
    super();
  }

}
