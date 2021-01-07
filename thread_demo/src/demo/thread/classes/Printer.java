package demo.thread.classes;

public class Printer {
	//ok let's give this printer some behaviors through methods
	
	
	//this could use some parameters
	public static void printTime(Pages page1, Pages page2) { //the parameters make sense, now let's create the class
		System.out.println("Printing Page  " + page1.getContent());
		
		System.out.println("Printing Page  " + page2.getContent());//ok we have reference variables for Pages objects here
	}
	
	//let's give it one more behaviour
	public static void setPrint(Pages page1,Pages page2) {
		System.out.println("Set page " + page1.getContent() + " in the queue");
		
		System.out.println("Set page " + page2.getContent() + " in the queue"); //the get content is ok because it is coupled in RunOverride
		
	}

	
	
	
}
