package com.app;

import java.util.Scanner;

import com.model.Player;
import com.model.Team;
import com.service.IPLService;
import com.service.IPLServiceImpl;

public class IPLMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IPLService service = new IPLServiceImpl();
		
		service.loadPlayers("players.csv");
//		Team csk = new Team("csk");
//		Team mi = new Team("mi");
		
//		service.addTeam(csk);
//		service.addTeam(mi);
//		
//		service.addPlayerToTeam(csk, new Player("Dhoni", 7, 12));
//		service.addPlayerToTeam(csk, new Player("Jadeja", 8, 7));
//		
//		service.addPlayerToTeam(mi, new Player("Rohit", 45, 18));
//		service.addPlayerToTeam(mi, new Player("Bumrah", 93, 15));
		
		
		while(true) {
			 System.out.println("\n========= IPL MENU =========");
	            System.out.println("1. Search Team");
	            System.out.println("2. Search Player");
	            System.out.println("3. Search By Role");
	            System.out.println("4. Display All Teams");
	            System.out.println("5. Exit");
            
            System.out.println("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            	case 1 :
            		System.out.print("Enter Team Name : ");
            		service.searchTeam(sc.nextLine());
            		break;
            	
            	case 2 : 
            		System.out.print("Enter Player Name : ");
            		service.searchPlayer(sc.nextLine());
            		break;
            		
            	case 3 :
            		System.out.println("Enter Role : ");
            		service.searchByRole(sc.nextLine());
            		break;
            	
            	case 4 :
            		service.displayAllTeams();
            		break;
            		
            	case 5 :
            		System.out.println("Thank You");
            		sc.close();
            		System.exit(0);
            		
            	default :
            		System.out.println("Invalid Choice");
            }
		}
	}

}
