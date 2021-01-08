package demo.sort.comparators;

import java.util.Comparator;

import demo.sort.flight.Flight;

public class FlightNameComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight f1, Flight f2) {
		String n1 = f1.getName();
		String n2 = f2.getName();
		
		return n1.compareToIgnoreCase(n2);
	}

	
	
	

}
