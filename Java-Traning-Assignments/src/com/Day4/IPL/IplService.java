package com.Day4.IPL;

public class IplService {
	private Team[] teams;
	
	public IplService(Team[] teams) {
		this.teams = teams;
	}
	
	//Serach Team
	public void searchByTeam(String teamName) {
		for(Team team : teams) {
			if(team.getTeamName().equalsIgnoreCase(teamName)) {
				System.out.println("\nPlayers of " + team.getTeamName());
				
				for(Player p : team.getPlayers()) {
					System.out.println(p.getName() + " --> Rs." + p.getBidAmount() + " Crore");
				}
				return;
			}
		}
		System.out.println("Team Not Found.");
	}
	
	//Search Player
	public void searchByPlayer(String playerName) {
		for(Team team : teams) {
			for(Player p : team.getPlayers()) {
				
				if(p.getName().equalsIgnoreCase(playerName)) {
					
					System.out.println("\nPlayer Name : " + p.getName());
					System.out.println("Team         : " + p.getTeamName());
					System.out.println("Bid Amouont  : Rs." + p.getBidAmount() + " Crore");
					
					return;
				}
			}
		}
		System.out.println("Player Not Found.");
	}
}
