package Day04_Week_01_Objects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day_04_Week01 {
	public static void main(String[] args) {
		
		ValidationPage vp = new ValidationPage();
		
		
		//Create a Custom Checked exception if the entered DL is valid or not.
		try {
			if (vp.isValidDLN("12345679")) {
				System.out.println("The DLN is valid.");
			}
			} catch (InvalidDLNException e){
				System.out.println(e.getMessage());
			}
		
		
		//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not java_examples\exceptions_demo\src\custom_demo
		try {
			if (vp.isValidPassportNum("h9r8er9hfe9w7UIHDODGB89789g7gvuyg89BYBUBB")) {
				System.out.println("The Passport number is valid.");
			}
		} catch (PassportNumException e1) {
			System.out.println(e1.getMessage());
		}
	
		
		//Complete Address, Player and Team \java_examples\inheritance_demo\src\eg2
		//Address later
		Project p1 = new Project(9000, "Abc Corp", "Abc Corp Some Client");
		Address permanentAddress1  = new Address(718, "Parrdrive Ave", "Houston", 72473);
		Address presentAddress1 = new Address(473,"Beachway Drive", "Miami", 47593);
		Employee e1 = new  Employee(100, "Sachin", "Manager", 23333.44,p1, permanentAddress1, presentAddress1);
		System.out.println("e1");
		System.out.println(e1);
		
		Address permanentAddress2  = new Address(5765, "Longway Ave", "Austin", 72456);
		Address presentAddress2 = new Address(543,"Runway Drive", "New York", 67453);
		Employee e2 = new Employee(101, "Richard", "Associate", 2000.33,p1, permanentAddress2, presentAddress2);
		System.out.println("e2");
		System.out.println(e2);
		
		Project p2 = new Project(9001, "SMS", "Revature");
		Address permanentAddress3  = new Address(5433, "Huneyroad Ave", "Seattle", 86455);
		Address presentAddress3 = new Address(732,"Berryroad Drive", "San Diego", 93564);
		Employee e3 = new Employee(102, "Tushar", "Manager", 33000.33, p2, permanentAddress3, presentAddress3);
		System.out.println("e3");
		System.out.println(e3);
		
		
		//Task1)Try to play around with all the methods shown above
		List <Integer> l1 = new LinkedList<>(); //imported java.util
		l1.add(4);
		System.out.println(l1);
		System.out.println(l1.contains(4));
		l1.set(0, 5);
		System.out.println(l1.isEmpty());
		
		
		//Task2)Repeat the arrays problems given earlier here using Lists
		List <Integer> ar1 = new LinkedList<>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		ar1.add(6);
		ar1.add(7);
		ar1.add(8);
		ar1.add(9);
		
		//Reverse order
		Collections.reverse(ar1);//import Collections package java.util
		System.out.println(ar1);
		
		//Delete specific element
		ar1.remove(3);
		System.out.println(ar1);
		
		//Place odds and evens in their own arrays.
		List<Integer> arEven = new  LinkedList<>();
		List<Integer> arOdd = new LinkedList<>();
		//arEven =  ar1.listIterator().next().divideUnsigned(ar1.indexOf(), 2);
		
			
		
		
		ar1.listIterator().next();
		//Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
		int ar1Max = Integer.MAX_VALUE;
		System.out.println(ar1Max);
		
		//Find the minimum and the maximum element in an array
	//	Integer arEvenMax = arEven.listIterator().next().divideUnsigned(dividend, divisor);
		System.out.println(ar1Max);
		
		//Find all Palindrome numbers in an array 
		
		
	}
	//Task3)Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them java_examples\list_demos\src\eg1\Demo1.java
Queue <Integer> ar4 = new LinkedList<Integer>();
PriorityQueue <Float> ar5 = new PriorityQueue<Float>();
}
