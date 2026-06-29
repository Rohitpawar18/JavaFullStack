package com.Day4.IPL;

public class Player {
	private String name;
	private double bidAmount;
	private String teamName;
	
	public Player(String name, double bidAmount, String teamName) {
		this.name = name;
		this.bidAmount = bidAmount;
		this.teamName = teamName;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBidAmount() {
		return bidAmount;
	}
	
	public String getTeamName() {
		return teamName;
	}
}
