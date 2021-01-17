package com.blackjack.blackjack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackjack.blackjack.model.Match;
import com.blackjack.blackjack.repository.MatchRepository;

@Controller
@RequestMapping(value = "blackjack")
public class MatchController {

	@Autowired
	private MatchRepository matchRepository;
	
	@PutMapping("/partida")
	public ResponseEntity<Boolean> addNewMatch(@RequestBody Match partida){
		ResponseEntity response = null;
		Match partidaGuardada = this.matchRepository.save(partida);
		
		response = new ResponseEntity<>(partidaGuardada, HttpStatus.ACCEPTED);
		
		if(partida==null){
				response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {	
			if(partidaGuardada==null){
				response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return response;
	}
	
	@GetMapping("/partida/ganadas")
	public ResponseEntity<Boolean> getPartidasGanadas( ){
		
		List<Match> partidaGuardada = this.matchRepository.getByIsWinner(Boolean.TRUE);
		ResponseEntity response =new ResponseEntity<>(partidaGuardada, HttpStatus.ACCEPTED);
	
		return response;
	}
	


}
