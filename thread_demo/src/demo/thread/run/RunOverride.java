package demo.thread.run;

import demo.thread.classes.Pages;
import demo.thread.classes.Printer;

public class RunOverride implements Runnable{
	//add user field
	int user;
	//Constructor time
	public RunOverride(Pages page1,Pages page2, int user) {
		this.page1 = page1;
		this.page2 = page2;
		this.user = user;
	}

	Pages page1;
	Pages page2;
	
	
	
	@Override
	public void run() {
		//we do something with this override, how about we add the Printer behaviours here but let's make them static
		
		Printer.setPrint(page1, page2); //ok it is asking for reference variables ok no problem we can import
		System.out.println("Also this is user " + user);
		Printer.printTime(page1, page2);
		System.out.println("Also this is user " + user);
		
		
	}

}
