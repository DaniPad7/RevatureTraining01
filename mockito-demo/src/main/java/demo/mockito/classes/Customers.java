package demo.mockito.classes;

import java.util.List;

import demo.mockito.interfaces.Item;

public class Customers {
	String name;
	List<Item> listOfItems;
	
	
	public int calculateBill() {
		int total = 0;
		for(Item item : listOfItems) {
			total += item.getPrice(item.getName());
		}
		return total;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Item> getListOfItems() {
		return listOfItems;
	}
	
	public void setListOfItems(List<Item> listOfItems) {
		this.listOfItems = listOfItems;
	}

}
