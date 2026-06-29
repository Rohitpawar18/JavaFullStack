package com.Day4.IPL;

import java.util.Scanner;

public class IplMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Team[] teams = DataStore.createTeams();
		
		IplService service = new IplService(teams);
		
		while(true) {
			System.out.println("\n=====IPL Menu=====");
			System.out.println("1. Search Team");
			System.out.println("2. Search Player");
			System.out.println("3. Exit");
			
			System.out.println("Enter Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1 :
					System.out.println("Enter Team Name : ");
					String team = sc.nextLine();
					
					service.searchByTeam(team);
					break;
					
				case 2 :
					System.out.println("Enter Player Name : ");
					String player = sc.nextLine();
					
					service.searchByPlayer(player);
					break;
					
				case 3 :
					System.out.println("Thank You");
					sc.close();
					System.exit(0);
				
				default : 
					System.out.println("Invalid Choice");
			}
		}
	}

}
