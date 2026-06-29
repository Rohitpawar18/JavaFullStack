package com.app;

import java.util.Scanner;

import com.model.Player;
import com.model.Team;
import com.service.IPLService;
import com.service.IPLServiceImpl;

public class IPLMain {

	public static void main(String[] args) {

		IPLService service = new IPLServiceImpl();
		
		Team csk = new Team("csk");
		Team mi = new Team("mi");
		
		service.addTeam(csk);
		service.addTeam(mi);
		
		service.addPlayerToTeam(csk, new Player("Dhoni", 7, 12));
		service.addPlayerToTeam(csk, new Player("Jadeja", 8, 7));
		
		service.addPlayerToTeam(mi, new Player("Rohit", 45, 18));
		service.addPlayerToTeam(mi, new Player("Bumrah", 93, 15));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n1.Search Team");
            System.out.println("2.Search Player");
            System.out.println("3.Exit");
            
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
            		sc.close();
            		System.exit(0);
            		
            	default :
            		System.out.println("Invalid Choice");
            }
		}
	}

}
