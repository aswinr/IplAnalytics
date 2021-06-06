package com.dsin360.iplanalytics.data;

import java.time.LocalDate;

import com.dsin360.iplanalytics.model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchProcessor implements ItemProcessor<Matchdata, Match> {

  private static final Logger log = LoggerFactory.getLogger(MatchProcessor.class);

  @Override
  public Match process(final Matchdata matchdata) throws Exception {

    Match match = new Match();
    match.setId(Long.parseLong(matchdata.getId()));
    match.setCity(matchdata.getCity());
    match.setDate(LocalDate.parse(matchdata.getDate()));
    match.setFirstUmpire(matchdata.getUmpire1());
    match.setSecondUmpire(matchdata.getUmpire2());
    match.setPlayerOfMatch(matchdata.getPlayer_of_match());
    match.setTossWinner(matchdata.getToss_winner());
    match.setTossDecision(matchdata.getToss_decision());
    match.setWinner(matchdata.getWinner());
    match.setVenue(matchdata.getVenue());
    match.setResult(matchdata.getResult());
    match.setTeam1(matchdata.getTeam1());
    match.setTeam2(matchdata.getTeam2());
    match.setResultMargin(matchdata.getResult_margin());
    log.info(String.valueOf(match.getId()));
    return match;
  }

}