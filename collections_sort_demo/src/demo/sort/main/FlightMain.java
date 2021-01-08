package demo.sort.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import demo.sort.comparators.FlightNameComparator;
import demo.sort.flight.Flight;
import demo.sort.flight.PrintIteration;

public class FlightMain {

	public static void main(String[] args) {
		//create list arraylist
		List<Flight> flightList = new ArrayList<Flight>();
		
		//append some Flight objects
		flightList.add(new Flight(23, "John Doe", "AlpahaLines", 245.99, 3.6f, true));
		flightList.add(new Flight (34, "Hay Smith", "NewSky", 344.99, 3.9f, false));
		flightList.add(new Flight(37, "Henry Fofft", "CapitalHeight", 644.99, 4.5f, true));
		flightList.add(new Flight(45, "Wess Low", "CloudNine", 299.99, 4.1f, true));
		flightList.add(new Flight(64, "Jack Hamer", "AlpahaLines", 239.99, 3.8f, true));
		flightList.add(new Flight(57, "Gary Moss", "CloudNine", 319.99, 4.1f, false));
		flightList.add(new Flight(63, "Monroe Wilson", "NewSky", 399.99, 4.4f, true));
		flightList.add(new Flight(96, "Jesse Moreno", "CapitalHeight", 445.99, 4.4f, false));

		//now let's try and sort
		Collections.sort(flightList);
		// now let's syso with a method in another class, ok great Collections knows to compare by id since we overrid
		PrintIteration.printList(flightList);
		System.out.println("Table Above: Sort by ID" + "\n\n\n");
		//next we should utilize Comparator functional interface and Lambda to override compareTo here in main, syso
		
		Collections.sort(flightList, new FlightNameComparator());
		PrintIteration.printList(flightList);
		System.out.println("Table Above: Sort by Name" + "\n\n\n");
		//we use lambda for the rest of the sortings
		//Sort by manufactureName
		Collections.sort(flightList,(Flight f1, Flight f2) -> {
		String m1 = f1.getManufactureName();
		String m2 = f2.getManufactureName();
		return m1.compareTo(m2);
		});
		
		PrintIteration.printList(flightList); //it should sort by manufactureName
		System.out.println("Table Above: Sort by Manufacturer's Name" + "\n\n\n");
		
		//sort by cost
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			Double d1 = f1.getCost();
			Double d2 = f2.getCost();
			return d1.compareTo(d2);
		});
		PrintIteration.printList(flightList);
		System.out.println("Table Above: Sort by Cost" + "\n\n\n");
		
		//sort by rating and if rating is the same then sort by cost (low -> high)
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			int j;
			Float fl1 = f1.getRating();
			Float fl2 = f2.getRating();
			j = fl2.compareTo(fl1);
			if(j == 0) {
				Double d1 = f1.getCost();
				Double d2 = f2.getCost();
				return d2.compareTo(d1);
			}
			else {
				return j;
			}
		});
		PrintIteration.printList(flightList);
		System.out.println("Table Above: Sort by Rating (High to Low) and Cost (High to Low)" + "\n\n\n");
		
		//sort by availability
		Collections.sort(flightList, (Flight f1, Flight f2) -> {
			Boolean b1 = f1.isAvailability();
			Boolean b2 = f2.isAvailability();
			return b2.compareTo(b1);
		});
		PrintIteration.printList(flightList);
		System.out.println("Table Above: Sort by Availability");
	}

}
