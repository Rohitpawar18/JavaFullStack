package com.service;

import com.model.Player;
import com.model.Team;

public interface IPLService {
	
//	void addTeam(Team team);
	
//	void addPlayerToTeam(Team team, Player player);
	
	void loadPlayers(String fileName);
	
	void searchTeam(String teamName);
	
	void searchPlayer(String playerName);
	
	void searchByRole(String role);
	
	void displayAllTeams();
}
