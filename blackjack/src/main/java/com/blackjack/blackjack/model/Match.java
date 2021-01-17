package com.blackjack.blackjack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity	
@Table(name= "Partida")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable= false)
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="isWinner")
	private boolean isWinner;
	
	@Column(name="point")
	private int point;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cards")
	private int cards;
	
	public boolean isWinner() {
		return isWinner;
	}
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCards() {
		return cards;
	}
	public void setCards(int cards) {
		this.cards = cards;
	}
	
	
	
	
}
