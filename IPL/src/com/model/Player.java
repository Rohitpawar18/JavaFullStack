package com.model;

public class Player {
	private String name;
	private int jerseyNo;
	private String teamName;
	private double bidAmount;
	private String role;
	
	public Player(String name, int jerseyNo, double bidAmount, String teamName, String role) {
		this.name = name;
		this.jerseyNo = jerseyNo;
		this.bidAmount = bidAmount;
		this.teamName = teamName;
		this.role = role;	
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

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyNo=" + jerseyNo + ", teamName=" + teamName + ", bidAmount=" + bidAmount
				+ ", role=" + role + "]";
	}

	
	
}
