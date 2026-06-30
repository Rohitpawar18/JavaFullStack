package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

	public static void main(String[] args)throws Exception {
		
		
		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
		
		List<Flight> flights = lines.map(line -> {
			String[] record = line.split(",");
			return new Flight(Integer.parseInt(record[0]),
						record[1], record[2], record[3]);
		}).collect(Collectors.toList());
		
//		flights.forEach(System.out::println);
		
		//print details of flight no 123
//		System.out.println(flights.stream().filter(f -> f.getCode() == 123).findFirst().get());
		
		//print all flights by Indigo carrier
//		flights.stream().filter(f -> f.getCarrier().contains("Indigo")).forEach(System.out::println);
		
		//print flight going to pune to delhi
//		flights.stream().filter(f -> f.getSource().contains("Pune") && 
//				f.getDestination().contains("Delhi")).forEach(System.out::println);

		//remove flight no 234
		flights.removeIf(f -> f.getCode() == 234);
		flights.forEach(System.out::println);
	}

}
