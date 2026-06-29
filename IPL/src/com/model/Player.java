package com.model;

public class Player {
	private String name;
	private int jerseyNo;
	private String teamName;
	private double bidAmount;
	
	public Player(String name, int jerseyNo, double bidAmount) {
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.bidAmount = bidAmount;
	}

	public String getName() {
		return name;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public double getBidAmount() {
		return bidAmount;
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyNo=" + jerseyNo + ", teamName=" + teamName + ", bidAmount=" + bidAmount
				+ "]";
	}
	
	
}
