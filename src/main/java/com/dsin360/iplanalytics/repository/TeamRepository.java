package com.dsin360.iplanalytics.repository;

import java.util.List;

import com.dsin360.iplanalytics.model.Team;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {
  
  Team findByTeamName(String name);

  @Query("SELECT DISTINCT p.teamName FROM Team p")
  List<String> findAllTeams();
}
