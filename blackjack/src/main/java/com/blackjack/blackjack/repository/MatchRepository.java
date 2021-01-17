package com.blackjack.blackjack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackjack.blackjack.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer>{
	

	public List<Match> getByIsWinner(Boolean isWinner);
}
