package com.Day4.IPL;

public class DataStore {
	public static Team[] createTeams() {
		Player[] cskPlayers = {
				new Player("Dhoni",12.0,"CSK"),
                new Player("Ruturaj",18.0,"CSK"),
                new Player("Jadeja",16.0,"CSK"),
                new Player("Dube",10.0,"CSK"),
                new Player("Rahul",8.0,"CSK"),
                new Player("Bravis",4.0,"CSK"),
                new Player("Sarfaraz",3.0,"CSK"),
                new Player("Sanju",2.0,"CSK"),
                new Player("Urvil",1.5,"CSK"),
                new Player("Kartik",1.2,"CSK"),
                new Player("Ajinkya",0.5,"CSK")
		};
		
		Player[] miPlayers = {
				new Player("Rohit",16.0,"MI"),
                new Player("Hardik",15.0,"MI"),
                new Player("Bumrah",18.0,"MI"),
                new Player("Surya",17.0,"MI"),
                new Player("Tilak",8.0,"MI"),
                new Player("Quinton",5.0,"MI"),
                new Player("Ryan",4.0,"MI"),
                new Player("Shardul",3.0,"MI"),
                new Player("Naman",2.0,"MI"),
                new Player("Sherfane",1.0,"MI"),
                new Player("Will",0.5,"MI")
		};
		
		Team csk = new Team("CSK", cskPlayers);
		Team mi = new Team("MI", miPlayers);
		
		return new Team[] {csk, mi};
	}
}
