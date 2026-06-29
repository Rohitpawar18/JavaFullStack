package com.Day4.IPL;

public class Team {
	private String teamName;
	private Player[] players;
	
	public Team(String teamName, Player[] players) {
		this.teamName = teamName;
		this.players = players;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public Player[] getPlayers() {
		return players;
	}
}
