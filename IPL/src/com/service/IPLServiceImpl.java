package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.model.Player;
import com.model.Team;
import com.util.CSVReader;

public class IPLServiceImpl implements IPLService{
	
	private Map<Team, List<Player>> teamMap = new HashMap<>();

//	@Override
//	public void addTeam(Team team) {
//		
//		teamMap.put(team, new ArrayList<>());
//	}
//
//	@Override
//	public void addPlayerToTeam(Team team, Player player) {
//		
//		player.setTeamName(team.getTeamName());
//		
//		teamMap.get(team).add(player);
//	}
	
	@Override
	public void loadPlayers(String fileName) {
		
		List<Player> players = CSVReader.loadPlayers(fileName);
		
		for(Player p : players) {
			Team team = new Team(p.getTeamName());
			
			teamMap.putIfAbsent(team, new ArrayList<>());
			
			teamMap.get(team).add(p);
		}
	}

	@Override
	public void searchTeam(String teamName) {
		
//		for(Map.Entry<Team, List<Player>> entry : teamMap.entrySet()) {
//			
//			Team team = entry.getKey();
//			if(team.getTeamName().equalsIgnoreCase(teamName)) {
//				System.out.println("\nTeam : " + team.getTeamName());
//				
//				for(Player p : entry.getValue()) {
//					System.out.println(p);
//				}
//				return;
//			}
//		}
//		System.out.println("Team not found");
		
		
		Optional<Map.Entry<Team, List<Player>>> result = 
				teamMap.entrySet()
					   .stream()
					   .filter(entry -> entry.getKey().getTeamName().equalsIgnoreCase(teamName))
					   .findFirst();
		if(result.isPresent()) {
			System.out.println("\n========== TEAM DETAILS ==========");
			System.out.println("Team : " + result.get().getKey());
			
			result.get()
				  .getValue()
				  .forEach(System.out::println);
		}else {
			System.out.println("Team Not Found.");
		}
	}

	@Override
	public void searchPlayer(String playerName) {
		
//		for(Map.Entry<Team, List<Player>> entry : teamMap.entrySet()) {
//			
//			for(Player p : entry.getValue()) {
//				if(p.getName().equalsIgnoreCase(playerName)) {
//					System.out.println(p);
//					return;
//				}
//			}
//		}
//		System.out.println("Player not found");
		
		Optional<Player> player = teamMap.values().stream()
												.flatMap(List::stream)
												.filter(p -> p.getRole().equalsIgnoreCase(playerName))
												.findFirst();
		
		if(player.isPresent()) {
			System.out.println(player.get());
		}else {
			System.out.println("Player Not Found");
		}
	}


	@Override
	public void searchByRole(String role) {
		
		List<Player> players = teamMap.values()
									  .stream()
									  .flatMap(List::stream)
									  .filter(p -> p.getRole().equalsIgnoreCase(role))
									  .collect(Collectors.toList());
		
		if(players.isEmpty()) {
			System.out.println("N Player Found.");
		}else {
			players.forEach(System.out::println);
		}
	}

	@Override
	public void displayAllTeams() {
		
		teamMap.keySet().stream().forEach(System.out::println);
	}
	
	
}
