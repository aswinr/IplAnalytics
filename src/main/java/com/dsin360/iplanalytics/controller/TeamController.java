package com.dsin360.iplanalytics.controller;

import java.util.List;

import com.dsin360.iplanalytics.model.Team;
import com.dsin360.iplanalytics.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TeamController {

  @Autowired
  TeamRepository teamRepository;

  @GetMapping("team/{teamName}")
  public Team getTeamByName(@PathVariable String teamName){
    return teamRepository.findByTeamName(teamName);
  }

  @GetMapping("teams")
  public List<String> getAllTeams(){
    return teamRepository.findAllTeams();
  }

  
}
