package demo.mockito.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import demo.mockito.classes.Customers;
import demo.mockito.interfaces.Item;
import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class CustomerBillTest {
	
	Customers c1;
	
	@Before
	public void setup() {
		c1 = new Customers();
		c1.setName("John");
		List<Item> listOfItems = new ArrayList<Item>();
		
		//this creates mock objects of the item class which comes from the interface
		Item i1 = Mockito.mock(Item.class);
		Item i2 = Mockito.mock(Item.class);
		Item i3 = Mockito.mock(Item.class);
		listOfItems.add(i1);
		listOfItems.add(i2);
		listOfItems.add(i3);
		
		//this initializes the mock objects
		c1.setListOfItems(listOfItems);
		when(i1.getName()).thenReturn("Rice");
		when(i2.getName()).thenReturn("Tea");
		when(i3.getName()).thenReturn("Wheat");
		when(i1.getPrice("Rice")).thenReturn(100);
		when(i2.getPrice("Tea")).thenReturn(200);
		when(i3.getPrice("Wheat")).thenReturn(300);
		}
	
	@Test
	public void test_Customer_CalculateBill() { 
		/*there we go this is the test and it was done with mock objects, we don't have to retrive form a database
	for our functions. Also no need for a jUnit test case file but we utilize a java class */
		int billAmount = c1.calculateBill();
		assertEquals(600, billAmount);
	}

}
