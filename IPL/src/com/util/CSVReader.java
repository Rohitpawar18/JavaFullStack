package com.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.model.Player;

public class CSVReader {
	public static List<Player> loadPlayers(String fileName){
		List<Player> players = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/players.txt"));
			String line;
			
			br.readLine();
			while((line = br.readLine()) != null){
				String[] data = line.split(",");
				
				Player player = new Player(
							data[0],
							Integer.parseInt(data[1]),
							Double.parseDouble(data[2]),
							data[3],
							data[4]
						);
				players.add(player);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return players;
	}
}
