package demo.sort.flight;

import java.util.List;

public class PrintIteration {

	//this prints the flight objects now let's return to main
	public static void printList(List<Flight> flightList) {
		for(Flight f1 : flightList) {
			System.out.println(f1);
		}
	}
}
